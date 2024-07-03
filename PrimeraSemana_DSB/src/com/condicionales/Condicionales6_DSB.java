package com.condicionales;

import java.util.Scanner;

public class Condicionales6_DSB {

	public static void main(String[] args) {
		/*
		 * La asociación de vinicultores tiene como política fijar un precio inicial al
		 * kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y
		 * 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y
		 * tamaño, se requiere determinar cuánto recibirá un productor por la uva que
		 * entrega en un embarque considerando lo siguiente: * Si es de tipo A, se le
		 * cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
		 * es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño
		 * 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde
		 * teclado
		 */

		Scanner scanner = new Scanner(System.in);
		int kilos;
		Double precioinicial;
		String tipo;
		int tamano;

		System.out.print("Introduce los Kilos de uva entregada: ");
		kilos = scanner.nextInt();
		System.out.print("Introduce el precio inicial: ");
		precioinicial = (double) scanner.nextInt();
		System.out.print("Introduce de que tipo es A o B: ");
		tipo = scanner.next();
		scanner.hasNextLine();
		System.out.print("Que tamaño es 1 o 2: ");
		tamano = scanner.nextInt();

		if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) && (tamano == 1 || tamano == 2))) {
			System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
		} else {
			if (tipo.toUpperCase().equals("A") && tamano == 1) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) + (kilos * 0.20)));
			} else if (tipo.toUpperCase().equals("A") && tamano == 2) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) + (kilos * 0.30)));
			} else if (tipo.toUpperCase().equals("B") && tamano == 1) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) - (kilos * 0.30)));
			} else if (tipo.toUpperCase().equals("B") && tamano == 2) {
				System.out.println("La ganancia final es de: " + ((kilos * precioinicial) - (kilos * 0.50)));
			}
		}

	}

}
