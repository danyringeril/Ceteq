package com;

public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//Creación de Métodos Propios
	//Estas van a ser acciones que vamos a poder llamar a través de los objetos
	//que vayamos a crear
	
	//Método sin retorno - llevan la palabra reservada void, la cual indica
	//que este método ejecuta algo, pero no debe retornar algun tipo de dato
	
	public void dormir () {
		System.out.println("Estoy durmiendo...");
	}
	
	//Métodos con retorno - indican desde la creación del método el tipo de
	//dato que el método debe devolver
	
	public String comer() {
		String comiendo = "Estoy comiendo a las 2pm";
		System.out.println(comiendo);
		return comiendo;
	}
	
	//Creación de un método Polimorfico
	public String comer(String comida) {
		String comiendo = "Estoy comiendo " + comida + " a las 2pm";
		return comiendo;
	}
	
	//Creando otro método comer, pero con otro argumento
	public String comer(String comida, int horario) {
		String comiendo = "Estoy comiendo " + comida + " a las " + horario + "pm";
		return comiendo;
	}
	
	public String comer (String comida, String horario) {
		return null;
	}
	
	//La sobrecarga de argumentos va de la mano con la sobrecarga de metodos
	//La sobrecarga de metodos se podria entender que es tener un método polimorfico
	//o varios metodos con el mismo nombre, pero que van a realizar diferentes acciones
	//gracias a la cantidad de argumentos que soliciten (sobrecarga de argumentos)
	
	//Creación de un método abstracto - esto obliga a que la clase se vuelva abstracta
	//las clases hijas se ven obligadas a definir CÓMO SE va a realizar esta acción
	public abstract void sumar (int a, int b);
	
	//Un método abstracto nos indica QUÉ se va a hacer pero no CÓMO
	
	//Otra forma de entender las clases abstractas es por medio de la definicion
	//que son clases "resumen", que nos van a permitir heredarlas
	//para poder especializar otros modelos
	
	

}
