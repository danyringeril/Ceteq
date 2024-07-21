package com.condicionales;

import java.util.Scanner;

public class Condicionales3_DSB {

	public static void main(String[] args) {

		// Crea un programa que pida al usuario dos números y muestre el
		// resultado de su división. Si el segundo número es 0, debe mostrar
		// un mensaje de error.

		int a;
		int b;
		double c;

		System.out.println("=============================");
		System.out.println("=======Ejercicio3============");
		System.out.println("=============================");
		System.out.println("Introduce el primer número");
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextInt();
		System.out.println("Introduce el segundo número");
		Scanner entrada2 = new Scanner(System.in);
		b = entrada2.nextInt();

		if (b == 0) {
			System.out.println("Error");
		} else
			System.out.println("El resultado de la división es " + (c = a * 1.0 / b));

	}

}
