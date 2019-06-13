package org.oc.escalade.modele;

import java.sql.Date;
import java.sql.Timestamp;

public class Topo {

	private String name;
	private String description;
	private Date dateDeCreation;
	private Commentaire commentaire;
	private Etat etat;
	
	public Topo() {
		
	}
	
	public Topo ( String nom, String description,Date date) {
		this.name=nom;
		this.description = description;
		this.dateDeCreation=date;
	}
	
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public String getName() {
		return name;
	}
	public void setName(String nom) {
		this.name = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public Commentaire getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
}
