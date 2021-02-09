package mipaquete;

public class Ej1Repaso {

	public static void main(String[] args) {
		String frase="Los murcielagos estaban anclados en el techo sedientos de sangre";
		int a=0, e=0, i=0, o=0, u=0;
		int longitud=frase.length()-1;
		int rep = a;
		char letra= 'A';
		
		for (int x = 0; x <=longitud; x++) {
			switch (frase.charAt(x)) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
			if (rep<e) {
				rep=e;
				letra='E';
			}else if(rep<i) {
				rep=i;
				letra='I';
			}else if(rep<o) {
				rep=o;
				letra='O';
			}else if(rep<u) {
				rep=u;
				letra='U';
			}
		}
		System.out.println("Las vocales se repiten:");
		System.out.println("A:"+a+"  E:"+e+"  I:"+i+"  O:"+o+"  U:"+u);
		System.out.println("La letra " +letra+" es la que mas se repite con " +rep+ " repeticiones.");
	}

}
