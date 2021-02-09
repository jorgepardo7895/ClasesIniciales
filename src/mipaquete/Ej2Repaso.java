package mipaquete;

public class Ej2Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso = 150;
		float altura = 1.2f;
		float imc= peso/(altura*altura);
		
		if(imc<18.5f) {
			System.out.println("Come más");
		}else if(imc > 18.5f && imc < 24.9f) {
			System.out.println("Estas bien");
		}else if(imc>=25f && imc <30f) {
			System.out.println("Obesidad");
		}else if(imc>=30f) {
			System.out.println("Obesidad Morbida");
		}
	}
	
}
