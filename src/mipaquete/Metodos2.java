package mipaquete;

import java.util.Scanner;

public class Metodos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de articulos");
		int cant = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el precio unitario");
		float precio = Float.parseFloat(sc.nextLine().replace(',', '.'));
		System.out.println("Introduce la categoria");
		char cat = sc.nextLine().charAt(0);
		
		System.out.println(total(cant,precio,cat));

	}
	
	public static float total(int a,float b, char c) {
		float total = 0f;
		switch (c){
		case 'a':
			total = a*b;
			break;
		case 'b':
			total = (a*b)-(a*b)*0.05f;
			break;
		case 'c':
			total = (a*b)-(a*b)*0.1f;
			break;
		default:
			System.out.println("Opcion erronea");
			break;
		}
		return total;
	}
}
