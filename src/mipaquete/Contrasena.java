package mipaquete;

import java.util.Scanner;

public class Contrasena {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cont="";
		String ent="";
		System.out.println("Introduzca la contraseņa");
		cont=sc.next();
		System.out.println("Introduzca la contraseņa para acceder");
		
		for (int i = 3; i >= 0; i--) {
			ent=sc.next();
			if (ent.equals(cont)) {
				System.out.println("Bienvenido");
				break;
			}else {
				System.out.println("No es correcto le quedan: "+i+" intentos");
			}
			if (i==0) {
				System.out.println("No le quedan intentos");
				break;
			}
		}
	}

}
