package mipaquete;

import java.util.Scanner;

public class Scanner5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int intro,cont=0,mayor=0,menor=9999999,suma=0,pos=0,neg=0;
		float media=0f;		
		
		do {
			System.out.println("Introduce tu numero");
			intro=sc.nextInt();			
			if(intro==-1) {
				media=(float)suma/(float)cont;
				System.out.println("El numero mayor es: "+ mayor+", El numero menor es: "+menor+ ", La suma es: "+suma
						+" La suma de los positivos es: "+pos+" La suma de negativos es: "+neg+ " La media es: "+ media);
			}else {
				suma+=intro;
				cont++;				
				if(intro>mayor) {
					mayor=intro;
				}
				if(intro<menor){
					menor=intro;
				}
				if(intro>=0) {
					pos+=intro;
				}else {
					neg+=intro;
				}
			}			
		}while(intro!= -1);
		
	}

}
