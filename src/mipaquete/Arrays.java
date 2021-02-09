package mipaquete;

public class Arrays {

	public static void main(String[] args) {
		String array[]= new String[5];
		array[0]="1";
		array[1]="5";
		array[2]="3";
		array[3]="2";
		array[4]="7";
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(Integer.parseInt(array[i])+2);
		}
		
		for(String var: array) {     //for each
			System.out.println(var);
		}

	}

}
