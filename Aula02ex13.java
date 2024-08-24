package a02;

import java.util.Scanner;
import java.util.Locale;

public class Aula02ex13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero%2==0) {
			System.out.printf("O numero %d é par!",numero);
		} else {
			System.out.printf("O numero %d é impar!",numero);
		}
		
		
		
   sc.close();
	}

}
