package mipaquete;

import java.util.Scanner;

public class Ahorcado1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String palabras[] = new String []{"arrays","polvorones","turron","metodos","bucles","condicionales","variables","instanciar","constructor","clases","boolean","roscon"} ;
		System.out.println("Hola bienvenido al ahorcado navideño, tienes 10 intentos para adivinar la palabra, SUERTE!!!");
		jugar(palabras,sc);
	}

	//método principal que se ejecuta siempre al menos una vez. Una vez jugada la primera partida pregunta si quieres
	//jugar otra partida más o finalizar la aplicación
	public static void jugar(String palabras[],Scanner sc) {
		boolean jugar=true;
		String respuesta="";
		String adivinar=palabras[(int)(Math.random()*palabras.length)];
		char oculta[]=convertir(adivinar);
		boolean resultado = adivinar(adivinar,oculta);		
		resultado(resultado,adivinar);
		
		while(jugar) {
			System.out.println("¿Quieres jugar otra partida?S/N");
			respuesta=sc.next();
			if (respuesta.equals("s")) {
				adivinar=palabras[(int)(Math.random()*palabras.length)];
				oculta=convertir(adivinar);
				resultado = adivinar(adivinar,oculta);
				resultado(resultado,adivinar);
			}else {
				jugar=false;
			}
		}
	}

	//método en el que creamos un array con las letras de la palabra elegida aleatoriamente	
	public static char[] convertir(String a) {
		char oculto[] = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			oculto[i]='_';
		}
		return oculto;
	}	

	//método en el que vamos a ir metiendo letras para intentar adivinar la palabra, devuelve un bool 
	//que nos sirve para mostrar una frase de victoria o derrota, dentro tienes una línea comentada, si la
	//descomentas puedes ver la palabra que hay que adivinar y así te facilitará comprobar el funcionamiento
	public static boolean adivinar(String palAdivinar, char oculta[]) {
		Scanner sc = new Scanner(System.in);
		//Descomenta la linea de abajo para facilitarte el uso
		//System.out.println("La palabra es: "+ a);
		boolean win=false;
		int cont=1,aciertos=0;
		String intento,palabra="";
		
		for (int i = 0; i < oculta.length; i++) {
			palabra+=oculta[i]+" ";
		}
		System.out.println("Empezamos, introduce la primera letra!!");
		do {
			System.out.println(palabra);
			if(aciertos==palAdivinar.length()) {
				win=true;
				
			}else {
				intento=sc.next();
				if(palAdivinar.contains(intento)) {
					for (int i = 0; i < palAdivinar.length(); i++) {
						if(palAdivinar.charAt(i)==intento.charAt(0) && oculta[i]=='_') {
							oculta[i]=intento.charAt(0);
							aciertos++;
							palabra="";
							for (int x = 0; x < oculta.length; x++) {
								palabra+=oculta[x]+" ";					
							}
						}else if(palAdivinar.charAt(i)==intento.charAt(0) && oculta[i]!='_') {
							System.out.println("Has reperido letra! Llevas: "+cont+ " fallos de 10, ten mas cuidado!!");
							cont++;
							break;
							}
					}	
				}else{
					System.out.println("Llevas: "+cont+ " fallos de 10, prueba otra vez!!");
					cont++;
				}
			}
		}while(cont <= 10 && !win);
		return win;
	}

	//este método sirve para evaluar un bool y mostrar una fras e aleatoria de derrota o de victoria
	public static void resultado(boolean a,String palAdiv) {
		String fraseVictoria[] = new String [] {"Guauu!! eres el puto amo", "¿No habras nacido para esto?'crack'","Felicidades, te has ganado un pin de regalo","Enhorabuena, ¿Quieres una medalla?"};
		String fraseDerrota[] = new String [] {"La cagaste Burlancaster","JAJAJA ¿Has bebido o algo?","¿Enserio como has podido perder?","Vaia no me esperaba esto de ti"};

		if(a) {
			System.out.println(fraseVictoria[(int)(Math.random()*fraseVictoria.length)]);
		}else  {
			System.out.println("La palabra era: "+palAdiv+ ", "+fraseDerrota[(int)(Math.random()*fraseDerrota.length)]);
		}
	}
}