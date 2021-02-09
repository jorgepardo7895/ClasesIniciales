package mipaquete;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero=(int)(Math.random()*100)+1;
		int num;
		System.out.println("Introduce un numero");
		for (int i = 5; i >0; i--) {

			num=sc.nextInt();
			System.out.println(numero);
			if(num==numero) {
				System.out.println("Enorabuena has acertado!!");	
				break;
			}else if(num!=numero){
				System.out.println("Prueba otra vez, te quedan "+(i-1)+" intentos");
			}
			if(i==1) {
				System.out.println("Lo siento no has acertado, el numero era: "+numero);
			}
		}		
		
	}

}
