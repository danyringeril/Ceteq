package com;

public class Ropero {

	private int altura;
	private int ancho;
	private String color;
	private int cajones;
	private String forma;
	
	public Ropero() {
		
	}

	public Ropero(int altura, int ancho, String color, int cajones, String forma) {
		super();
		this.altura = altura;
		this.ancho = ancho;
		this.color = color;
		this.cajones = cajones;
		this.forma = forma;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCajones() {
		return cajones;
	}

	public void setCajones(int cajones) {
		this.cajones = cajones;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Ropero [altura=" + altura + ", ancho=" + ancho + ", color=" + color + ", cajones=" + cajones
				+ ", forma=" + forma + "]";
	}
	
	
}
