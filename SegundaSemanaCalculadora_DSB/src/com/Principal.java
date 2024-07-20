package com;

public class Principal {

	public static void main(String[] args) {

		Cientifica casio = new Cientifica();

		casio.sumar(19, 34);

		casio.sumar(5, 6, 8);

		casio.restar(85, 56);

		casio.multiplicar(8, 7);

		casio.dividir(69, 5);

		casio.tomarTemperatura();

		/*
		 *  La multiherencia en Java no existe. Es decir,
		 *  una clase hija no puede tener dos padres.
		 *  Pero se puede simular a través del uso de interfaces
		 *  implementando los métodos de estas.
		 *  
		 *  ¿De dónde obtienen comportamientos los objetos/clases?
		 *  
		 *  1. De métodos propios 
		 *  2. De otras clases, clases abstractas (herencia) 
		 *  3. Deinterfaces
		 */

	

	}

}