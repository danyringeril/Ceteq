package com;

public class Motocicleta {
	
	private String marca;
	private String modelos;
	private int velocidades;
	private String color;
	private int rines;
	
	public Motocicleta() {
		
	}

	public Motocicleta(String marca, String modelos, int velocidades, String color, int rines) {
		super();
		this.marca = marca;
		this.modelos = modelos;
		this.velocidades = velocidades;
		this.color = color;
		this.rines = rines;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelos() {
		return modelos;
	}

	public void setModelos(String modelos) {
		this.modelos = modelos;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRines() {
		return rines;
	}

	public void setRines(int rines) {
		this.rines = rines;
	}

	@Override
	public String toString() {
		return "Motocicleta [marca=" + marca + ", modelos=" + modelos + ", velocidades=" + velocidades + ", color="
				+ color + ", rines=" + rines + "]";
	}
	
	

}
