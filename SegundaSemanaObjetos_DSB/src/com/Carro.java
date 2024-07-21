package com;

public class Carro {

	private String marca;
	private String modelo;
	private int a�o;
	private int puertas;
	private String color;

	public Carro() {

	}

	public Carro(String marca, String modelo, int a�o, int puertas, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.puertas = puertas;
		this.color = color;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", puertas=" + puertas + ", color="
				+ color + "]";
	}

}
