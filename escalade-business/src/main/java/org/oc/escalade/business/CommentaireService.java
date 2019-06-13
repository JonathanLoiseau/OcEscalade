package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.modele.Commentaire;

public interface CommentaireService {
	public List<Commentaire>findAll();
	public Commentaire findCommentaire( int id);
	public void addCommentaire(Commentaire comm);
	public void editCommentaire (Commentaire comm,int id);
	public void deleteCommentaire(int id);
}
