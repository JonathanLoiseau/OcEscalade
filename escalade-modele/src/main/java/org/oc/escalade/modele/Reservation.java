package org.oc.escalade.modele;

import java.sql.Date;
import java.sql.Timestamp;

public class Reservation {
	
	private Date dateDebut;
	private Date dateFin;
	private int numeroReservation;
	private int user_id;
	private int topo_id;
	
	
	public Reservation() {
		
	}
	public Reservation(int numRes,int user_id,int topo_id,Date debut,Date fin) {
		this.numeroReservation =numRes;
		this.user_id =user_id;
		this.topo_id =topo_id ;
		this.dateDebut =debut;
		this.dateFin=fin;
	}
	
	
	public  int getUser_id() {
		return user_id;
	}

	public  void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public  int getTopo_id() {
		return topo_id;
	}

	public  void setTopo_id(int topo_id) {
		this.topo_id = topo_id;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	
	
	public Date getDateDebut() {
		return dateDebut;
	}
	
	public void setDateDebut(Date date) {
		this.dateDebut = date;
	}
	

}
