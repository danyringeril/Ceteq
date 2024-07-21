package com;

public class MetodosString {

	public static void main(String[] args) {

		// Métodos o funcionalidades de la clase String

		// Guardar una cadena de texto ejemplo

		String cadena = "Hoy es miercoles 22 de mayo de 2024";

		// .length() - devuelve el tamaño en valor entero
		// de nuestra cadena de texto

		// int conteo = cadena.length();
		System.out.println("Prueba de metodo .length");
		System.out.println(cadena.length()); // 36

		// Metodo . charAt() - devuelve el caracter que se encuentra
		// en determinada posicion o indice que le indiquemos

		System.out.println("Prueba de metodo .charAt()");
		// System.out.println(cadena.charAt(cadena.length()-1));
		System.out.println(cadena.charAt(34));

		// .substring() - nos devuelve una subcadena a partir
		// del indice especificado
		System.out.println("Prueva de metodo .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 31));

		// .toLowerCase()/.toUpperCase
		// Convierte a minusculas/Convierte a mayusculas
		// una cadena de texto

		System.out.println("Prueba de metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());

		System.out.println("Prueba de metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());

		/*
		 * .equals() - compara el valor de un objeto contra otro, en este caso, de una
		 * cadena de texto contra otra y devuelve un booleano si es cierto o no
		 */
		System.out.println("Prueba de metodo .equals()");
		System.out.println(cadena.equals("Hoy es miercoles 22 de mayo de 2024"));
		System.out.println(cadena.equals("Hoy es martes"));

		/*
		 * .equalsIgnoreCase - compara el valor de un objeto contra otro, en este caso,
		 * de una cadena de texto contra otra y devuelve un booleano si es cierto o no
		 * pero no importando el uso de mayusculas y minusculas
		 */
		System.out.println("Prueba de metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es miErcoLes 22 dE maYo dE 2024"));

		/*
		 * .replace() - reemplazar las apariciones de un texto o caracter con otro que
		 * indiquemos
		 */
		System.out.println("Prueba de metodo .replace()");
		System.out.println(cadena.replace("2024", "2029"));
		System.out.println(cadena.replace("o", "$"));
		System.out.println(cadena.replace(" ", ""));

	}

}
