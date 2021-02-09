package mipaquete;

import java.util.Arrays;

public class Matrizes {
//declaracion, instancia y relleno automatico de una matriz y posterior syso
	public static void main(String[] args) {
		int matriz [][] = new int [5][5];
		int contador=1;
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = contador;
				contador++;
			}
			
		}
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}

}
