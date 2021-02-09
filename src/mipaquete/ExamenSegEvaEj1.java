package mipaquete;

import java.util.Scanner;
import java.util.Arrays;


public class ExamenSegEvaEj1 {
//	Crear una aplicación en Java que solicite por teclado las dimensiones de una matriz, filas y
//	columnas (no tienen por qué coincidir). Crear un método que rellene la matriz con números
//	enteros consecutivos de mayor a menor. (2 ptos).
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,num2,cont;
		System.out.println("Introduce el numero de filas de la matriz");
		num=sc.nextInt();
		System.out.println("Introduce el numero de columnas de la matriz");
		num2=sc.nextInt();
		cont=num*num2;
		int numeros[][]=new int[num][num2];
		rellenar(numeros,cont);
	}
	public static void rellenar(int[][]nums,int cont) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[i][j]=cont;
				cont--;
			}
			System.out.println(Arrays.toString(nums[i]));
		}
	}
}
