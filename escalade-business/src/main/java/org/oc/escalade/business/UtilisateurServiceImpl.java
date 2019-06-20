package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.consumer.DaoUtilisateur;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("serviceUtilisateur")
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	DaoUtilisateur daoUtilisateur;
	
	
	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> user = daoUtilisateur.findAll();
		return user;
	}

	@Override
	public Utilisateur findUtil(int UtilId) {
		Utilisateur user=daoUtilisateur.findUtil(UtilId);
		return user;
	}

	@Override
	public void addUtil(Utilisateur util) {
		daoUtilisateur.addUtil(util);
		
	}

	@Override
	public void editUtil(Utilisateur util, int id) {
		daoUtilisateur.editUtil(util, id);
		
	}

	@Override
	public void deleteUtil(int id) {
		daoUtilisateur.deleteUtil(id);
		
	}

}
