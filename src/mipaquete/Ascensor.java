package mipaquete;

public class Ascensor {

	public static void main(String[] args) {
		int pisoActual = 75;
		int pisoElegido = 0;
		int pisosTotales = 100;
		int difPisos = 0;
		int pisoFinal = 0;
		int pesoActual = 80;
		int pesoLimite = 120;
		int velocidad= 0;
		boolean puertaAbiertas = false;
		
		
		if(!puertaAbiertas) {  //si las puertas no estan abiertas, abrelas
			System.out.println("Abriendo Puertas...");
			puertaAbiertas=true;
		}
		if(pesoActual<=pesoLimite) {   //comprobamos que no excedamos el peso limite del ascensor
			
			if(pisoElegido<=pisosTotales){//el piso elegido tiene que ser menor o igual al los pisos totales
				difPisos=pisoElegido-pisoActual; //si se cumple la condicion sacamos la diferencia de pisos y que no sea igual a 0
				
				if(difPisos!=0) {
					System.out.println("Cerrando puertas...");
					puertaAbiertas=false;
						
						//para subir usamos las siguientes condiciones
						
					if(difPisos>0 && difPisos <=10) {
							
						do {
							velocidad = 2;
							pisoActual++;
							System.out.println("Subiendo..." + pisoFinal);
							pisoFinal = pisoActual;
								
						}while(pisoElegido!=pisoActual);
							
					}else if(difPisos>10 && difPisos <=50) {
							
						do {
							velocidad = 7;
							pisoActual++;
							pisoFinal = pisoActual;								
							System.out.println("Subiendo..." + pisoFinal);
								
						}while(pisoElegido!=pisoActual);
							
					}else if(difPisos>50 && difPisos<=99) {
							
						do {
							velocidad = 10;
							pisoActual++;
							System.out.println("Subiendo..." + pisoFinal);
							pisoFinal = pisoActual;
								
						}while(pisoElegido!=pisoActual);
							
					}						
						//para bajar utilizamos las siguientes condiciones
						
					else if(difPisos<0 && difPisos >=-10) {
							
						do {
							velocidad = 2;
							pisoActual--;
							pisoFinal = pisoActual;							
							System.out.println("Bajando..." + pisoFinal);
								
						}while(pisoElegido!=pisoActual);
							
					}else if(difPisos<-10 && difPisos >=-50) {
						do {
							velocidad = 7;
							pisoActual--;
							pisoFinal = pisoActual;							
							System.out.println("Bajando..." + pisoFinal);
								
						}while(pisoElegido!=pisoActual);
							
					}else if(difPisos<-50 && difPisos>=-99) {
						do {
							velocidad = 10;
							pisoActual--;
							pisoFinal = pisoActual;							
							System.out.println("Bajando..." + pisoFinal);
								
						}while(pisoElegido!=pisoActual);
							
							//cuando hemos llegado al destino salimos del bucle y de la condicion y mostrariamos el mensaje final y abrimos la puerta
					}System.out.println("El ascensor ha llegado, está en el piso: " + pisoFinal + " La velocidad ha sido: " + velocidad);
					System.out.println("Abriendo puertas...");
					puertaAbiertas = true;
						
				}else {
					System.out.println("Error has elegido el piso en el que estas");
				}
			}else {
				System.out.println("Error de Seleccion");
			}
		}else {
			System.out.println("Ha sobrepasado el limite de peso");
			
		}

	}
	
}
