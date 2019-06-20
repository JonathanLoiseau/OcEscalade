package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.modele.Utilisateur;

public interface UtilisateurService {

	public List<Utilisateur>findAll();
	public Utilisateur findUtil( int UtilId);
	public void addUtil(Utilisateur util);
	public void editUtil (Utilisateur util,int id);
	public void deleteUtil(int id);
}
