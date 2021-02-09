package mipaquete;

import java.util.Scanner;

public class Metodos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero ");
		int num = sc.nextInt();
		factorial(num);
	}

	public static void factorial(int a) {
		int num =1;
		for (int i = 0; i < a-1; i++) {
			
			System.out.println(num *= (a-i));
		}
	}
}
