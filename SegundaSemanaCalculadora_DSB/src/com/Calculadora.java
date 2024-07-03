package com;

public abstract class Calculadora {

	private String marca;
	private String modelo;
	private String tipo;
	private double precio;

	public Calculadora() {
	}

	public Calculadora(String marca, String modelo, String tipo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.precio = precio;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", precio=" + precio
				+ ", toString()=" + super.toString() + "]";
	}

	public abstract void sumar(double a, double b);

	public abstract void restar(double a, double b);

	public abstract void multiplicar(double a, double b);

	public abstract void dividir(double a, double b);

}
