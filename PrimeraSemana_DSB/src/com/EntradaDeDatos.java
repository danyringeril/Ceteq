package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDeDatos {

	public static void main(String[] args) {
		/*Introducir valores por teclado, ejemplo
		 *numeros enteros
		 *
		 *Primero declaro una variable de tipo entero donde guardar 
		 *el valor que introducire por teclado
		 */
		int numero; 
		String Nombre;
		
		/*Recurriremos al uso de un tipo de dato o clase
		 *llamada scanner (int, String) -> java.lang
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad en a�os");
		numero = entrada.nextInt();
		System.out.println("Introduce tu nombre");
//		Scanner Name = new Scanner(System.in);
//		Nombre = entrada.nextLine();
		//Aveces ocurre que el metodo nexline () consume los espacios de salto de linea
		//entonces hay que consumir primero el espacio vacio y despues asignar
		//lo que vamos a teclear
		entrada.nextLine();
		Nombre = entrada.nextLine();
		//Aveces ocurre que el metodo nextline () consume los espacios de salto de linea
		//entonces hay que consumir primero el espacio vacio y despues asignar
		//lo que vamos a teclear
		//entrada.nextLine();
		//Nombre=entrada.nextLine();
		
		System.out.println("Hola "+Nombre+" Tu edad es "+numero+" a�os");
		
		//Otro ejemplo o forma de introducir valores desde teclado utlizado JOptionPane
		 
//		String numero = JOptionPane.showInputDialog("introduce tu edad");
//		
//		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
//		
//		int edad = Integer.parseInt(numero)+1;
//		
//		System.out.println("Hola "+nombre+" el siguiente a�o tendras "+edad+" a�os");
//		
//		

	}

}