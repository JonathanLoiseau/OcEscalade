package org.oc.escalade.consumer.interf;

import java.util.List;

import org.oc.escalade.modele.Commentaire;
import org.oc.escalade.modele.Secteur;

public interface DaoCommentaire {
	public List<Commentaire>findAll();
	public Commentaire findCommentaire( int id);
	public void addCommentaire(Commentaire comm);
	public void editCommentaire (Commentaire comm,int id);
	public void deleteCommentaire(int id);
}
