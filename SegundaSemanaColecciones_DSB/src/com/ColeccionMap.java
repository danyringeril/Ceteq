package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionMap {

	public static void main(String[] args) {
		
		/*La interfaz Map asocia o almacena los datos
		 * en pares (clave - valor a almacenar)
		 * Las claves no pueden duplicarse
		 */
		
		/*Es decir, la clave actua como un identificador unico
		 * para cada elemento a almacenar(TD)
		 */
		
		/*Declaracion de un Map y la clase HashMap
		 * para almacenar claves de tipo Integer y elementos de tipo
		 * String
		 */
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		///Imprimir mi HashMap en consola
		System.out.println(usuarios);
		
		/*Imprimir en la pantalla un solo valor almacenado en
		 * una determinada clave
		 */
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en la consola los valores contenidos de mi HashMap
		System.out.println(usuarios.values());
		
		/*Mandar a imprimir cada una de las llaves con un ciclo
		 * for each
		 */
		for( String i: usuarios.values()){
			System.out.println(i);
		}
		
		//imprimir llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llaves: " + i + " " + "Valor: " + usuarios.get(i));
		}
		
		
		
		

	}

}
