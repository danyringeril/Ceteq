package com;

public class Personaje {

	private String nombre;
	private String genero;
	private String anime;
	private int edad;
	private String poder;

	public Personaje() {
	}

	public Personaje(String nombre, String genero, String anime, int edad, String poder) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.anime = anime;
		this.edad = edad;
		this.poder = poder;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnime() {
		return anime;
	}

	public void setAnime(String anime) {
		this.anime = anime;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", genero=" + genero + ", anime=" + anime + ", edad=" + edad + ", poder="
				+ poder + "]";
	}

}
