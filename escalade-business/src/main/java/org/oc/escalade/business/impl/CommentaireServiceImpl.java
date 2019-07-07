package org.oc.escalade.business.impl;

import java.util.List;

import org.oc.escalade.business.interf.CommentaireService;
import org.oc.escalade.consumer.interf.DaoCommentaire;
import org.oc.escalade.modele.Commentaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("serviceCommentaire")
public class CommentaireServiceImpl implements CommentaireService {
	@Autowired
	DaoCommentaire daoCommentaire;

	@Override
	public List<Commentaire> findAll() {
		List<Commentaire>comment=daoCommentaire.findAll();
		return comment;
	}

	@Override
	public Commentaire findCommentaire(int id) {
		Commentaire comment = daoCommentaire .findCommentaire(id);
		return comment;
	}

	@Override
	public void addCommentaire(Commentaire comm) {
		daoCommentaire.addCommentaire(comm);
		
	}

	@Override
	public void editCommentaire(Commentaire comm, int id) {
		daoCommentaire.editCommentaire(comm, id);
		
	}

	@Override
	public void deleteCommentaire(int id) {
		daoCommentaire .deleteCommentaire(id);
		
	}
	
	

}
