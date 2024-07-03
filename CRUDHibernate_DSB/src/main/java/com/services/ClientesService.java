package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ClientesDAO;
import com.entity.Clientes;
import com.general.Status;

@Path("Clientes")
public class ClientesService {
	
	Clientes cliente = null;
	ClientesDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_DSB/CRUDHibernate_DSB/Clientes/mostrar
	public List<Clientes> mostrar(){
		dao = new ClientesDAO();
		return dao.mostrar();
	}
	
	
	@Path("guardar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_DSB/CRUDHibernate_DSB/Clientes/guardar
	public Status guardar(Clientes c) {
		Status s = new Status();
		s.setOb(c);
		
		dao = new ClientesDAO();
		String resultado = dao.guardar(c);
		
		if(resultado.contentEquals("1")) {
			s.setMensaje("Guardado Exitosamente");
			s.setRespuesta(resultado);
		}else { 
			s.setMensaje("No fue posible guardar");
			s.setRespuesta(resultado);
		}
		return s;		
	}
	
	@Path("eliminar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_DSB/CRUDHibernate_DSB/Clientes/elimnar/id
	public Status eliminar(@PathParam ("id")int id) {
		Status s = new Status();
		s.setOb(id);
		
		dao = new ClientesDAO();
		String resultado = dao.eliminar(id);
		
		if(resultado.contentEquals("1")) {
			s.setMensaje("Eliminado Exitosamente");
			s.setRespuesta(resultado);
		}else { 
			s.setMensaje("No fue posible eliminar");
			s.setRespuesta(resultado);
		}
		return s;		
	}
	
	@Path("editar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_DSB/CRUDHibernate_DSB/Clientes/editar
	public Status editar(Clientes c) {
		Status s = new Status();
		s.setOb(c);
		
		dao = new ClientesDAO();
		String resultado = dao.editar(c);
		
		if(resultado.contentEquals("1")) {
			s.setMensaje("Editado Exitosamente");
			s.setRespuesta(resultado);
		}else { 
			s.setMensaje("No fue posible actualizar este registro");
			s.setRespuesta(resultado);
		}
		return s;		
	}
	
	@Path("buscar/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	//http://localhost:8090/CRUDHibernate_DSB/CRUDHibernate_DSB/Clientes/buscar/id
	public Clientes buscar(@PathParam ("id")int id) {
		dao = new ClientesDAO();
		
		return (Clientes) dao.buscar(id);
	}
	
}
