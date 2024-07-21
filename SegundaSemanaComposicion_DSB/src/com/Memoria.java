package com;

public class Memoria {

	private int almacenamiento;
	private int ram;
	private String marca;

	private Memoria() {

	}

	public Memoria(int almacenamiento, int ram, String marca) {
		super();
		this.almacenamiento = almacenamiento;
		this.ram = ram;
		this.marca = marca;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Memoria [almacenamiento=" + almacenamiento + ", ram=" + ram + ", marca=" + marca + "]";
	}

}
