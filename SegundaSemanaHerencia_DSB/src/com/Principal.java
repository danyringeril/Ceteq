package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a probar crear una nueva persona
		// Cuando una clase se vuelve abstracta, no podemos instanciarla
		// es decir, no podemos crear objetos de esa clase
		// Persona juan = new Persona("Juan", "Masculino", 27);
		// System.out.println(juan);

		// Vamos a probar a crear un nuevo empleado
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGF9776", "Desarrollador", "Matutino", 30000);
		
		/*Crear otras dos clases, una que sea la clase padre y otra la clase 
		 * hija Ej. Persona, que herede a estudiante matricula turno, horario, 
		 * grado Ej. Vehiculo (marca, tipo, paisOrigen) Carro, Barco, 
		 */
		
		
		
		
		// Las clases al volverse abstractas, ya no pueden instanciarse
		// (ya no podemos crear objetos de esa clase)
		Persona juan = new Empleado();

		Persona pedro = new Empleado(); // polimorfismo de asignacion
		System.out.println(jorge);

		// Voy a probar el m�todo dormir, llamandolo a trav�s de mi persona
		// juan
		juan.dormir();

		// Revisamos que los m�todos tambi�n son heredados
		// Mi empleado jorge tambi�n puede ejecutar la accion de dormir
		jorge.dormir();

		// Vamos a probar el m�todo comer, que es un m�todo con retorno
		String queComenJuan = juan.comer(); // "Estoy comiendo a las 2pm";

		System.out.println(juan.comer());

		System.out.println(juan.comer("pizza"));

		System.out.println(juan.comer("tacos", 3));

		// Probar el m�todo sumar a trav�s de alguno de mis objetos empleado
		juan.sumar(3, 10);

	}

}
