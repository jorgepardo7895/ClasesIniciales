package mipaquete;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("Introduce el area que quieres calcular:"+"\n"+"1 - Cuadrado"+"\n"+ "2 - Circunferencia"+"\n"+"3 - Triangulo");
		int seleccion = (int)teclado();
		perimetros(seleccion);
	}
	
	public static void perimetros(int x) {
		float resultado;
		switch (x) {
		case 1:
			System.out.println("Introduce el lado");
			float a = teclado();
			resultado = (float)Math.pow(a, 2);
			System.out.println("El area del Cuadrado es "+resultado);
			break;
		case 2:
			System.out.println("Introduce el radio de la circunferencia");
			float c = teclado();
			resultado = (float)(Math.PI * Math.pow(c, 2));
			System.out.println("El area del circulo es "+resultado);
			break;
		case 3:
			System.out.println("Introduce la base");
			float d = teclado();
			System.out.println("Introduce la altura");
			float e = teclado();
			resultado = (float)(d*e)/2;
			System.out.println("El area del triangulo es: "+ resultado);
			break;
		default:
			System.out.println("Opcion no computable");
		}
		
	}
	
	public static float teclado() {
		Scanner sc = new Scanner(System.in);
		float entrada = sc.nextFloat();
		return entrada;
	}
}
