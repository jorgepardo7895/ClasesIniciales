package mipaquete;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String frase;
		String result ="";
		
		System.out.println("Introduce tu frase");
		frase=sc.nextLine();
		
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				result += frase.charAt(i);
			}else {
				result+="\n";
			}
		}System.out.println(result);

	}

}
