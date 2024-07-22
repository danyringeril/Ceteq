package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AlumnoDAO;
import com.dto.ObjetoDTO;
import com.entity.Alumno;
import com.general.Status;

@Path("alumnos")
public class AlumnoService {

	/*
	 * Esta clase es donde se le da salida a los datos o incluso entrada de datos,
	 * los presentamos y asi exponemos la funcionalidad del backend.
	 * 
	 * Aqui se generan los endpoints o urls para las peticiones web que ejecutaran
	 * los metodos declarados en esta clase
	 * 
	 * los endpoints se componen de varias partes primera parte del endpoint se
	 * compine por la ip donde se despliega el servidor en este caso Tomcat y el
	 * puerto http://localhost Siguiente parte, se compone de las UrlPattern en el
	 * archivo web.xml http://localhost:8090/nombreProyecto/nombreProyecto Siguiente
	 * parte del endpoint es el nombre o path de la clase
	 * http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/(PathClase)alumnos/
	 * PathDelMetodo
	 * 
	 * Necesitamos una instancia nula de la clase AlumnoDAO para utilizar los
	 * metodos
	 */

	AlumnoDAO dao = null;

	// Comenzamos con la declaracion de los metodos que se ejecutaran a traves de
	// las peticiones HTTP

	@Path("mostrar")
	@GET // Verbo HTTP para recuperar recursos
	@Produces({ MediaType.APPLICATION_JSON }) // Indicamos que producimos info en JASON
	// http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/alumnos/mostrar
	public List<Alumno> mostrar() {
		// Necesitamos inciar el objeto dao en cada metodo
		dao = new AlumnoDAO();
		// Devolvemos la lista que el mismo metodo devuelve
		return dao.mostrar();
	}

	@Path("buscar/{id}")
	@GET // Verbo HTTP para recuperar recursos
	@Produces({ MediaType.APPLICATION_JSON })
	// http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/alumnos/buscar/id
	// Con @pathParam indicamos que ese parametro se envia desde la peticion
	// pero a traves del endpoint o URL
	public Alumno buscar(@PathParam("id") int id) {
		dao = new AlumnoDAO();
		return (Alumno) dao.buscar(id);

	}

	@Path("guardar")
	@POST // Verbo HTTP para publicar o crear nuevos recuersos
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	// http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/alumnos/guardar
	public Status guardar(Alumno a) {

		Status s = new Status();

		s.setOb(a); // Respondemos a traves del objeto Starus con la info que guardemos
		// en la base de datos es decir la devolvemos hacia el frente
		dao = new AlumnoDAO();

		String respuesta = dao.guardar(a);// guardamos la respuesta que recibimos de la
		// ejecucion al intentar guardar un Alumno ("1" o "0")

		// Hacemos una validacion para establecer los otros valores de mi objeto Status

		if (respuesta.equals("1")) {
			s.setMensaje("Alumno inscrito correctamente");
			s.setRespuesta(respuesta);
		} else {
			s.setMensaje("Error");
			s.setRespuesta(respuesta);
		}

		return s;
	}

	@Path("editar")
	@PUT // Verbo HTTP para actualizar recuersos
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	// http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/alumnos/editar
	public Status editar(Alumno a) {

		Status s = new Status();

		s.setOb(a); // Respondemos a traves del objeto Starus con la info que guardemos
		// en la base de datos es decir la devolvemos hacia el frente
		dao = new AlumnoDAO();

		String respuesta = dao.editar(a);// guardamos la respuesta que recibimos de la
		// ejecucion al intentar guardar un Alumno ("1" o "0")

		// Hacemos una validacion para establecer los otros valores de mi objeto Status

		if (respuesta.equals("1")) {
			s.setMensaje("Alumno actualizado correctamente");
			s.setRespuesta(respuesta);
		} else {
			s.setMensaje("Error");
			s.setRespuesta(respuesta);
		}

		return s;
	}

	@Path("eliminar/{id}")
	@DELETE
	@Produces({ MediaType.APPLICATION_JSON })
	// http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/alumnos/eliminar/id
	public Status eliminar(@PathParam("id") int id) {

		Status s = new Status();
		dao = new AlumnoDAO();
		String respuesta = dao.eliminar(id);

		if (respuesta.equals("1")) {
			s.setMensaje("Alumno eliminado correctamente");
			s.setRespuesta(respuesta);
		} else {
			s.setMensaje("Error");
			s.setRespuesta(respuesta);
		}

		return s;

	}

	@GET
	@Path("detalles")
	@Produces({ MediaType.APPLICATION_JSON })
	// http://localhost:8090/JDBCWEB_DSB/JDBCWEB_DSB/alumnos/detalles
	public List<ObjetoDTO> detalles() {

		dao = new AlumnoDAO();

		return dao.detalles();

	}

}
