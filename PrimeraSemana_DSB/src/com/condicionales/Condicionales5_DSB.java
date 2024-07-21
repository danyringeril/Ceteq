package com.condicionales;

import java.util.Scanner;

public class Condicionales5_DSB {

	public static void main(String[] args) {

		/*Realiza un programa que calcule la aceptación de una 
		 * solicitud en base a los siguientes parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA
		 */

		System.out.println("=============================");
		System.out.println("=======Ejercicio5============");
		System.out.println("=============================");

		double nota;
		int edad;
		char sexo;

		do {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el numero de su nota del 0 al 10");
			nota = entrada.nextInt();
		} while (nota > 10);

		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce su edad");
		edad = entrada1.nextInt();

		do {
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Introduzca su sexo (M/F)");
			sexo = entrada2.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
		} while ((sexo != 'M') && (sexo != 'F'));

		if (nota >= 5 && edad >= 18 && sexo == 'M') {
			System.out.println("Es Posible");
		} else if (nota >= 5 && edad >= 18 && sexo == 'F') {
			System.out.println("Es aceptado");
		} else {
			System.out.println("No es aceptado");

		}

	}

}
