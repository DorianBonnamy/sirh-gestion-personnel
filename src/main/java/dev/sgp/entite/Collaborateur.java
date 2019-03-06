package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private static int id = 0;
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate birthdate;
	private String adresse;
	private String numSecuSocial;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateTime;
	private boolean actif;
	
	public Collaborateur(String nom, String prenom, LocalDate birthdate, String adresse,String numSecuSocial) {
		this.matricule = "M"+this.id++;
		this.nom = nom;
		this.prenom = prenom;
		this.birthdate = birthdate;
		this.adresse = adresse;
		this.numSecuSocial = numSecuSocial;
		this.emailPro = prenom+"."+nom+"@societe.com";
		this.photo = "https://i.lensdump.com/i/nuAIT.jpg";
		this.dateTime = ZonedDateTime.now();
		this.actif = true;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumSecuSocial() {
		return numSecuSocial;
	}
	public void setNumSecuSocial(String numSecuSocial) {
		this.numSecuSocial = numSecuSocial;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(ZonedDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
}
