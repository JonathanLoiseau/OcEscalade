package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.modele.Reservation;

public interface ReservationService {
	public List<Reservation>findAll();
	public Reservation findReservation( int id);
	public void addReservation(Reservation res);
	public void editReservation (Reservation res,int id);
	public void deleteReservation(int id);
}
