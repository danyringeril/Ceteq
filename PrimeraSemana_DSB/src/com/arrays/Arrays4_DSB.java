package com.arrays;

public class Arrays4_DSB {

	public static void main(String[] args) {

		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero
		 * con los valores invertidos, es decir, que el segundo array deberá tener los
		 * valores {5,4,3,2,1}.
		 */

		System.out.println("=============================");
		System.out.println("=======Ejercicio4============");
		System.out.println("=============================");

		// Array original
		int[] arrayOriginal = { 1, 2, 3, 4, 5 };

		// Array para almacenar los valores invertidos
		int[] arrayInvertido = new int[arrayOriginal.length];

		// Copiar los valores en el nuevo array, pero en orden inverso
		for (int i = 0; i < arrayOriginal.length; i++) {
			arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
		}

		// Mostrar el array invertido por consola
		System.out.println("Array original: " + java.util.Arrays.toString(arrayOriginal));
		System.out.println("Array invertido: " + java.util.Arrays.toString(arrayInvertido));

	}

}
