package mipaquete;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		for(int i=0;i<=300;i+=20) {
			System.out.println(i + " Grados Fahrenheit son " + (i-32)*5/9 + " Grados centigrados");
		}
	}

}
