package com;

public class Almacenamiento {

	private String marca;
	private String tipo;
	private double tama�o;

	public Almacenamiento() {
	}

	public Almacenamiento(String marca, String tipo, double tama�o) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", tama�o=" + tama�o + "]";
	}

}
