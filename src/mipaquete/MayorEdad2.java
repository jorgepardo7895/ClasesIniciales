package mipaquete;

public class MayorEdad2 {
	public static void main (String arg[]) {
		int day = 6;
		int mes = 9;
		int year= 2002;
		
		int dayDif = 7 - day;
		int mesDif = 10- mes;
		int yearDif= 2020 - year;
		
		if((day >= 1 && day <= 31) && (mes >= 1 && mes <= 12) && (year >= 1980 && year <= 2020)) {
			if((yearDif > 18)||(yearDif == 18 && mesDif > 0)||(yearDif == 18 && mesDif == 0 && dayDif >= 0)) {
				System.out.println("Mayor de Edad");
			}else {
				System.out.println("Menor de Edad");
			}
		}else {
			System.out.println("Año incorrecto");
		}
	}
}