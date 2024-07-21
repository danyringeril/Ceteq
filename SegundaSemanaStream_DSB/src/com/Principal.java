package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {

		// API Stream - Funcionalidad que inicio a partir
		// de Java 8 que nos va a permitir hacer un mejor uso
		// o gestión de una colección de datos
		// Esto nos va a permitir solicitar la info, ya sea
		// ordenandola, filtrandola, etc, como mejor nos convenga

		// Vamos a crear una lista para que podamos
		// agregar elementos Persona
		List<Persona> original = new ArrayList<Persona>();

		// Creamos una lista para filtrar la info de la original
		List<Persona> filtrada = new ArrayList<Persona>();

		// Añadir elementos a la lista original
		original.add(new Persona("Alex", 30, "MASCULINO"));
		original.add(new Persona("Alanis", 25, "FEMENINO"));
		original.add(new Persona("Cesar", 39, "MASCULINO"));
		original.add(new Persona("Oscar", 23, "MASCULINO"));
		original.add(new Persona("Guadalupe", 25, "FEMENINO"));
		original.add(new Persona("Juan", 31, "MASCULINO"));
		original.add(new Persona("Monica", 27, "FEMENINO"));
		original.add(new Persona("Paola", 26, "FEMENINO"));
		original.add(new Persona("Ivan", 32, "MASCULINO"));
		original.add(new Persona("Rafael", 22, "MASCULINO"));

		// imprimir la lista original en consola
		// System.out.println(original);

		// Recorrer nuestra lista para ver cada elemento con un ciclo for
		// for (int i = 0; i < original.size(); i++) {
		// System.out.println(original.get(i));

		// Recuperar todos los elementos con el ciclo forEach

//			for (Persona i : original) {
//				System.out.println(i);
//			}
		// }

		// forEach pero ahora a través de nuestra lista (Expresion lambda)
		// original.forEach(a -> System.out.println(a));

		// Si filtraramos a los elementos del genero masculino
		// con un ciclo convencional
//		for (Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}

		// Filtrar con el API Stream a las personas del genero femenino
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		//filtrada.forEach(a -> System.out.println(a));
//		filtrada.forEach(System.out::println);

		// Ordenar a las personas por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		 
//		filtrada.forEach(System.out::println);

		// Contar el numero de elementos de mis lista

//		long conteo = original.stream().count();
//		System.out.println(conteo);

		// Solicitar una variable boolean si algun elemento o todos
		// los elementos cumplen alguna condicion

//		boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
//		boolean alguno = original.stream().allMatch(a -> a.getEdad()<30);
//		System.out.println(alguno);

		// Retornar un valor a una clase Optional
		// Optional es una clase que nos permite manejar valores nulos,
		// en caso de que no se encuentren

		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);

	}

}
