package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;

public class NouveauCollaborateurController extends HttpServlet {
	// recuperation du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateurs.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] listAttribut = {"nom","prenom","dateNaissance","adresse","numSecurite"};
		HashMap<String, Object> mapAttribut = new HashMap<String, Object>();
		String attributManquant = "";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		for(int i = 0; i < listAttribut.length ; i ++){
			mapAttribut.put(listAttribut[i], req.getParameter(listAttribut[i]));
			if(mapAttribut.get(listAttribut[i]).equals("")){ //Test si le champ est vide ou non
				attributManquant += " "+listAttribut[i]+",";
			}else if(listAttribut[i].equals("nom") || listAttribut[i].equals("prenom") || listAttribut[i].equals("adresse")){ //Test si on agit sur le nom ou prénom
				if(!checkForm(listAttribut[i])){
					attributManquant += " "+listAttribut[i]+",";
				}
			}
		}
		if(attributManquant != ""){
			resp.sendError(400,"Parameter not valid" + new StringBuilder(attributManquant).deleteCharAt(attributManquant.length()-1).toString()); 
		}else{

			collabService.sauvegarderCollaborateur(new Collaborateur((String)mapAttribut.get(listAttribut[0]),
					(String)mapAttribut.get(listAttribut[1]),
					LocalDate.parse((String)mapAttribut.get(listAttribut[2])),
					(String)mapAttribut.get(listAttribut[3]),
					(String)mapAttribut.get(listAttribut[4])));

			resp.sendRedirect("lister");
		}
	}

	private boolean estUnEntier(String chaine) {
		try {
			Integer.parseInt(chaine);
		} catch (NumberFormatException e){
			return false;
		}

		return true;
	}
	
	private boolean checkForm(String chaine){
		if(chaine.matches(".*[/+<>@].*")){//Test caractère spéciaux dans le nom et prénom
			return false;
		}
		return true;
	}
}
