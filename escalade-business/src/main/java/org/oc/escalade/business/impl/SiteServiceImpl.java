package org.oc.escalade.business.impl;

import java.util.List;

import org.oc.escalade.business.interf.SiteService;
import org.oc.escalade.consumer.interf.DaoSite;
import org.oc.escalade.modele.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("serviceSite")
public class SiteServiceImpl implements SiteService{

	@Autowired
	DaoSite daoSite;
	@Override
	public List<Site> findAll() {
		List<Site>listSite=daoSite.findAll();
		return listSite;
	}

	@Override
	public Site findSite(int id) {
		Site site = daoSite.findSite(id);
		return site;
	}

	@Override
	public void addSite(Site site) {
		daoSite.addSite(site);
		
	}

	@Override
	public void editSite(Site site, int id) {
		daoSite.editSite(site, id);
		
	}

	@Override
	public void deleteSite(int id) {
		daoSite.deleteSite(id);
		
	}

}
