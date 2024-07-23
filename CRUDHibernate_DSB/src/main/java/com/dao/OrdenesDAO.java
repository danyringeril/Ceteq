package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Ordenes;
import com.general.Metodos;

public class OrdenesDAO implements Metodos {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	EntityManager em = emf.createEntityManager();

	Ordenes orden = null;

	@Override
	public String guardar(Object ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editar(Object ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List mostrar() {
		List<Ordenes> Lista = em.createQuery("from Ordenes").getResultList();

		return Lista;
	}

}
