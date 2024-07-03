package com;

public class Cientifica extends Calculadora implements ITermometro {

	@Override
	public void sumar(double a, double b) {
		System.out.println("La suma es " + (a + b));

	}

	@Override
	public void restar(double a, double b) {
		System.out.println("La resta es " + (a - b));

	}

	@Override
	public void multiplicar(double a, double b) {
		System.out.println("La multiplicacion es " + (a * b));

	}

	@Override
	public void dividir(double a, double b) {
		System.out.println("La division es " + (a / b));

	}

	public void sumar(double a, double b, double c) {
		System.out.println("La suma es " + (a + b + c));
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("La temperatura corporal es 36.5°C");

	}

}
