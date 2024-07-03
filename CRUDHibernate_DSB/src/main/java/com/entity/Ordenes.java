package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDENES")
public class Ordenes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="oid_auto")
	@SequenceGenerator(name="oid_auto", sequenceName="ORDENES_SEQ")
	
	@Column(name="ORDER_ID", columnDefinition="NUMBER")
	private int orderId;
	
	@Column(name="PRODUCTO", columnDefinition="NVARCHAR2 (30)")
	private String producto;
	
	@Column(name="PRECIO", columnDefinition="NUMBER")
	private double precio;
	
	//Ahora en lugar de solo mostrar el id, las tablas van a quedar unidas
	//a travez de la columna CLIENTE_ID y se cambia por la anotacion @joinColumn
	@OneToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	private Clientes cliente;
	
	public Ordenes () {}



	public Ordenes(int orderId) {
		super();
		this.orderId = orderId;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	

	public Clientes getCliente() {
		return cliente;
	}



	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}



	@Override
	public String toString() {
		return "Ordenes [orderId=" + orderId + ", producto=" + producto + ", precio=" + precio + ", cliente=" + cliente
				+ "]";
	}
	
	
	
	
	
	
}
