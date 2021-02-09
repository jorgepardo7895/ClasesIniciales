package mipaquete;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEj4 {
	//en el main declaramos el Scanner pedimos el tamaño del Array y llamámos a los métodos
	//con la variable size guardamos el tamaño que el usuario quiere darla al Array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del Array");
		//con la variable size guardamos el tamaño que el usuario quiere darla al Array
		int size = sc.nextInt();
		//declaramos el Array y llamamos al método para rellenarlo con números
		int num[]=new int[size];
		rellenar(num,sc);
		//mostramos los números generados aleatóriamente y despues llamámos al metodo que los sumará y sacará la media
		System.out.println("Los numero de los que se compone el Array son: "+Arrays.toString(num));
		operaciones(num);
	}
	//el usuario mete el número minimo y maximo y con un bucle rellenamos el array con numeros aleatorios
	public static void rellenar(int[]a, Scanner sc){
		System.out.println("Introduce el valor minimo");
		int min = sc.nextInt();
		System.out.println("Introduce el valor maximo");
		int max=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*(max-min+1)+min);
		}
	}
	//con el array completo sumamos los numeros y luego sacamos la media
	public static void operaciones(int a[]) {
		int suma=0;
		for (int i = 0; i < a.length; i++) {
			suma+=a[i];
		}
		System.out.println("La suma de todos los numeros de Array: "+suma);
		System.out.println("La media de todos los numero es: "+(float)suma/a.length);
	}
}
