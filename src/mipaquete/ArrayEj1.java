package mipaquete;

import java.util.Scanner;

public class ArrayEj1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String array[]=new String[5];
		rellenar(array,sc);
		mostrar(array);
	}
	public static void rellenar(String[] a,Scanner sc) {	
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introduce la palabra");
			a[i]=sc.nextLine();
		}
	}
	public static void mostrar(String[] a) {
		int pos=0;
		for (String iterador: a) {
			System.out.println(iterador+" posicion "+pos);
			pos++;
		}
	}
}