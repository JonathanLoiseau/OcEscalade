package org.oc.escalade.business.impl;

import java.util.List;

import org.oc.escalade.business.interf.ReservationService;
import org.oc.escalade.consumer.interf.DaoReservation;
import org.oc.escalade.modele.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("reservationService")
public class ReservationServiceImpl implements ReservationService {

	@Autowired 
	DaoReservation daoRes;
	@Override
	public List<Reservation> findAll() {
		List<Reservation>res = daoRes.findAll();
		return res;
	}

	@Override
	public Reservation findReservation(int id) {
		Reservation res = daoRes.findReservation(id);
		return res;
	}

	@Override
	public void addReservation(Reservation res) {
		daoRes.addReservation(res);
		
	}

	@Override
	public void editReservation(Reservation res, int id) {
		daoRes.editReservation(res, id);
		
	}

	@Override
	public void deleteReservation(int id) {
		daoRes.deleteReservation(id);
		
	}

}
