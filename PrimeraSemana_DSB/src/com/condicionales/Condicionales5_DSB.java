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
		
		int nota;
		int edad;
		String sexo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de su nota");
		nota = entrada.nextInt();
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce su edad");
		edad = entrada1.nextInt();
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce su sexo");
		sexo = entrada2.nextLine();
		
		
		if ( sexo != "Femenino") {
		System.out.println("Error de Sintaxis");
	}else	if (sexo != "Masculino"  ) {
			System.out.println("Error de Sintaxis");	
	}else if (nota >= 5 && edad >=18 && sexo == "Masculino" ) {
		System.out.println("Es Posible");
	}else if ( nota >= 5 && edad >=18 && sexo == "Femenino") {
		System.out.println("Es aceptado");		
	}else {
		System.out.println("No es aceptado");		
	
	}
		
		


	}

}
