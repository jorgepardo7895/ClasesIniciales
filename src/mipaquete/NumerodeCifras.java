package mipaquete;

public class NumerodeCifras {
	public static void main (String arg[]) {
		
		int valor = 578;
		
		if(valor >=0 && valor <10) {
			System.out.println("Tiene un cifra");
		}else if(valor > 9 && valor < 100) {
			System.out.println("Tiene dos cifras");
		}else if (valor >99 && valor< 1000) {
			System.out.println("Tiene tres cifras");
		}else if (valor > 999 && valor <10000) {
			System.out.println("Tiene cuatro cifras");
		}else if (valor > 9999 && valor <100000) {
			System.out.println("Tiene cinco cifras");
		}else {
			System.out.println("Error");
		}
	}

}