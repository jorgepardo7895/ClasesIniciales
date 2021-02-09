package mipaquete;

public class AleatorioAltoBajoMedia {

	public static void main(String[] args) {
		int num;
		int mayor = 0;
		int menor = 1000;
		float suma = 0;
		
		for(int i=1; i<=50; i++) {
			num = (int)(Math.random()*1001);
			suma+=num;
			
			if(num > mayor) {
				mayor=num;
			}
			if(num < menor) {
				menor=num;
			}
		}System.out.println("El numero mayor es: " + mayor);
		 System.out.println("El numero menor es: " + menor);
		 System.out.println("La media es: " + suma/50);
	}
}
