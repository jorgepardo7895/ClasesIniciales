package mipaquete;

import java.util.Scanner;

public class CalculadoraString2 {

	public static void main(String[] args) {
		// Esta es la calculadora realizada para el trabajo fin del primer trimestre, debe ser la 5 o 6 que realizo, ninguna me gustaba y al final me he quedado con esta
		// aunque probablemente tenga alguna cosa mas que depurar pero es bastante funcional
		Scanner sc=new Scanner(System.in);
		String operacion="",operador="",resultado="",respuesta="";
		float result=0,numero,numero2;
		int cont=0;
		boolean repetir=true, salir=false, continuar=false, letra=false,flag=false;
		
		//tenemos el bucle principal que se ejecuta simepre que salir sea falso
		System.out.println("Bienvenido a la calculadora por favor evita introducir letras y comas"+"\n"+"Recuerda el formato: Operando + Operador + Operando"+"\n"+"Si quieres finalizar el programa puedes escribir salir y el programa finalizara");
		do {
			//Le perdimos al usuario que introduzca la operacion que quiere realizar y la almacenamos
			System.out.println("Introduce la operacion que deseas realizar");
			operacion=sc.next();
			flag=false;
			cont=0;
			
			//este es el bucle secundario que se ejecuta siempre que a no ser que queramos empezar de cero
			do {
				cont=0;
				if(operacion.length()<3) {
					System.out.println("\n"+"\n"+"A ver manu, no le busques fallos que no los hay xD INTRODUCE LA OPERACION COMPLETA por favor"+"\n"+"\n");
					break;	
				}else if(!continuar && !salir && !letra) {	
					//el mitico bucle for para recorrer toda la operacion introducida y chequear los valores que se han introducido
					for (int i = 0; i < operacion.length(); i++) {
						//si contiene salir finaliza el programa
						if (operacion.contains("salir")) {
							salir=true;
							System.out.println("Saliendo, Gracias por utilizarme");
							return;
						//sino le digo que compruebe si hay una letra exceptuando los simbolos operacionales, si se cumple que avise al usuario y me cambie la variable letra a true
						}else if((Character.isLetter(operacion.charAt(i))||operacion.contains(","))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))) {
							letra=true;
						}
						//si la variable letra es true entramos en esta condicion que ejecuta un bucle con tres intentos para que el usuario meta una combinacion sin letras o escriba salir para salir
						if (letra) {
							do {
								System.out.println("Solo puedo operar con numeros, por favor introduce una operacion sin caracteres extraños");
								operacion=sc.next();														
									if (operacion.contains("salir")) { //si introduce una s el programa finaliza
										salir=true;
										System.out.println("Salir");
										return;
									}else if((!Character.isLetter(operacion.charAt(i))||operacion.contains(","))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))) {
										letra=false;
										break;	
									}else if(cont==3) {
										salir=true;
										System.out.println("Es un parajo? Es un avion? no... es manu intentando trolearme. Pues me cierro, chauuu!!");
										return;
									}
								cont++;
							}while(letra);
						}
					}
				// en esta condicion se cumple si el usuario quiere continuar operando con el resultado	
				}else if(continuar && !salir){
					System.out.println(result);
					//operacion pasaria a valer el resultado mas lo que introduzca el usuario
					operacion=resultado.concat(sc.next());
					for (int i = 0; i < operacion.length(); i++) {
						if((Character.isLetter(operacion.charAt(i))||operacion.contains(","))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))) {
							System.out.println("Vaya mi sentido aracnido a detectado una caracter no admitido, por favor corrigelo =)");
							letra=true;
						}else if (operacion.contains("salir")) { 
							salir=true;
							System.out.println("Salir");
							return;
						}
						if (letra) { 
							do {
								System.out.println("Por favor corrige la operacion =)");
								operacion=resultado.concat(sc.next());														
									if (operacion.contains("salir")) { 
										salir=true;
										System.out.println("Saliendo, Hasta la proxima!!");
										return;
									}else if((!Character.isLetter(operacion.charAt(i))||operacion.contains(","))&&((operacion.charAt(i)!='*')||(operacion.charAt(i)!='/')||(operacion.charAt(i)!='+')||(operacion.charAt(i)!='-'))) {
										letra=false;
										break;	
									}								
							}while(letra);
						}
					}
				}	
				
				
				//comprobamos el simbolo que contiene la operacion introducida y la guardamos en la variable operador 
				//para luego usarla para delimitar los numeros en la string
				if (operacion.contains("*")) {				
					operador="*";			
				}else if(operacion.contains("/")) {
					operador="/";
				}else if (operacion.contains("+")){
					operador="+";
				}else if (operacion.contains("-")) {
					operador="-";
				}
				
				//en las cuatro siguientes lineas lo que hacemos es sacar los numeros con los que vamos a operar de la String
				//y los alamacenamos en una variable float con el parsefloat
				String num1=operacion.substring(0, operacion.indexOf(operador));//esta linea nos coje el primer digito
				String num2=operacion.substring(operacion.indexOf(operador)+1, operacion.length());//esta nos coje el segundo
				numero= Float.parseFloat(num1); 
				numero2= Float.parseFloat(num2);
				
				//En los siguiente condicionales realizamos la operacion correspondiente y la almacenamos el resultado en la 
				//variable result por si luego queremos seguir operando con el
				if(operador.equals("*")) {
					result=numero*numero2;
				}else if(operador.equals("/")) {
					result=numero/numero2;
				}else if(operador.equals("+")) {
					result=numero+numero2;
				}else if(operador.equals("-")) {
					result=numero-numero2;
				}

				//mostramos el resultado y preguntamos al usuario si quiere continuar operando con el o por el contrario
				//quiere empezar de nuevo
				do {
					System.out.println(result);
					System.out.println("¿Quieres continuar operando con el resultado?");
					respuesta=sc.next();
					if(respuesta.equals("si")) {
						numero=result;					
						repetir=true;
						continuar=true;
						flag=true;
						resultado=""+result;
						continue;
					}else if (respuesta.equals("no")) {
						repetir=false;
						continuar=false;
						flag=true;
						resultado="";
						break;
					}if (respuesta.contains("salir")) {
						salir=true;
						System.out.println("Saliendo, Gracias por utilizarme");
						return;
					}
				}while(!flag);
			}while(repetir);
		}while(!salir);
	}
	
}
