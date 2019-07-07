package org.oc.escalade.consumer.interf;

import java.util.List;

import org.oc.escalade.modele.Secteur;
import org.oc.escalade.modele.Site;

public interface DaoSite {
	public List<Site>findAll();
	public Site findSite( int id);
	public void addSite(Site site);
	public void editSite (Site site,int id);
	public void deleteSite(int id);
}
