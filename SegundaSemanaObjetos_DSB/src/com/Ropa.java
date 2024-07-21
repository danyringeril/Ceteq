package com;

public class Ropa {

	private String marca;
	private int precio;
	private String color;
	private String talla;
	private String textura;

	public Ropa() {

	}

	public Ropa(String marca, int precio, String color, String talla, String textura) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.talla = talla;
		this.textura = textura;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	@Override
	public String toString() {
		return "Ropa [marca=" + marca + ", precio=" + precio + ", color=" + color + ", talla=" + talla + ", textura="
				+ textura + "]";
	}

}
