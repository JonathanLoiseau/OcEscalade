package org.oc.escalade.modele;

public class Voie {
	
	private int height;
	private String cotation;
	private int nbPoint;
	private String name;
	private int secteur_ID;
		
	

	public Voie(){
		
	}
	
	public Voie(String nom, int hauteur, String cotation, int nbPoint,int sectID) {
	this.name = nom;
	this.height = hauteur;
	this.cotation = cotation;
	this.nbPoint=nbPoint;
	this.secteur_ID=sectID;
	
			
	}
	
	public int getSecteur_ID() {
		return secteur_ID;
	}

	public void setSecteur_ID(int secteur_ID) {
		this.secteur_ID = secteur_ID;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int hauteur) {
		this.height = hauteur;
	}
	public String getCotation() {
		return cotation;
	}
	public void setCotation(String cotation) {
		this.cotation = cotation;
	}
	public int getNbPoint() {
		return nbPoint;
	}
	public void setNbPoint(int nbPoint) {
		this.nbPoint = nbPoint;
	}
	public String getName() {
		return name;
	}
	public void setName(String nom) {
		this.name = nom;
	}
	@Override
	public String toString() {
		return "Voie [name=" + name + ", height=" + height + ",cotation=" + cotation + ", nbPoint=" + nbPoint + "]";
	}
	
}
