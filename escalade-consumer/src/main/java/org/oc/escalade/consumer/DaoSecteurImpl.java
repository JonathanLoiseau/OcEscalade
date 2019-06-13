package org.oc.escalade.consumer;

import java.util.List;

import javax.sql.DataSource;

import org.oc.escalade.modele.Secteur;
import org.oc.escalade.modele.Topo;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Qualifier("secteurDao")
public class DaoSecteurImpl implements DaoSecteur{
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public List<Secteur> findAll() {
		List<Secteur> secteur = jdbcTemplate.query("select*from \"OcEscalade\".\"Secteur\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return secteur;
		
	}

	@Override
	public Secteur findSecteur(int id) {
		Secteur secteur = (Secteur) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Secteur\" where id = ? ",
				new Object [] {id},
				new BeanPropertyRowMapper(Utilisateur.class));
		return secteur;
		
	}

	@Override
	public void addSecteur(Secteur secteur) {
		jdbcTemplate.update("insert into \"OcEscalade\".\"Secteur\" (name,site_id)\r\n" + 
				"values (?,?);", secteur.getNom(),secteur.getSite_id());
		
	}

	@Override
	public void editSecteur(Secteur secteur, int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Secteur\" set name = ?,site_id = ? where id = ?"
				,secteur.getNom(),secteur.getSite_id(),id);
		
	}

	@Override
	public void deleteSecteur(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Secteur\" where id = ?",id);
		
	}

}
