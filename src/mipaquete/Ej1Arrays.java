package mipaquete;
import java.util.Arrays;

public class Ej1Arrays {
//	Generar un array de enteros de 10 posiciones con números aleatorios entre 0 y 100 sin
//	que se repita ningún número, utiliza métodos si lo deseas.
	public static void main(String[] args) {
		int array[]=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=rellenar(array,i);
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static int rellenar(int[]array,int pos) {
		boolean repite=false;
		int num=(int)(Math.random()*11);
		do {
			repite=false;
			for (int i = 0; i < pos; i++) {
				if (num==array[i]) {
					repite=true;
					num=(int)(Math.random()*11);
					break;
				}
			}
		}while(repite);
		return num;
	}
}