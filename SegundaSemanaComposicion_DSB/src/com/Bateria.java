package com;

public class Bateria {

	private String marca;
	private double voltaje;
	private String color;

	private Bateria() {
	}

	public Bateria(String marca, double voltaje, String color) {
		super();
		this.marca = marca;
		this.voltaje = voltaje;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bateria [marca=" + marca + ", voltaje=" + voltaje + ", color=" + color + "]";
	}

}
