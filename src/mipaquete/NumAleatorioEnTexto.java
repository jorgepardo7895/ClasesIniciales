package mipaquete;

public class NumAleatorioEnTexto {

	public static void main(String[] args) {
		int num = 0;
		String pares="", impares="", mayor="", menor="";
		
		for(int i=1; i<=20; i++) {
			num=(int)(Math.random()*101);
			
			if(num%2==0) {
				pares+=num+", ";
			}else {
				impares+=num+", ";
				
			}if (num<51) {
				menor+=num+", ";
			}else if (num>50) {
				mayor+=num+", ";
			}
		}System.out.println("Numeros pares: " +pares);
		 System.out.println("Numeros impares: " +impares);
		 System.out.println("Numeros del 51 al 100: "+mayor);
		 System.out.println("Menores de 51: "+menor);
	}

}
