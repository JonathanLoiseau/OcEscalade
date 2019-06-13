package org.oc.escalade.business;

import java.util.List;

import org.oc.escalade.consumer.DaoTopo;
import org.oc.escalade.modele.Topo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("topoService")
public class TopoServiceImpl implements TopoService{

	@Autowired
	DaoTopo daoTopo;
	
	@Override
	public List<Topo> findAll() {
		List<Topo> topoList = daoTopo.findAll();
		return topoList;
	}

	@Override
	public Topo findTopo(int id) {
		Topo topo = daoTopo.findTopo(id);
		return topo;
	}

	@Override
	public void addTopo(Topo topo) {
		daoTopo.addTopo(topo);
		
	}

	@Override
	public void editTopo(Topo topo, int id) {
		daoTopo.editTopo(topo, id);
		
	}

	@Override
	public void deleteTopo(int id) {
		daoTopo.deleteTopo(id);
		
	}

}
