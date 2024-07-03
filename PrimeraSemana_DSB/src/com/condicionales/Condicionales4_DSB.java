package com.condicionales;

import java.util.Scanner;

public class Condicionales4_DSB {

	public static void main(String[] args) {

		//Realiza un programa que lea una cadena por teclado y 
		//compruebe si contiene letras mayúsculas.
						
				
				System.out.println("=============================");
				System.out.println("=======Ejercicio4============");
				System.out.println("=============================");
				
				String cadena;
				
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introduce una palabra");
				cadena=entrada.nextLine();
				
				String Minusculas = cadena.toLowerCase();
				
				if (cadena == Minusculas) {
					System.out.println("La palabra solo tiene minusculas");
				} else {
					System.out.println("La palabra tiene mayusculas");
				}
			
	}

}
