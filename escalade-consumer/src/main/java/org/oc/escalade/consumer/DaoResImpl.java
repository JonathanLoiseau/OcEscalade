package org.oc.escalade.consumer;

import java.util.List;

import org.oc.escalade.modele.Reservation;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DaoResImpl implements DaoReservation {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Reservation> findAll() {
		List<Reservation> res = jdbcTemplate.query("select*from \"OcEscalade\".\"Reservation\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return res;
		
	}

	@Override
	public Reservation findReservation(int id) {
		Reservation res = (Reservation ) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Reservation\" where id = ? ",
				new Object [] {id},
				new BeanPropertyRowMapper(Utilisateur.class));
		return res;
	}

	@Override
	public void addReservation(Reservation res) {
		jdbcTemplate.update("insert into \"OcEscalade\".\"Reservation\" (res_number,user_id,topo_id,date_debut,date_fin)\r\n" + 
				"values (?,?,?,?,?);", res.getNumeroReservation(),res.getUser_id(),res.getTopo_id(),res.getDateDebut(),res.getDateFin());
		
	}

	@Override
	public void editReservation(Reservation res, int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Reservation\" set res_number = ?,user_id = ?,topo_id = ?,date_debut = ?, date_fin = ? where id = ?"
				,res.getNumeroReservation(),res.getUser_id(),res.getTopo_id(),res.getDateDebut(),res.getDateFin(),id);
	}

	@Override
	public void deleteReservation(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Reservation\" where id = ?", id);
		
	}

}
