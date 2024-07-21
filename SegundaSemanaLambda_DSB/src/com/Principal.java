package com;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones Lambda - Son expresiones o funciones
		//"anónimas" que implementan un método de una interface
		//funcional
		//Estas expresiones nos van a permitr escrbir o "sobreescribir"
		//un método para su uso inmediato
		//Sin que una clase defina CÓMO se va a realizar
		//Su operador es ->
		//Su sintaxis es (parametros)-> {cuerpo lambda}
		
		//Vamos a ver un ejemplo de un objeto creado a través de
		//una clase "anónima" que me permita implementar la interface
		//IMetodo y vamos a definir CÓMO se realiza ese método
		//o más bien, que es lo que queremos solicitarle
		IMetodo sumar = (c,d) -> System.out.println("La suma es: " +(c+d));
		IMetodo restar = (x,y) -> System.out.println("La resta es: " + (x-y));
		
		//Una vez definido el método, podemos hacer uso inmediato del mismo
		sumar.operacion(5,11);
		restar.operacion(76, 50);
		
		//.filter (a) -> .equals("ALEJANDRO");
		//.filter (a) -> .getEdad(20);
		
		
		

	}

}
