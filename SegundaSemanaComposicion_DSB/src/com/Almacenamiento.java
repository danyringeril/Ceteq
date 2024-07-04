package com;

public class Almacenamiento {

	private String marca;
	private String tipo;
	private double tamaño;

	public Almacenamiento() {
	}

	public Almacenamiento(String marca, String tipo, double tamaño) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamaño = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tamaño=" + tamaño + "]";
	}

}
