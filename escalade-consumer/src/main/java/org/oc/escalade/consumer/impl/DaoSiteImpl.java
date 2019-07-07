package org.oc.escalade.consumer.impl;

import java.util.List;

import javax.sql.DataSource;

import org.oc.escalade.consumer.interf.DaoSite;
import org.oc.escalade.modele.Site;
import org.oc.escalade.modele.Topo;
import org.oc.escalade.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Qualifier("daoSite")
public class DaoSiteImpl implements DaoSite {

	@Autowired
	DataSource dataSource ;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Site> findAll() {
		List<Site> site = jdbcTemplate.query("select*from \"OcEscalade\".\"Site\"",
				new BeanPropertyRowMapper(Utilisateur.class) );
		return site;
		
	}

	@Override
	public Site findSite(int id) {
		Site site = (Site) jdbcTemplate.queryForObject ("Select* from \"OcEscalade\".\"Site\" where id = ? ",
				new Object [] {id},
				new BeanPropertyRowMapper(Utilisateur.class));
		return site;
		
	}

	@Override
	public void addSite(Site site) {
		
		jdbcTemplate.update("insert into \"OcEscalade\".\"Site\" (name,topo_id)\r\n" + 
				"values (?,?);", site.getNom(),site.getTopo_id());
	}

	@Override
	public void editSite(Site site, int id) {
		jdbcTemplate.update("update \"OcEscalade\".\"Site\" set name = ?,topo_id = ? where id = ?"
				,site.getNom(),site.getTopo_id(),id);
		
	}

	@Override
	public void deleteSite(int id) {
		jdbcTemplate.update("delete from \"OcEscalade\".\"Site\" where id = ?", id);	
		
	}
		
}
