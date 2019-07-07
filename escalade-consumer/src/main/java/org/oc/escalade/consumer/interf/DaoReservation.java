package org.oc.escalade.consumer.interf;

import java.util.List;

import org.oc.escalade.modele.Reservation;
import org.oc.escalade.modele.Secteur;

public interface DaoReservation {
	public List<Reservation>findAll();
	public Reservation findReservation( int id);
	public void addReservation(Reservation res);
	public void editReservation (Reservation res,int id);
	public void deleteReservation(int id);


}
