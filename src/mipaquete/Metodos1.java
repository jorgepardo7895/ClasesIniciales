package mipaquete;

import java.util.Scanner;

public class Metodos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Introduce la frase");
		String frase = sc.nextLine();		
		System.out.println("¿Que quieres hacer?");
		int opc = sc.nextInt();

		switch (opc) {
		case 1:
			invertir(frase);
			break;
		case 2:
			mayusculas(frase);
			break;
		default:
			System.out.println("No tengo esa opcion");
			break;
		}
	}
	
	public static void mayusculas(String a) {
		System.out.println(a.toUpperCase());
	}
	
	public static void invertir(String a) {
		String res="";
		for (int i = a.length()-1; i >=0; i--) {
			res+=a.charAt(i);
		}
		System.out.println(res);
	}
}
