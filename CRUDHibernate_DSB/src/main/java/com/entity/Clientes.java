package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Indica que estamos trabajando con una entidad de base de datos
@Table(name = "CLIENTES")
public class Clientes {

	@Id // Especifica que este atributo es una primary key en una BD
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "CLIENTES_SEQ")

	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private int clienteId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private String nombre;

	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(40)")
	private String direccion;

	@Column(name = "INE", columnDefinition = "NVARCHAR2(10)")
	private String ine;

	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)")
	private String telefono;

	// Declaramos un objeto Ordenes, que es un atributo relacional
	// pero que no existe en mi tabla
	@OneToOne(mappedBy = "cliente")
	private Ordenes orden;

	public Clientes() {
	}

	public Clientes(int clienteId) {
		super();
		this.clienteId = clienteId;
	}

	// Getter&Setters

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getIne() {
		return ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Ordenes getOrden() {
		return orden;
	}

	public void setOrden(Ordenes orden) {
		this.orden = orden;
	}

	@Override
	public String toString() {
		return "Clientes [clienteId=" + clienteId + ", nombre=" + nombre + ", direccion=" + direccion + ", ine=" + ine
				+ ", telefono=" + telefono + "]";
	}

}
