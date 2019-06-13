package org.oc.escalade.consumer;

import java.util.List;

import org.oc.escalade.modele.Utilisateur;

public interface DaoUtilisateur {
	
	
	public List<Utilisateur>findAll();
	public Utilisateur findUtil( int UtilId);
	public void addUtil(Utilisateur util);
	public void editUtil (Utilisateur util,int id);
	public void deleteUtil(int id);
}
