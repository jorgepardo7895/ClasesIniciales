package mipaquete;

public class Examen1 {

	public static void main(String[] args) {
		String frase = "Los murcielagos estaban anclados en el techo sedientos de sangre";
		int cont = 0;
		int longitud = frase.length()-1;
		
		for (int i = 0; i <=longitud; i++) {
			if(frase.charAt(i) == 'a' || frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u') {
				cont++;
			}
		}System.out.println("La frase contiene "+cont+ " vocales");
	}

}
