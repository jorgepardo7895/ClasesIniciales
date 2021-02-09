package mipaquete;


public class ExamenSegEvaEj2 {
//		Generar un algoritmo que mediante un método genere una fecha (día, mes y año) y la
//		imprima por pantalla. Primero deberá existir un método en el main que devuelva la fecha
//		completa. Deberá haber otro método que genere un mes de forma aleatoria y lo devuelva en
//		palabra (3 - Marzo), después otro método que genere el día teniendo en cuenta el mes. El año
//		será 2021. Utilizar un switch case para los meses y condicionales if para el resto. (3 ptos).
	public static void main(String[] args) {
		System.out.println(mostrar());
		
	}
	public static void crearMes(String[]fecha) {
		String meses[]=new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		fecha[2]=meses[(int)(Math.random()*12)];
	}
	
	public static void crearDia(String[]fecha) {
		int dia;
		switch(fecha[2]) {
		case"Enero":
		case"Marzo":
		case"Mayo":
		case"Julio":
		case"Agosto":
		case"Octubre":
		case"Diciembre":
			dia=(int)(Math.random()*31)+1;
			fecha[1]=dia+" /";
			break;
		case"Abril":
		case"Junio":
		case"Septiembre":
		case"Noviembre":
			dia=(int)(Math.random()*30)+1;
			fecha[1]=dia+" /";
			break;
		case"Febrero":
			dia=(int)(Math.random()*28)+1;
			fecha[1]=dia+" /";
			break;
		}
	}
	
	public static String mostrar() {
		String fecha[]=new String[4];
		crearMes(fecha);
		crearDia(fecha);
		String fechaComp=fecha[1]+" "+fecha[2]+" / "+"2021";
		return fechaComp;		
	}
}
