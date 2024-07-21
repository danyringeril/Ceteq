package com.condicionales;

import java.util.Scanner;

public class Condicionales9_DSB {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 */

		System.out.println("=============================");
		System.out.println("=======Ejercicio9============");
		System.out.println("=============================");

		int day;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 7 que corresponda a un día de la semana");
		day = entrada.nextInt();

		switch (day) { // De acuerdo al cambio de una variable
		case 1: // el valor que tenga
			System.out.println("El día que tu elegiste es Lunes");
			break;
		case 2:
			System.out.println("El día que tu elegiste es Martes");
			break;
		case 3:
			System.out.println("El día que tu elegiste es Miércoles");
			break;
		case 4:
			System.out.println("El día que tu elegiste es Jueves");
			break;
		case 5:
			System.out.println("El día que tu elegiste es Viernes");
			break;
		case 6:
			System.out.println("El día que tu elegiste es Sábado");
			break;
		case 7:
			System.out.println("El día que tu elegiste es Domingo");
			break;

		default:
			System.out.println("Error");
			break;
		}

	}

}
