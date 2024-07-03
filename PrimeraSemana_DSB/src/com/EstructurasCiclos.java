package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		/*Ciclos o tambien llamados bucles
		 * nos ayudan a ejecutar "n" veces una accion, de acuerdo
		 * a una condicion
		 * 
		 * Casi siempre nos apoyamos para esto en el cambio de una
		 * variable, muchas veces numerica, puede ser booleana, etc
		 * 
		 * While (mientras se cumpla una condicion)
		 */
		
		int x = 3;
		
//		while (x<=5) {
//			System.out.println("Hola Mundo");
//			/*¨Para este ciclo que es indeterminado podemos
//			 * recurrir a un incremento en x en este caso, para
//			 * controlarlo y detenerlo
//			 */
////			x=x+1;
////			x++;
//			break;
//					
//		}
			
		/*do - while
		 * similar al ciclo while, pero, si nos encontramos con un posible panorama
		 * en el que una condicion no pueda cumplirse, nos aseguramos que el programa
		 * se ejecute por lo menos 1 vez
		 */
		
//		do {//Haz lo siguiente
//			System.out.println("Hola mundo");
//		}while(x>2);//Y evaluamos si se debe seguir haciendo
		
		/*For - Determinado - Se utliza cuando conocemos
		 * o podemos saber hasta donde queremos que se ejecute un accion (cuantas veces)
		 */
		for (int i = 0; i <=5; i++) {
			System.out.println(i + "- Hola mundo");
			
		}
		
		
		

	}

}
