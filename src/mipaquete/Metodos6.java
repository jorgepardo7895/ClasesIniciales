package mipaquete;

import java.util.Scanner;

public class Metodos6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu turno"+"\n"+ "m - Mañana"+ "\n"+"t - Tarde"+"\n"+"n - Noche");
		String turno = sc.next();
		System.out.println("Introduce las horas");
		float horas = sc.nextFloat();
		System.out.println("Introduce tu categoria: "+"\n"+ "a - Normal"+ "\n"+"b - Cualificado"+"\n"+"c - gerencia");
		String cat =sc.next();
		
		sueldo(turno,horas,cat);
	}
	
	public static void sueldo(String a, float b, String c) {
		float total=0;
		switch(a) {
		case "m":
		case "t":
			total = 15 * b;
			break;
		case "n":
			total = (15+(15*0.05f))*b;
		}
		if(c.equals("a")) {
			System.out.println("El sueldo de sus "+ b + " horas trabajadas es: "+total+"€");
		}else if (c.equals("b")) {
			System.out.println("El sueldo de sus "+ b + " horas trabajadas es: "+(((b/5)*100)+total) +"€");
		}else if (c.equals("c")) {
			System.out.println("El sueldo de sus "+ b + " horas trabajadas es: "+(((b/3)*200)+total)+"€");
		}
		
	}
}
