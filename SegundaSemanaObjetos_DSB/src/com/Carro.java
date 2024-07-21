package com;

public class Carro {

	private String marca;
	private String modelo;
	private int año;
	private int puertas;
	private String color;

	public Carro() {

	}

	public Carro(String marca, String modelo, int año, int puertas, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", puertas=" + puertas + ", color="
				+ color + "]";
	}

}
