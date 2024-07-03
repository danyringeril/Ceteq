package com.ciclos;

import java.util.Scanner;

public class Ciclos3_DSB {

	public static void main(String[] args) {

		// Realiza un programa para determinar si un
		// String es palíndromo.

		System.out.println("=============================");
		System.out.println("=======Ejercicio3============");
		System.out.println("=============================");

		// Declaro una variable de tipo String para almacenar la
		// frase que solicitare mediante teclado
		String original; // ana
		// Despues declaro otro String para armar la cadena de texto
		// original pero en reversa //ana
		String reversa = "a" + "a";

		// Necesitamos un Scanner para introducir los valores por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();

		// Una vez tenemos guardado el String original
		// Necesitamos un ciclo que nos permita extraer caracter por caracter
		// Ahora iniciando por el ultimo caracter y que este se vuelva el primero
		// en y lo guardemos en el String reversa

		for (int i = original.length() - 1; i >= 0; i--) {
			// Armamos la reversa extrayendo caracter por caracter
			reversa = reversa + original.charAt(i); // a + n + a
		}
		System.out.println("Reversa: " + reversa);

		// Evaluamos si las cadenas son iguales, para ello debemos reemplazar
		// los espacios e ignorar el uso de mayusculas y minusculas
		// Anitalavalatina //anitalavalatinA
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}

	}

}