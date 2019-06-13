package org.oc.escalade.consumer;

import java.util.List;

import javax.sql.DataSource;

import org.oc.escalade.modele.Commentaire;
import org.oc.escalade.modele.Topo;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class DaoCommentaireImpl implements DaoCommentaire{

	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Commentaire> findAll() {
		List<Commentaire> comm = jdbcTemplate.query("select*from \"OcEscalade\".\"Commentaire\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return comm;		
	}

	@Override
	public Commentaire findCommentaire(int id) {
		Commentaire comment = (Commentaire) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Commentaire\" where id = ? ",
				new Object [] {id},
				new BeanPropertyRowMapper(Utilisateur.class));
		return comment;
	}

	@Override
	public void addCommentaire(Commentaire comm) {
		jdbcTemplate.update("insert into \"OcEscalade\".\"Commentaire\" (comment,topo_id,user_id)\r\n" + 
				"values (?,?,?);", comm.getCommentaire(),comm.getTopo_id(),comm.getUser_id());
		
	}

	@Override
	public void editCommentaire(Commentaire comm, int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Commentaire\" set comment = ?,topo_id = ?,user_id = ? where id = ?"
				,comm.getCommentaire(),comm.getTopo_id(),comm.getUser_id(),id);
		
	}

	@Override
	public void deleteCommentaire(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Commentaire\" where id = ?", id);
		
	}

}
