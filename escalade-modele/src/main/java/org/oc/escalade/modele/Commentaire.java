package org.oc.escalade.modele;

public class Commentaire {
	private String commentaire;
	private int topo_id;
	private int user_id;
	
	public Commentaire() {
		
	}
	
	public Commentaire(String comm, int topoId,int userId) {
		this.commentaire=comm;
		this.topo_id=topoId;
		this.user_id =userId;
	}

	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String comment) {
		this.commentaire = comment;
	}
	public int getTopo_id() {
		return topo_id;
	}
	public void setTopo_id(int topo_id) {
		this.topo_id = topo_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}
