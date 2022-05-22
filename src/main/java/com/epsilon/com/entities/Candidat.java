package com.epsilon.com.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Candidat implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String date;
	private String email;
	private String civilite;
	private String prenom;
	private String nom;
	private String date_de_naissance;
	private String lieu_de_naissance;
	private String adresse_actuelle;
	private String telephone;
	private String telephone_fixe;
	private String prenom_nom_tuteur;
	private String telephone_tuteur;
	private String lien_de_parente;
	private String status_actuelle;
	private String niveau;
	private String filiere;

	public Candidat(String date, String email, String civilite, String prenom, String nom, String date_de_naissance,
			String lieu_de_naissance, String adresse_actuelle, String telephone, String telephone_fixe,
			String prenom_nom_tuteur, String telephone_tuteur, String lien_de_parente, String status_actuelle,
			String niveau, String filiere) {
		super();
		this.date = date;
		this.email = email;
		this.civilite = civilite;
		this.prenom = prenom;
		this.nom = nom;
		this.date_de_naissance = date_de_naissance;
		this.lieu_de_naissance = lieu_de_naissance;
		this.adresse_actuelle = adresse_actuelle;
		this.telephone = telephone;
		this.telephone_fixe = telephone_fixe;
		this.prenom_nom_tuteur = prenom_nom_tuteur;
		this.telephone_tuteur = telephone_tuteur;
		this.lien_de_parente = lien_de_parente;
		this.status_actuelle = status_actuelle;
		this.niveau = niveau;
		this.filiere = filiere;
	}

	public Candidat() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(String date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public String getLieu_de_naissance() {
		return lieu_de_naissance;
	}

	public void setLieu_de_naissance(String lieu_de_naissance) {
		this.lieu_de_naissance = lieu_de_naissance;
	}

	public String getAdresse_actuelle() {
		return adresse_actuelle;
	}

	public void setAdresse_actuelle(String adresse_actuelle) {
		this.adresse_actuelle = adresse_actuelle;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone_fixe() {
		return telephone_fixe;
	}

	public void setTelephone_fixe(String telephone_fixe) {
		this.telephone_fixe = telephone_fixe;
	}

	public String getPrenom_nom_tuteur() {
		return prenom_nom_tuteur;
	}

	public void setPrenom_nom_tuteur(String prenom_nom_tuteur) {
		this.prenom_nom_tuteur = prenom_nom_tuteur;
	}

	public String getTelephone_tuteur() {
		return telephone_tuteur;
	}

	public void setTelephone_tuteur(String telephone_tuteur) {
		this.telephone_tuteur = telephone_tuteur;
	}

	public String getLien_de_parente() {
		return lien_de_parente;
	}

	public void setLien_de_parente(String lien_de_parente) {
		this.lien_de_parente = lien_de_parente;
	}

	public String getStatus_actuelle() {
		return status_actuelle;
	}

	public void setStatus_actuelle(String status_actuelle) {
		this.status_actuelle = status_actuelle;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

}
