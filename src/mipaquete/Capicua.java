package mipaquete;
import java.util.Scanner;
//programa que pida por teclado un n�mero entero N 
//de m�s de una cifra y verifique si es capic�a
public class Capicua {
  public static void main(String[] args) {
	    int N, aux, inverso =0, cifra;
	    Scanner sc = new Scanner(System.in);
	    do {
	         System.out.print("Introduce un n�mero >= 10: ");                                                 
	          N = sc.nextInt();
	    } while (N < 10);
	       
	    //le damos la vuelta al n�mero
	    aux = N;
	    while (aux!=0){
	    	cifra = aux % 10; //Obtenemos la �ltima cifra del aux
	    	inverso = inverso * 10 + cifra;
	        aux = aux / 10; //Quitamos la �ltima cifra a aux
	    }
	    
	    if(N == inverso){
	            System.out.println("Es capic�a");
	    }else{
	            System.out.println("No es capic�a");
	    }
  }
}