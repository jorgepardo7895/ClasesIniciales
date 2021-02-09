package mipaquete;

import java.util.Arrays;

public class ArraysEj3 {

	public static void main(String[] args) {
		
		String frase = "La vida es como una caja de bombones";
		String array[] = frase.split(" ");
		System.out.println(Arrays.toString(array));
		char charArray[]=frase.toCharArray();
		System.out.println(Arrays.toString(charArray));
	}

}
