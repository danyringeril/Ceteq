package com;

public class Persona {

	// Las clases nos van a servir como plantilla o molde para generar diversos
	// objetos

	// Los objetos deben contar con atributos y comportamientos

	/*
	 * ABTRACCION Atributos de una persona con modificador de acceso Los atributos
	 * deben de preferencia llevar un modificador de acceso para restringir dichos
	 * valores de modificaciones no autorizadas Los modificadores son PRIVATE,
	 * PUBLIC, DEFAULT, y PROTECTED Estos modificadoresnos permiten establecer la
	 * ENCAPSULACION
	 */

	private String nombre;
	private int edad;
	private String genero;

	/*
	 * Metodos constructores Son aquellos metodos que nos permiten instanciar o
	 * crear a nuestros objetos con determinados atributos Existen dos princiaples:
	 * constructor vacio y constructor con todos los parametros
	 */

	// Constructor vacio - nos permite crear un objeto sin tener iniciados sus
	// atributos
	// Persona pepe = new Persona ();
	public Persona() {
	}

	/*
	 * Constructor con todos los parametros - nos permite crear un objeto con sus
	 * atributos iniciados
	 */

	// Persona mary = new Persona ("Maria", 18, "Femenino");
	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	// Persona peter = new Persona ("Pedro");
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	/*
	 * Getters & Setters Metodo get - devuelve el valor del atributo indicado Metodo
	 * set - nos permite establecer un valor al atributo especificado
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	/*
	 * Generamos el metodo toString El cual convierte todos los atributos a valores
	 * String para poder visualizarlos en consola Este metodo actua como una
	 * "radiografia" para permitirnos imprimir en consola los atributos de nuestros
	 * objetos
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}

}