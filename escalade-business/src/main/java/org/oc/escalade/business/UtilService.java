package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.modele.Utilisateur;

public interface UtilService {

	public List<Utilisateur>findAll();
	public Utilisateur findUtil( int utilId);
	public void addUtil(Utilisateur util);
	public void editUtil (Utilisateur util,int id);
	public void deleteUtil(int id);
}
