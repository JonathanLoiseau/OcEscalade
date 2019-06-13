package org.oc.escalade.consumer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Qualifier("utilDao")
public class DaoUtilisateurImpl implements DaoUtilisateur {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Utilisateur> findAll(){
		List<Utilisateur> users = jdbcTemplate.query("select*from \"OcEscalade\".\"Utilisateur\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return users;
	}


	@Override
	public Utilisateur findUtil( int UtilId) {
		Utilisateur util = (Utilisateur) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Utilisateur\" where id = ? ",
				new Object [] {UtilId},
				new BeanPropertyRowMapper(Utilisateur.class));
		return util;
	}


	@Override
	public void addUtil(Utilisateur util) {
		jdbcTemplate.update("insert into \"OcEscalade\".\"Utilisateur\" (name,firstname,username,password)\r\n" + 
				"values (?,?,?,?);", util.getName(),util.getFirstname(),util.getUsername(),util.getPassword());
		
	}


	@Override
	public void editUtil(Utilisateur util,int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Utilisateur\" set name = ?,firstname = ?,username = ?,password=? where id = ?"
		,util.getName(),util.getFirstname(),util.getUsername(),util.getPassword(),id);
		
	}


	@Override
	public void deleteUtil(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Utilisateur\" where id = ?", id);
		
	}
	
		
		
	}


