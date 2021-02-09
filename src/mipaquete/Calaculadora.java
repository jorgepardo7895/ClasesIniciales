package mipaquete;

import java.util.Scanner;

public class Calaculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float op, op2,operando;
		
		System.out.println("Introduce un numero");
		op = sc.nextFloat();
		System.out.println("Introduce el segundo numero");
		op2 = sc.nextFloat();
		System.out.println("Que operacion quieres realizar:"+"\n"+"1 - Suma "+"\n"+"2 - Resta "+"\n"+"3 - Multiplicacion "+"\n"+"4 - Division ");
		operando=sc.nextFloat();
		
		switch ((int)operando) {
		case 1:
			suma(op,op2);
			break;
		case 2:
			resta(op,op2);
			break;
		case 3:
			multiplicacion(op,op2);
			break;
		case 4:
			division(op,op2);
			break;
		}
		
	}
	public static float suma(float a, float b) {
		System.out.println("La suma es: "+ (a+b));
		return a+b;
	}
	public static float resta(float a, float b) {
		System.out.println("La resta es: "+ (a-b));
		return a-b;
	}
	public static float multiplicacion(float a, float b) {
		System.out.println("La multiplicacion es: "+ (a*b));
		return a*b;
	}
	public static float division(float a, float b) {
		System.out.println("La division es: "+ (a/b));
		return a/b;
	}
	
}
