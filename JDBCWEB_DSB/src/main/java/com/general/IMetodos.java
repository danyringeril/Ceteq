package com.general;

import java.util.List;

public interface IMetodos {

	// Esta interface va a contener los metodos o instrucciones que la clase de la logica
	// tendra que resolver (DAO)

	public String guardar(Object ob);

	public String editar(Object ob);

	public String eliminar(int id);

	public Object buscar(int id);

	public List mostrar();

}
