package org.oc.escalade.consumer.impl;

import java.util.List;

import javax.sql.DataSource;

import org.oc.escalade.consumer.interf.DaoVoie;
import org.oc.escalade.modele.Utilisateur;
import org.oc.escalade.modele.Voie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Qualifier("voieDao")
public class DaoVoieImpl implements DaoVoie {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Voie> findAll() {
		List<Voie> voies = jdbcTemplate.query("select*from \"OcEscalade\".\"Voie\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return voies;
		
	}

	@Override
	public Voie findVoie(int voieId) {
		Voie voie = (Voie) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Voie\" where id = ? ",
				new Object [] {voieId},
				new BeanPropertyRowMapper(Voie.class));
		return voie;
		
	}

	@Override
	public void addVoie(Voie voie) {
		jdbcTemplate.update("insert into \"OcEscalade\".\"Voie\" (name,height,cotation,nb_point,secteur_id)\r\n" + 
				"values (?,?,?,?,?);", voie.getName(),voie.getHeight(),voie.getCotation(),voie.getNbPoint(),voie
				.getSecteur_ID());
		
		
	}

	@Override
	public void editVoie(Voie voie, int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Voie\" set name = ?,height = ?,cotation = ?,nb_point = ? secteur_id = ?,  where id = ? "
				,voie.getName(),voie.getHeight(),voie.getCotation(),voie.getNbPoint(),voie.getSecteur_ID(),id);
	}

	@Override
	public void deleteVoie(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Voie\" where id = ?", id);
		
	}

}
