package com; //Nombre del paquete

public class TiposDeDatos { //Inicio de la clase
	
	//Comentario de una sola linea
	/*
	 * Comentario 
	 * de 
	 * multiples
	 * lineas
	 * 
	 */
	public static void main(String[] args) {//Apertura del metodo main
		//El metodo main es el punto de entrada o ejecucion
		//de una clase principal o clase java 
		
		//Main + ctrl + espacio y se genera automaticamente el metodo
		
		/*TIPO DE DATOS
		 * TIPO DE DATOS PRIMITIVOS
		 * NUMEROS ENTEROS
		 */
		
		//CTRL + S para guardar los cambios en el codigo/clase
		
		//Declararlas sin un valor num�rico asignado inicialmente
		byte by;
		
		//M�s adelante puedo asignarle un valor 
		by = 120; 
		
		//Declarar nuestras variables con valores
		//asignados inicialmente
		byte numero1 = 127; //1 byte - -128 a 127
		short numero2 = 30000; //2 byte - -32768 a 32767
		int numero3 = 2147483647; //4 bytes
		long numero4 = 2147483649L; //8 bytes - requieren el sufijo
		// de la letra "L" para contener valores m�s alla de los tipos int
		
		int resultado = numero1 + numero2;
		
		//El tipo de dato comodin o m�s utilizado en los enteros
		//es el tipo de dato int
		
		//TIPO DE DATOS NUMERICOS EN COMA FLOTANTE
		//(DECIMALES)
		
		float numero5 = 3.1416F; //4 bytes y necesitan el sufijo F
		double numero6 = 3.141655787980; //8 bytes 
		
		//El tipo de dato double es el dato comodin o m�s utilizado
		//para declarar valores decimales
		
		//TIPO DE DATOS PPRIMITIVOS
		//Booleanos
		//Caracter
		
		Boolean evalua = true; // Solo admiten valores true or false
		//y sirven para evaluar expresiones o condiciones
		
		char caracter = 'a'; //Solo puede almacenar un caracter a la vez
		//entre comilla simple 
		
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//TIPOS DE DATOS OBJETO/ESTRUCTURADOS
		//TIPOS DE DATOS WRAPPER
		//Esyos tipos de datos son clases, los vamos a identificar
		//porque el tipo de dato inicia con May�scula
		
		//Cadena de texto 
		String nombre = "Jorge Alejandro";
		
		String cadena = "Hola mundo";
		
		String Chain;
		
		//El tipo de dato String admite secuencias de caracteres
		//(simbolos, espacios, letras, numeros, etc)
		
		String numeroTexto = "34";
		
		//Tipos de datros Wrapper o envoltorio
		//envuelven a los datos primitivos en clases para poder otorgarles
		//ciertos comportamientos o m�todos
		Byte numero11 = 127;
		
		numero11.toString(); //Convierte a cadena de texto el valor de mi 
		//tipo de daro primitivo
		
		//Integer, short, Double, Float, Character, Boolean
		
		//Darle salida a los datos en consola
		System.out.println("Hola mundo");
		
		//Un atajo para escribir la linea de impresion en consola 
		//m�s rapido
		/*syso + ctrl + espacio
		 *sout + ctrl + espacio
		 */
		System.out.println();
		
		System.out.println(nombre);
		System.out.println(resultado);
		System.out.println(5+6);
		//Cuando queremos mostrar texto y una operacion
		//Entramos en algo que se conoce como concatenacion
		System.out.println("La suma es: " +5+6);
		
	}//Cierre del metodo main
	
	
}//Cierre de la clase
