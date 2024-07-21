package com.arrays;

public class Arrays2_DSB {

	public static void main(String[] args) {

		/*
		 * Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1
		 * al 100. Obt�n la suma de todos ellos y la media.
		 */
		System.out.println("=============================");
		System.out.println("=======Ejercicio2============");
		System.out.println("=============================");

		int[] numeros = new int[100];
		for (int i = 0; i < 100; i++) {
			numeros[i] = i + 1;
		}

		// Calcular la suma de todos los n�meros en el array
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}

		// Calcular la media
		double media = (double) suma / numeros.length;

		// Mostrar la suma y la media
		System.out.println("La suma de los n�meros del 1 al 100 es: " + suma);
		System.out.println("La media de los n�meros del 1 al 100 es: " + media);
	}

}
