package com.condicionales;

import java.util.Scanner;

public class Condicionales2_DSB {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un número por teclado y 
		//nos indique si es par o impar.
		
		int a;
		
		System.out.println("=============================");
		System.out.println("=======Ejercicio2============");
		System.out.println("=============================");
		System.out.println("Introduce el primer numero");
		Scanner entrada1 = new Scanner(System.in);
		a = entrada1.nextInt();
		
		if (a%2==0) {
			System.out.println(a+" Es par");
		} else {
			System.out.println(a+" Es impar");		
		}
		
	}

}
