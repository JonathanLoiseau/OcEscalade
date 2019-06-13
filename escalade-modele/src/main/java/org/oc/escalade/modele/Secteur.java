package org.oc.escalade.modele;

import java.util.ArrayList;

public class Secteur {
	private String nom;
	private ArrayList<Voie> voies;
	private int site_id;
	
	public Secteur () {
		
	}
	
	public Secteur(String nom,int id) {
		this.nom=nom;
		this.site_id=id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Voie> getVoies() {
		return voies;
	}
	public void setVoies(ArrayList<Voie> voies) {
		this.voies = voies;
	}
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}
	
}
