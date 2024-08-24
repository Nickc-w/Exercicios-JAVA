package a02;

import java.util.Locale;
import java.util.Scanner;

public class Aula02ex15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
	    int numero;
		
		System.out.print("Digite um numero: ");
		numero = sc.nextInt();
		
		if ((numero%3==0) && (numero%5==0)) {
			System.out.printf("O numero %d é multiplo de 3 e 5 ao mesmo tempo",numero);
		} else {
			System.out.printf("O numero %d nao é multiplo de 3 e 5 ao mesmo tempo!",numero);
		}

 sc.close();
 }
}
