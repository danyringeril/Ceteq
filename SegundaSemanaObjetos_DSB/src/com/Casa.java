package com;

public class Casa {

	private int tama�o;
	private int cuartos;
	private String color;
	private String piso;
	private String tejado;
	
	public Casa() {
		
	}

	public Casa(int tama�o, int cuartos, String color, String piso, String tejado) {
		super();
		this.tama�o = tama�o;
		this.cuartos = cuartos;
		this.color = color;
		this.piso = piso;
		this.tejado = tejado;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "Casa [tama�o=" + tama�o + ", cuartos=" + cuartos + ", color=" + color + ", piso=" + piso + ", tejado="
				+ tejado + "]";
	}

	
}
