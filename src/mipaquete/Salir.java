package mipaquete;

public class Salir {
	public static void main (String arg[]) {
		char respuesta = 'n';
		
		System.out.println("Desea salir del programa: s/n");
		if(respuesta == 's') {
			System.out.println("Saliendo del programa...");
		}else if(respuesta == 'n'){
			System.out.println("Continuando...");
		}
		else {
			System.out.println("Por favor presione 's' para salir o 'n' para continuar en el programa");
		}
		
	}

}
