package org.oc.escalade.business;

import java.util.List;
import org.oc.escalade.consumer.DaoUtilisateur;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("utilService")
public class UtilServiceImpl implements UtilService{

	@Autowired
	DaoUtilisateur daoUtil;
	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> users =daoUtil.findAll();
		return users;
	}

	@Override
	public Utilisateur findUtil(int UtilId) {
		Utilisateur user = daoUtil.findUtil(UtilId);
		return user;
	}

	@Override
	public void addUtil(Utilisateur util) {
		daoUtil.addUtil(util);
		
	}

	@Override
	public void editUtil(Utilisateur util,int id) {
		daoUtil.editUtil(util, id);
		
	}

	@Override
	public void deleteUtil(int id) {
		daoUtil.deleteUtil(id);
		
	}

}
