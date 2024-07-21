package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {

		// Uso de las clases Java File y File Writer

		// Vamos a declarar una cadena de texto para escribirla en nuestro archivo de
		// prueba
		String texto = "\nDaniel S�nchez";

		try {
			File archivo = new File("C:\\Users\\danyr\\OneDrive\\Escritorio\\fichero.txt");

			// Para escribir info en el archivo etulizamos la clase FileWriter
			FileWriter linea = new FileWriter(archivo, true);

			/*
			 * Nuestro objeto linea se construye con dos valores, la ruta del archivo a
			 * sobre escribir y un valor booleano true para indicar que se respete el
			 * contenido original del archivo si no lo indicamos, el archivo se sobreescribe
			 * porcompleto
			 */

			// indicamos la escritura del String texto en nuestro archivo
			linea.write(texto);
			// necesitamos otra instrucion que guarde o confirme los cambios
			linea.close();

		} catch (Exception e) {
			System.out.println("No encontre el archivo");
			e.printStackTrace();

		}

	}

}
