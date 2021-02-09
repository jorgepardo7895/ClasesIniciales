package mipaquete;

import java.util.Scanner;

public class Scaner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Intoduzca numero de ventas realizadas");
		int nventas=sc.nextInt();
		int cont=nventas;
		int total=0;
		
		for (cont=nventas;  cont>0 ; cont--) {
			System.out.println("Introduce el precio de la venta ");
			nventas=sc.nextInt();
			total=total+nventas;
		}
	System.out.println("El precio total de la venta es: "+total);	
	}

}
