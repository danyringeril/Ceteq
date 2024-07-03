package com.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.OrdenesDAO;
import com.entity.Ordenes;

@Path("ordenes")
public class OrdenesService {
	
	OrdenesDAO dao = null;
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("mostrar")
	//http://localhost:8090/CRUDHibernate_DSB/CRUDHibernate_DSB/ordenes/mostrar
	public List<Ordenes>mostrar(){
		dao = new OrdenesDAO();
		return dao.mostrar();
		
		
	}

}
