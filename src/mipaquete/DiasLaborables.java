package mipaquete;

public class DiasLaborables {
	public static void main(String arg[]) {
		String dias = "Martes";
		
		switch (dias){
			case "Lunes":
			case "Martes":
			case "Miercoles":
			case "Jueves":
			case "Viernes":
				System.out.println("Dia laborable");
				break;
			case "Sabado":
			case "Domingo":
				System.out.println("Fin de Semana");
				break;
			default:
			System.out.println("Error");	
		}
	}
}
