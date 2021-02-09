package mipaquete;

public class DoWhile {
	public static void main(String[] args) {
		int tabla = 7;
		int contador = 1;
		
		do {
			System.out.println(tabla + " x " + contador + " = " + (tabla*contador));
			contador++;
		}while (contador<=10);

	}
}