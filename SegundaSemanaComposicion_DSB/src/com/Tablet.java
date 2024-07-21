package com;

public class Tablet {

	private String marca;
	private String modelo;
	private String color;
	private double version;

	// atributos en otro objeto
	private Camara estatica;
	private Memoria almacenamiento;
	private Bateria bateria;

	public Tablet() {

	}

	public Tablet(String marca, String modelo, String color, double version, Camara estatica, Memoria almacenamiento,
			Bateria bateria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.version = version;
		this.estatica = estatica;
		this.almacenamiento = almacenamiento;
		this.bateria = bateria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Camara getEstatica() {
		return estatica;
	}

	public void setEstatica(Camara estatica) {
		this.estatica = estatica;
	}

	public Memoria getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Memoria almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Tablet [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", version=" + version
				+ ", estatica=" + estatica + ", almacenamiento=" + almacenamiento + ", bateria=" + bateria + "]";
	}

}
