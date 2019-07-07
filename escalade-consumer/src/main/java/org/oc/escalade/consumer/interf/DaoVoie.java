package org.oc.escalade.consumer.interf;

import java.util.List;
import org.oc.escalade.modele.Utilisateur;
import org.oc.escalade.modele.Voie;

public interface DaoVoie {

	public List<Voie>findAll();
	public Voie findVoie( int voieId);
	public void addVoie(Voie voie);
	public void editVoie (Voie voie,int id);
	public void deleteVoie(int id);
}
