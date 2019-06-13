package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.consumer.DaoVoie;
import org.oc.escalade.modele.Voie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("voieService")
public class VoieServiceImpl implements VoieService {

	@Autowired
	DaoVoie daoVoie;
	@Override
	public List<Voie> findAll() {
		List<Voie>voies= daoVoie.findAll();
		return voies;
	}

	@Override
	public Voie findVoie(int voieId) {
		Voie voie = daoVoie.findVoie(voieId);
		return voie;
	}

	@Override
	public void addVoie(Voie voie) {
		daoVoie.addVoie(voie);
		
	}

	@Override
	public void editVoie(Voie voie, int id) {
		daoVoie.editVoie(voie, id);
		
	}

	@Override
	public void deleteVoie(int id) {
		daoVoie.deleteVoie(id);
		
	}

}
