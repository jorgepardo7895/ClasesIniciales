package mipaquete;

public class BucleCero {
	
	//crear un bucle que pare cuando el numero aleatorio sea igual 0 y nos diga las veces que se ha ejecutado el bucle

	public static void main(String[] args) {
		
		int num;
		int cont=0;
		
		do {
			num=(int)(Math.random()*6);
//			System.out.println(num);
			cont++;
			
		}while(num != 0);
				System.out.println("numero de veces " + cont);
	}

}