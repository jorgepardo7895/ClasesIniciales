package mipaquete;

public class Examen2 {

	public static void main(String[] args) {
		int numero = 9;
		int result;
		int cont = 0;
		int refactor = 1;
		
		while(cont<numero) {
			result= numero-cont;
			refactor *= result;
			cont++;
		}System.out.println("El factorial del numero "+ numero +" es " + refactor);
	}

}
