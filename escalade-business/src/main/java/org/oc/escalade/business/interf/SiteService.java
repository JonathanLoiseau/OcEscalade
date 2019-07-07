package org.oc.escalade.business.interf;

import java.util.List;

import org.oc.escalade.modele.Site;

public interface SiteService {

	public List<Site>findAll();
	public Site findSite( int id);
	public void addSite(Site site);
	public void editSite (Site site,int id);
	public void deleteSite(int id);
}
