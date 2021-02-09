package mipaquete;

import java.util.Scanner;

public class ArraysRepasoEj6 {
//	Queremos realizar una encuesta a 10 personas, se pedirá por teclado los datos de sexo
//	(1=masculino, 2=femenino), si trabaja (1=si trabaja, 2= no trabaja) y su sueldo (si tiene
//	un trabajo, sino será un cero) estará entre 600 y 2000 (valor entero). Los datos se han
//	de rellenar mediante un método, después calcula y muestra lo siguiente:
//
//	Porcentaje de hombres (tengan o no trabajo).
//	Porcentaje de mujeres (tengan o no trabajo).
//	Porcentaje de hombres que trabajan.
//	Porcentaje de mujeres que trabajan.
//	El sueldo promedio de los hombres que trabajan.
//	EL sueldo promedio de las mujeres que trabajan.
	public static void main(String[] args) {
		int size=2;
		int [][]datos=new int[size][3];
		float [][]contador=new float[3][2];
		Scanner sc=new Scanner(System.in);
		completar(sc,datos);
		contar(datos,contador,size);
	}
	
	public static void completar(Scanner sc,int[][]datos) {
		for (int i = 0; i < datos.length; i++) {
			System.out.println("Usuario: "+i+" introduce tus datos");
			System.out.println("Introduce tu sexo"+"\n"+"1= Masculino"+"\n"+"2=Femenino");
			datos[i][0]=sc.nextInt();
			System.out.println("Introduce si trabajas"+"\n"+"1 = Empleado"+"\n"+"2 = Desempleado");
			datos[i][1]=sc.nextInt();
			if (datos[i][1]==2) {
				datos[i][2]=0;
			}else {
				System.out.println("Introduce tu salario");
				datos[i][2]=sc.nextInt();
			}
		}
	}
	
	public static void contar(int[][]datos, float[][]contador,int size) {
		for (int i = 0; i < datos.length; i++) {
			//sexo
			if (datos[i][0]==1) {
				contador[0][0]++;
			}else {
				contador[0][1]++;
			}
			//trabaja? sueldos
			if (datos[i][0]==1 && datos[i][1]==1) {
				contador[1][0]++;
				contador[2][0]+= datos[i][2];
			}else if (datos[i][0]==2 && datos[i][1]==1) {
				contador[1][1]++;
				contador[2][1]+= datos[i][2];
			}
		}
		System.out.println("Porcentaje de hombres: "+(contador[0][0]/size)*100);
		System.out.println("Porcentaje de mujeres: "+(contador[0][1]/size)*100);
		System.out.println("Porcentaje de hombres que trabajan: "+(contador[1][0]/size)*100);
		System.out.println("Porcentaje de mujeres que trabajan: "+(contador[1][1]/size)*100);
		System.out.println("Porcentaje media de sueldo de hombres: "+contador[2][0]/size);
		System.out.println("Porcentaje media de sueldo de mujeres: "+contador[2][1]/size);
	}
}
