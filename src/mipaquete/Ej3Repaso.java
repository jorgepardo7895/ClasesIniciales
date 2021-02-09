package mipaquete;

public class Ej3Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		int res = 1;
//		do {
//			res*=numero;
//			numero--;
//		} while (numero>0);
//		System.out.println(res);
		
		for (int i= numero; numero>0; numero--) {
			res*=numero;
		}
		System.out.println(res);
		
	}

}
