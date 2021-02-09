package mipaquete;

public class TablasMultiplicar {

	public static void main(String[] args) {
		String tabla= "";

		for(int i=1;i<=10;i++) {
			tabla="";
			for(int o=1;o<=10;o++) {
				tabla+=(o + "x" + i + " = " + (i*o) + " \t");
			}System.out.println(tabla);
		}
	}

}