package mipaquete;

public class Examen3 {

	public static void main(String[] args) {
		int cantidad = 0;
		float precio = 0f;
		float total = 0f;
		int dto=0;
		System.out.println("Descripcion "+"Unidades "+"Precio/Unitario "+ "  DTO "+ "     Total ");
		for(int i=1; i<=5; i++) {
			dto=0;
			cantidad = (int)(Math.random()*5)+1;
 			precio = (float)(Math.random()*20)+0.10f;
			
			if(precio >= 10f && precio < 15) {
				dto=5;
			}else if(precio >= 15) {
				dto=10;
			}
			System.out.println("Articulo "+ i + "\t" +cantidad+"\t"+precio+ "\t"+dto+"\t"+ (precio-((precio*dto)/100))*cantidad );
			total +=(precio-((precio*dto)/100))*cantidad;
		}System.out.println("Total a pagar:"+ "\t"+"\t"+"\t"+"\t"+"\t" +total);
		
	}

}
