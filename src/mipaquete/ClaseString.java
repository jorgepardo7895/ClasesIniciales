package mipaquete;

public class ClaseString {

	public static void main(String[] args) {
		
		String var = "Hola";
		String var2 = " Mundo";
		String var3=" java";
		var = var.concat(var2).concat(var3);
		
		System.out.print(var.length());
	}

}
