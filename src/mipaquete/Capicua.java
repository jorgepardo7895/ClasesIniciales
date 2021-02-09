package mipaquete;
import java.util.Scanner;
//programa que pida por teclado un número entero N 
//de más de una cifra y verifique si es capicúa
public class Capicua {
  public static void main(String[] args) {
	    int N, aux, inverso =0, cifra;
	    Scanner sc = new Scanner(System.in);
	    do {
	         System.out.print("Introduce un número >= 10: ");                                                 
	          N = sc.nextInt();
	    } while (N < 10);
	       
	    //le damos la vuelta al número
	    aux = N;
	    while (aux!=0){
	    	cifra = aux % 10; //Obtenemos la última cifra del aux
	    	inverso = inverso * 10 + cifra;
	        aux = aux / 10; //Quitamos la última cifra a aux
	    }
	    
	    if(N == inverso){
	            System.out.println("Es capicúa");
	    }else{
	            System.out.println("No es capicúa");
	    }
  }
}