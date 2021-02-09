package mipaquete;

import java.util.Arrays;

public class ArrayNoSeRepita {

	public static void main (String arg[]) {
		int array[] = new int[10];
		
		for(int i=0 ; i< array.length ; i++) {
			array[i] = rellenar(array, i);
		}		
		System.out.println(Arrays.toString(array));		
	} //fin main
	
	public static int rellenar(int ar[], int pos) {		
		boolean repite= false;
		int num=(int)(Math.random() * 11);
		System.out.println(" 1º intento " + pos +" " + num);
		do{			 
			repite = false;
			for(int i=0 ; i < pos ; i++) {
				
				if(num == ar[i]) {
					repite = true;
					num=(int)(Math.random() * 11);
					System.out.println(" 2º intento " + pos +" " + num);
					break;
				}
			}
		}while(repite == true );
		return num;
	}		
}