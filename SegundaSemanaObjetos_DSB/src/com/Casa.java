package com;

public class Casa {

	private int tamaño;
	private int cuartos;
	private String color;
	private String piso;
	private String tejado;
	
	public Casa() {
		
	}

	public Casa(int tamaño, int cuartos, String color, String piso, String tejado) {
		super();
		this.tamaño = tamaño;
		this.cuartos = cuartos;
		this.color = color;
		this.piso = piso;
		this.tejado = tejado;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getCuartos() {
		return cuartos;
	}

	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getTejado() {
		return tejado;
	}

	public void setTejado(String tejado) {
		this.tejado = tejado;
	}

	@Override
	public String toString() {
		return "Casa [tamaño=" + tamaño + ", cuartos=" + cuartos + ", color=" + color + ", piso=" + piso + ", tejado="
				+ tejado + "]";
	}

	
}
