package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Clientes;
import com.general.Metodos;

public class ClientesDAO implements Metodos {

	// Cargar los objetos de las clases definidas en el persistence.xml
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");

	// Carga las operaciones CRUD
	EntityManager em = emf.createEntityManager();

	// Declaramos un objeto cliente vacio para poder manipularlo
	Clientes cliente = null;

	@Override
	public String guardar(Object ob) {
		cliente = (Clientes) ob;

		em.getTransaction().begin();
		String resultado = null;

		try {
			em.persist(cliente); // aqui se lleva acabo el insert
			em.getTransaction().commit(); // se realiza el commit en BD
			resultado = "1";
			System.out.println("Registro insertado");
		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getLocalizedMessage();
			System.out.println("No puso insertarse");
		}
		em.close(); // se cierra entity manager para ahorrar memoria

		return resultado;
	}

	@Override
	public String editar(Object ob) {
		// Aqui se guarda la info que viene del exterior
		cliente = (Clientes) ob;

		// Buscamos al cliente existente en la BD y lo asignamos
		Clientes clientedb = em.find(Clientes.class, cliente.getClienteId());
		String resultado = null;
		em.getTransaction().begin();

		try {
			// Actualizamos los valores del cliente de BD con la
			// info que se envio del cliente del exterior
			clientedb.setNombre(cliente.getNombre());
			clientedb.setDireccion(cliente.getDireccion());
			clientedb.setIne(cliente.getIne());
			clientedb.setTelefono(cliente.getTelefono());
			em.getTransaction().commit();
			resultado = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getLocalizedMessage();
			System.out.println("No pudo editarse");
		}
		em.close();
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		String resultado = null;
		cliente = em.find(Clientes.class, id);
		em.getTransaction().begin();

		try {
			em.remove(cliente);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			resultado = "1";
		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getLocalizedMessage();
			System.out.println("No pudo eliminarse");
		}
		em.close();

		return resultado;
	}

	@Override
	public Object buscar(int id) {
		cliente = em.find(Clientes.class, id);
		return cliente;
	}

	@Override
	public List mostrar() {
		List<Clientes> Lista = em.createQuery("from Clientes").getResultList();

		return Lista;
	}

}
