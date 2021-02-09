package mipaquete;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2, resul,resul2=0,cont=0, res;
		String frase="";
		System.out.println("Introduce el primer numero");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo");
		num2=sc.nextInt();
		//si el ususario mete el numero mayor primero los cambiamos de orden
		if(num1>num2) {
			res=num1;
			num1=num2;
			num2=res;
		}
		//una vez que los numero esta en el orden correcto ejecutamos el bucle
		//que nos genera un numero aleatorio ente el num1 y num2
		if(num1<num2){
			do {
			resul=(int) (Math.random()*num2+1-num1)+num1;
				frase+=" "+ resul;
				cont++;
			}while (cont<10);
		System.out.println(frase);
		}
		
	}

}
