package org.oc.escalade.business.interf;

import java.util.List;

import org.oc.escalade.modele.Secteur;
import org.oc.escalade.modele.Topo;

public interface SecteurService {
	
	public List<Secteur>findAll();
	public Secteur findSecteur( int Id);
	public void addSecteur(Secteur secteur);
	public void editSecteur (Secteur secteur,int id);
	public void deleteSecteur(int id);

}
