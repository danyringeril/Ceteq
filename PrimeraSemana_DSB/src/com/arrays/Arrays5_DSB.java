package com.arrays;

/**
 * @author korfirio
 *
 */
public class Arrays5_DSB {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 */

		System.out.println("=============================");
		System.out.println("=======Ejercicio5============");
		System.out.println("=============================");

		// Arrays de productos y precios
		String[] productos = { "Ropa", "Pan", "Discos", "Tacos", "Coca Cola" };
		double[] precios = { 10.50, 20.25, 15.75, 30.00, 12.99 };

		// Mostrar la lista de productos y sus precios
		System.out.println("Lista de productos y precios:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		}
	}

}
