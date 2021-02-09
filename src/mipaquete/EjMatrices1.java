package mipaquete;

import java.util.Arrays;

public class EjMatrices1 {
	//crear dos matrices de 3x3 de int rellenarala con elementos aleatorios utilizando metodos
	//y una tercera que me guarde la suma de las dos matrices primeras
	public static void main(String[] args) {
		int[][] numeros1=new int[3][3];
		System.out.println("Los numeros de la primera matriz son: ");
		rellenar(numeros1);
		int[][] numeros2=new int[3][3];
		System.out.println("Los numeros de la segunda matriz son: ");
		rellenar(numeros2);
		int[][]suma=new int[3][3];
		System.out.println("La suma de las matrices es: ");
		sumar(numeros1,numeros2,suma);
		
	}
	
	public static void rellenar(int[][]numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = (int)(Math.random()*101);
			}
			System.out.println(Arrays.toString(numeros[i]));
		}
	}
	
	public static void sumar(int[][]numeros1,int[][]numeros2,int[][]suma) {
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				suma[i][j] = numeros1[i][j]+numeros2[i][j];
			}
			System.out.println(Arrays.toString(suma[i]));
		}
	}	
}
