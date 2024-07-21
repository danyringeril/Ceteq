package com.condicionales;

import java.util.Scanner;

public class Condicionales8_DSB {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
		 * al lanzar un dado de seis caras y muestre por pantalla el número en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará
		 * el mensaje: “ERROR: número incorrecto”.
		 */

		System.out.println("=============================");
		System.out.println("=======Ejercicio8============");
		System.out.println("=============================");

		int dado;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero que dio el dado");
		dado = entrada.nextInt();

		switch (dado) {
		case 1:
			System.out.println("El numero opuesto es Seie");
			break;
		case 2:
			System.out.println("El numero opuesto es Cinco");
			break;
		case 3:
			System.out.println("El numero opuesto es Cuatro");
			break;
		case 4:
			System.out.println("El numero opuesto es Tres");
			break;
		case 5:
			System.out.println("El numero opuesto es Dos");
			break;
		case 6:
			System.out.println("El numero opuesto es Uno");
			break;

		default:
			System.out.println("El numero es incorrecto");
			break;
		}

	}

}
