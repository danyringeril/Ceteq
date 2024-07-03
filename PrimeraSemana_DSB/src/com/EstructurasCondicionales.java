package com;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras de decicion if - evaluan valores booleanos
		
//	int x = 12;
//		
//		if (x<10) { //Si X es menor a 10
//			System.out.println("si");
//		}else {//Si X no es menor a 10
//			System.out.println("No");
//		}
		/*Condiciones compuestas con operadores logicos
		 * AND, OR, NOT, DIFERENTE DE, IGUALDAD
		 * 
		 * AND - && - Devuelve el valor "True" Cuando se cumplen 
		 * Todas las condiciones
		 */
		
//		if (x<15 && x>10) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//OR - || - Devuelve el valor "true" cuando se cumpla al menos
		//una condicion 
		
//		if (x<12 || x>15) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		/* NOT - ! - Niega una condicion o sentencia/Cambia el valor
		 * de true a false y viceversa
		 * !NO
		 */
		
//		if (!(x<15)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		/*IGUALDAD O COMPARACION - == - Revisa o compara el valor
		 * para verificar si son iguales
		 * Un solo = significa asignacion de valor hacia una variable
		 * Este operador funciona mejor al comparar valores numericos
		 */
		
//		if (x==12) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		/*DIFERENTE DE - != - Devuelve el valor true si la condicion
		 * es diferente de lo que se esta evaluando
		 */
		
//		if (x!=13) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		/*Estructura if else anidado
		 * Se utiliza para evaluar distintos "casos" que puedan presentarse
		 */
		
//		int dia = 3;
//		
//		if (dia == 1) {//Si esto se cumple, ejecuta lo siguiente
//			System.out.println("Lunes");
//		} else if ( dia == 2) {//Si lo anterior no se cumple, evalua lo sig.
//			System.out.println("Martes");		
//		}else if (dia == 3) {
//			System.out.println("Miercoles");		
//		}else if (dia == 4) {
//			System.out.println("Jueves");
//		}else if (dia == 5) {
//			System.out.println("Viernes");
//		}else {//Si nada de lo anterior se cumple
//				System.out.println("Error");
//		}
		
	
		/*Estructura de desicion SWITCH-CASE
		 * Puede ser con tipo de dato String, int, char, etc	
		 * Switch case se utiliza más cuando tenemos casos bien definidos
		 * y una variable nos ayuda a evaluarlos facilmente 
		 */
	
		int day;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de dia");
		day = entrada.nextInt();
		
		switch (day) { //De acuerdo al cambio de una variable
		case 1: //el valor que tenga
			System.out.println("El dia que tu elejiste es Lunes");
			break;
		case 2: 
			System.out.println("El dia que tu elejiste es Martes");
			break;
		case 3: 
			System.out.println("El dia que tu elejiste es Miercoles");
			break;
		case 4: 
			System.out.println("El dia que tu elejiste es Jueves");
			break;
		case 5:
			System.out.println("El dia que tu elejiste es Viernes");
			break;

		default: 
			System.out.println("Error");
			break;
		}
		
	}//Cierre del main

}//Cierre de la clase
