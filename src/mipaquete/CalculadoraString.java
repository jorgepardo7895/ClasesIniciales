package mipaquete;

import java.util.Scanner;

public class CalculadoraString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String operacion="",operador="",resultado=" ";
		float result=0;
		boolean letra=false;
		boolean rep=true, salir=false, cont=false;
		
		do {
			//Le perdimos al usuario que introduzca la operacion que quiere realizar
			System.out.println("Introduce tu operacion");
			operacion=sc.next();
			salir=false;
			
			do {
				if(!cont) {				
					for (int i = 0; i < operacion.length(); i++) {
											
						if(Character.isLetter(operacion.charAt(i))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))&&((!operacion.contains("s")||!operacion.contains("c")) )) {
							System.out.println("Has introducido una letra1");
							letra=true;
						}
						if (letra==true) {

								do {
								System.out.println("Introduce tu operacion, sin letras por favor");
								operacion=sc.next();								
									if(!Character.isLetter(operacion.charAt(i))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))) {
										letra=false;
										break;								
									}
								
							}while(letra);
						}
					}
				}else if(cont){
					operacion=resultado.concat(sc.next());
					for (int i = 0; i < operacion.length(); i++) {
						
						if(Character.isLetter(operacion.charAt(i))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))&&(!operacion.contains("s")||!operacion.contains("c"))) {
							System.out.println("Has introducido una letra");
							letra=true;
						}
						if (letra==true) {

								do {
								System.out.println("Introduce tu operacion, sin letras por favor");
								operacion=sc.next();								
									if(!Character.isLetter(operacion.charAt(i))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-')||(operacion.charAt(i)!='s')||(operacion.charAt(i)!='c'))) {
										letra=false;
										break;								
									}
								
							}while(letra);
						}
					}	
				}
				
				//comprobamos el simbolo que contiene la operacion introducida y la guardamos en la variable operador
				if (operacion.contains("*")) {				
					operador="*";			
				}else if(operacion.contains("/")) {
					operador="/";
				}else if (operacion.contains("+")){
					operador="+";
				}else if (operacion.contains("-")) {
					operador="-";
				}else if (operacion.contains("s")) {
					operador="s";
				}else if (operacion.contains("c")) {
					operador="c";
				}
				
				//en las cuatro siguientes lineas lo que hacemos es sacar los numeros con los que vamos a operar de la String
				String num1=operacion.substring(0, operacion.indexOf(operador));//esta linea nos coje el primer digito
				String num2=operacion.substring(operacion.indexOf(operador)+1, operacion.length());//esta nos coje el segundo
				float numero= Float.parseFloat(num1); //aqui cambiamos la variable num1 del tipo String a float
				float numero2= Float.parseFloat(num2);//aqui cambiamos la variable num2 del tipo String a float
				
				//En los siguiente condicionales realizamos la operacion correspondiente y la almacenamos en la variable result
				if(operador.equals("*")) {
					result=numero*numero2;
				}else if(operador.equals("/")) {
					result=numero/numero2;
				}else if(operador.equals("+")) {
					result=numero+numero2;
				}else if(operador.equals("-")) {
					result=numero-numero2;
				}else if(operador.equals("c")) {
					rep=false;
				}else if(operador.equals("s")) {
					salir=true;
				}
				numero=result;
				if (numero==result) {
					rep=true;
					cont=true;
					resultado=""+result;
				}
				System.out.println(result); 
			}while(rep);
		}while(!salir);
	}
	
}
