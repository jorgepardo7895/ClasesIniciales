package mipaquete;
import java.util.Arrays;
import java.util.Scanner;

public class ExamenSegEvaEj3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean fin=false;
		int seleccion,cantidad=0;
		String compra="";
		float total=0;
		String productos[]=new String[] {"Chocolate","Phoskitos","Donuts  ","Colacao  ","Galletas","Nocilla  ","Finalizar compra"};
		String precios[]=new String[] {"1.10","2.05","1.20","0.90","0.50","1.00"," "};
		
		do {
			System.out.println("Seleccion la opcion que desee: ");
			System.out.println("Id"+"\t"+"Producto"+"\t"+"\t"+"Precio");
			
			for (int i = 0; i < productos.length; i++) {
				System.out.println(i+"\t"+productos[i]+"\t"+"\t"+precios[i]+"€");
			}
			
			seleccion=sc.nextInt();
			if (seleccion==6) {
				fin=true;
				total(total,compra,sc);
			}else {
				System.out.println("Indique la cantidad que desee comprar");
				cantidad=sc.nextInt();
				float precio=Float.parseFloat(precios[seleccion]);
				compra+="\n"+cantidad+" "+productos[seleccion]+" x "+precios[seleccion];
				total+=cantidad*precio;	
			}
			
		} while (!fin);
	}

	public static void total(float total,String compra,Scanner sc) {
		String precioTotal= total+" €";
		System.out.println(compra);
		System.out.println(precioTotal);
		devolucion(total,sc);
	}
	
	public static void devolucion(float total,Scanner sc) {
		int entrega=0;
		float resto=0;
		System.out.println("Introduce el dinero que entrega el cliente");
		entrega=sc.nextInt();
		if (total>entrega) {
			System.out.println("no es suficiente");
			devolucion(total,sc);
		}else {
			resto=entrega-total;
			System.out.println("A devolver"+resto);
			calcMonedas(resto);
		}
	}
	public static void calcMonedas(float resto) {
		float monedas[]=new float[] {2.00f,1.00f,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
		String cambio="";
		int cont=0;
		for (int i = 0; i < monedas.length; i++) {
			while (resto>monedas[i]) {
				cont++;
				resto-=monedas[i];
			}
			if (cont>=1) {
				cambio+=cont+" monedas de "+monedas[i]+"€"+"\n";
			}
			
			cont=0;
		}
		System.out.println(cambio);
	}
}
