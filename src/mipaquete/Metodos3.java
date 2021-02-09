package mipaquete;

import java.util.Scanner;

public class Metodos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero 1");
		int num1 = sc.nextInt();
		System.out.println("Introduce el numero 2");
		int num2 = sc.nextInt();
		
		if(num1>=num2) {
			random(num1,num2);
		}else {
			random(num2,num1);
		}
		

	}

	public static void random(int a, int b) {
		System.out.println((int)(Math.random()*(b-a+1)+a));
	}
}
