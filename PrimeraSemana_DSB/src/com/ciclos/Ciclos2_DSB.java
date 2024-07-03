package com.ciclos;

import java.util.Scanner;

public class Ciclos2_DSB {

	public static void main(String[] args) {
		/*Programa un algoritmo que realice la tabla de multiplicar 
		 * de un numero introducido desde teclado, hasta la iteración 
		 * deseada por el usuario. Ejemplo, tabla de 23 hasta 
		 * el 95. 23 x 95 = ???
		 */
		
		System.out.println("=============================");
		System.out.println("=======Ejercicio2============");
		System.out.println("=============================");
		
		int x;
		int a;
		int y;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero con el que desea Multiplicar");
		x = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce hasta que numero deseas multiplicar");
		a = entrada1.nextInt();
		
		
		for (int i = 1; i<=a ; i++) {
			y = x*i;
			System.out.println("La multiplicación de " + x + "x" + i + " es " + y);		

		}

	}

}
