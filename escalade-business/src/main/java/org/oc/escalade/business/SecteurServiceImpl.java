package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.consumer.DaoSecteur;
import org.oc.escalade.modele.Secteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("serviceSecteur")
public class SecteurServiceImpl implements SecteurService{

	@Autowired
	DaoSecteur daoSecteur;
	
	@Override
	public List<Secteur> findAll() {
		List<Secteur> secteur = daoSecteur.findAll();
		return secteur;
	}

	@Override
	public Secteur findSecteur(int Id) {
		Secteur secteur = daoSecteur.findSecteur(Id);
		return secteur;
	}

	@Override
	public void addSecteur(Secteur secteur) {
		daoSecteur.addSecteur(secteur);
		
	}

	@Override
	public void editSecteur(Secteur secteur, int id) {
	daoSecteur.editSecteur(secteur, id);
		
	}

	@Override
	public void deleteSecteur(int id) {
		daoSecteur.deleteSecteur(id);
		
	}

}
