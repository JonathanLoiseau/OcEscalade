package org.oc.escalade.consumer.impl;

import java.util.List;

import javax.sql.DataSource;

import org.oc.escalade.consumer.interf.DaoTopo;
import org.oc.escalade.modele.Topo;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
@Qualifier("topoDao")
public class DaoTopoImpl implements DaoTopo{

	@Autowired 
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Topo> findAll() {
		List<Topo> topo = jdbcTemplate.query("select*from \"OcEscalade\".\"Topo\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return topo;
	}
	@Override
	public Topo findTopo(int id) {
		Topo topo = (Topo) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Topo\" where id = ? ",
				new Object [] {id},
				new BeanPropertyRowMapper(Utilisateur.class));
		return topo;
		
	}
	@Override
	public void addTopo(Topo topo) {
		jdbcTemplate.update("insert into \"OcEscalade\".\"Topo\" (name,description,date)\r\n" + 
				"values (?,?,?);", topo.getName(), topo.getDescription(),topo.getDateDeCreation());
		
		
	}
	@Override
	public void editTopo(Topo topo, int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Topo\" set name = ?,description = ?,date = ? where id = ?"
				,topo.getName(),topo.getDescription(),topo.getDateDeCreation(),id);
		
	}
	@Override
	public void deleteTopo(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Topo\" where id = ?", id);
		
	}
	
	

}
