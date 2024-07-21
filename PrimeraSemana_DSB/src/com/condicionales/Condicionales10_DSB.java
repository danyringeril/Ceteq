package com.condicionales;

import java.util.Scanner;

public class Condicionales10_DSB {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un n�mero entero entre uno y doce e imprima el
		 * n�mero de d�as que tiene el mes correspondiente.
		 */

		System.out.println("=============================");
		System.out.println("=======Ejercicio10============");
		System.out.println("=============================");

		Scanner scanner = new Scanner(System.in);

		int mes = 0;

		System.out.println("Elige un mes con el n�mero del 1 al 12");
		if (mes >= 1 && mes <= 12)
			;
		mes = scanner.nextInt();

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes seleccionado tiene 31 d�as");
		} else if (mes == 2) {
			System.out.println("Febrero tiene 28 d�as");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("El mes seleccionado tiene 30 d�as");
		} else {
			System.out.println("Error, el mes debe estar entre 1-12.");
		}

	}

}
