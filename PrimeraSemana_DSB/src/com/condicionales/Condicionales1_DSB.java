package com.condicionales;

import java.util.Scanner;

public class Condicionales1_DSB {

	public static void main(String[] args) {
		//Realiza un programa que reciba dos números por teclado e indique 
		//cuál es mayor o si son iguales.
		
		int a;
		int b;
		
		System.out.println("=============================");
		System.out.println("=======Ejercicio1============");
		System.out.println("=============================");
		System.out.println("Introduce el primer numero");
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextInt();
		System.out.println("Introduce el segundo numero");
		Scanner entrada2 = new Scanner(System.in);
		b = entrada2.nextInt();
		
		if (a==b) {
			System.out.println("Los numeros " + a + " y " + b + " Son iguales");
		} else if (a<b) {
			System.out.println(a+" Es menor que "+b);		
		}else if (a>b) {
			System.out.println(a+" Es mayor que "+b);	
		}
		
	}	
}
