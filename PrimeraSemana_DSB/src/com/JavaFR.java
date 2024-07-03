package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {

		// Uso de las clases File, FileReader y BuferedReader

		// Intentaremos leer la linea de texto de nuestro archivo de prueba
		String linea;

		/*
		 * En ocasiones cuando necesitamos convertir tipos de datos o comunicarnos con
		 * un programa o archivo exzterno pueden ocurrir errores que no esten nuestras
		 * manos
		 */

		try {// intenta ejecutar el sig bloque de codigo
				// Usamos la clase File para ubicar nuestro archivo
			File archivo = new File("C:\\Users\\danyr\\OneDrive\\Escritorio\\fichero.txt");
			// Ya que tenemos ubicado el archivo, usamos a la clase FileReader para
			// prepararlo
			// modo lectra
			FileReader fr = new FileReader(archivo);
			// Ya que esta en modo lectura, usamos la clase BufferedReader
			BufferedReader buffer = new BufferedReader(fr);

			// Vamos a leer la info de la linea de nuestro archivo y la guardamos en nuestro
			// String linea
			while ((linea = buffer.readLine()) != null)

				System.out.println(linea);

		} catch (Exception e) {// pero si algo falla, aqui se atrapa el posible fallo o excepcion
			// y ejecutamos lo que se indique en este bloque
			e.printStackTrace(); // Este metodo imprime en consola la traza de error
			System.out.println("No se encontro el archivo");

		}

	}

}