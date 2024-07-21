package com;

public class Camara {

	private String Marca;
	private String modelo;
	private double pixeles;

	private Camara() {

	}

	public Camara(String marca, String modelo, double pixeles) {
		super();
		Marca = marca;
		this.modelo = modelo;
		this.pixeles = pixeles;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPixeles() {
		return pixeles;
	}

	public void setPixeles(double pixeles) {
		this.pixeles = pixeles;
	}

	@Override
	public String toString() {
		return "Camara [Marca=" + Marca + ", modelo=" + modelo + ", pixeles=" + pixeles + "]";
	}

}
