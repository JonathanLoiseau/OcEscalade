package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.modele.Voie;

public interface VoieService {

	public List<Voie>findAll();
	public Voie findVoie( int voieId);
	public void addVoie(Voie voie);
	public void editVoie (Voie voie,int id);
	public void deleteVoie(int id);

}
