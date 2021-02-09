package mipaquete;

public class Numeros {
	public static void main(String arg[]) {
		int num = 20;
		
		if(num>=0 && num<21) {
			System.out.println("El numero esta entre 0-20");
		}else if (num>20 && num<51) {
			System.out.println("El numero esta entre 21-50");
		}else if(num>50 && num<71) {
			System.out.println("El numero esta entre 51-70");
		}else if(num>70 && num<101) {
			System.out.println("El numero esta entre 71-100");
		}else {
			System.out.println("El numero esta fuera de rango");
		}
	}
}
