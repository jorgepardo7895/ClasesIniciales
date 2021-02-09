package mipaquete;

import java.util.Scanner;

public class Metodos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre de usuario");
		String user = sc.next();
		System.out.println("Introduce tu contraseña");
		String pass = sc.next();
		comprobacion(user,pass);
		
	}
	
	public static void comprobacion(String a, String b) {
		String user = "jorge", pass = "1234";
		if(a.equals(user) && b.equals(pass)) {
			saludar(user);
		}else if (!a.equals(user) && b.equals(pass)) {
			error(a);
		}else if (a.equals(user) && !b.equals(pass)) {
			error("");
		}else {
			System.out.println("Todo mal");
		}
	}
	
	public static void saludar(String a) {
		System.out.println("Bienvenido "+ a);
	}
	
	public static void error(String a) {
		if (!a.equals("")) {
			System.out.println("No existe el usuario "+a);
		}else  {
			System.out.println("Contraseña incorrecta");
		}
	}
}
