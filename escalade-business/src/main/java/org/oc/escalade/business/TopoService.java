package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.modele.Topo;

public interface TopoService {

	public List<Topo>findAll();
	public Topo findTopo( int id);
	public void addTopo(Topo topo);
	public void editTopo (Topo topo,int id);
	public void deleteTopo(int id);
}
