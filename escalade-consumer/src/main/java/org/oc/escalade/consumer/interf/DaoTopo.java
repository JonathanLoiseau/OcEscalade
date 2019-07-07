package org.oc.escalade.consumer.interf;

import java.util.List;

import org.oc.escalade.modele.Topo;

public interface DaoTopo {
	
	public List<Topo>findAll();
	public Topo findTopo( int Id);
	public void addTopo(Topo topo);
	public void editTopo (Topo topo,int id);
	public void deleteTopo(int id);
}
