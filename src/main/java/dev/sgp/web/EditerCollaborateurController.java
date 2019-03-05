package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		if(matricule == null){
			resp.sendError(400, "url false");
		}else{
			resp.getWriter().write("<h1>Edition de collaborateur</h1><p>Matricule : " + matricule + "</p>");
		}
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		if(matricule == null || titre == null || nom == null || prenom == null){
			String faux = "";
			if(matricule == null){
				faux += " matricule,";
			}
			if(titre == null){
				faux += " titre,";
			}
			if(nom == null){
				faux += " nom,";
			}
			if(prenom == null){
				faux += " prenom,";
			}
			rep.sendError(400,"Parameter not valid" + (new StringBuilder(faux)).deleteCharAt(faux.length()-1).toString());

		}else{
			rep.setStatus(201);
			rep.getWriter().write("<p> matricule : "+ matricule 
					+" & titre : "+ titre 
					+" & nom : "+ nom
					+" & prenom : " + prenom 
					+ "</p>"); 
		}
	}
}
