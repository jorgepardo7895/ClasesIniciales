package mipaquete;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String array[]=new String[5];
		String reverse[]=new String[5];
		rellenar(array,sc);
		darvuelta(array,reverse);
		
	}
	public static void rellenar(String[] a,Scanner sc) {	
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introduce la palabra");
			a[i]=sc.nextLine();
		}
	}
	
	public static void darvuelta(String[]a, String[]b) {
		int cont =0;
		for (int i = a.length-1; i >= 0 ; i--) {
			b[cont]=a[i];
			cont++;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
