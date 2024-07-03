package com.ciclos;

public class Ciclos4_DSB {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora,
		// minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		// horas

		System.out.println("=============================");
		System.out.println("=======Ejercicio4============");
		System.out.println("=============================");

//		Scanner sc = new Scanner(System.in);
//
//		for (int j = 0; j < 24; j++) {
//			for (int k = 0; k < 60; k++) {
//
//				int s = 0;
//
//				// segundos
//				while (s < 60) {
//					System.out.println(j + " : " + k + " : " + s);
//					s++;
//
//				}
//			}
//		}

		// Ciclo para recorrer las 24 horas
		for (int horas = 0; horas < 24; horas++) {
			// Ciclo para recorrer los 60 minutos
			for (int minutos = 0; minutos < 60; minutos++) {
				// Ciclo para recorrer los 60 segundos
				for (int segundos = 0; segundos < 60; segundos++) {
					// Formatear y mostrar la hora actual
					System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

					// Pausa de 1 segundo para simular el tiempo real
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
