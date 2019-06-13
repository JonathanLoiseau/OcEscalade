package org.oc.escalade.modele;

import java.util.ArrayList;

public class Site {

	private String nom;
	private ArrayList <Secteur> secteur;
	private int topo_id;
	
	public Site() {
		
	}
	
	public Site( String nom, int id) {
		this.nom=nom;
		this.topo_id=id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Secteur> getSecteur() {
		return secteur;
	}
	public void setSecteur(ArrayList<Secteur> secteur) {
		this.secteur = secteur;
	}
	public int getTopo_id() {
		return topo_id;
	}
	public void setTopo_id(int topo_id) {
		this.topo_id = topo_id;
	}
}
