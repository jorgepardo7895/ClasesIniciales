package mipaquete;
import java.util.Arrays;
public class EjArraysOrdenar {
// metodo Array.sort que nos ordena el contenido de un array automaticamente
	public static void main(String[] args) {
		
		int[]numeros=new int[] {10,5,3,9,7};
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		int[]numerosRandom=new int[10];
		rellenar(numerosRandom);
		ordenar(numerosRandom);
	}
	
	public static void rellenar(int[]numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*51);
		}
		System.out.println(Arrays.toString(numeros));
	}
	
	public static void ordenar(int[]numeros) {
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i]<numeros[j]) {
					aux=numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=aux;
				}
			}
		}
		System.out.println(Arrays.toString(numeros));	
	}
}