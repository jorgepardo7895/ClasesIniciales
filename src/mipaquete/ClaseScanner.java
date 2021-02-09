package mipaquete;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		//declarar e instanciar un objeto de la clase scanner
		 Scanner teclado = new Scanner(System.in);
		 
		 
		 System.out.println("introduzca un numero");
		 int nombre=teclado.nextInt();
		 System.out.println("Hola "+ nombre);
		 
		 
	}
}
