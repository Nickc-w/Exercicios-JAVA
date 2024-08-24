package a02;

import java.util.Scanner;
import java.util.Locale;

public class Aula02ex9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco,desconto;
		
		System.out.print("Informe o preço do produto: ");
		preco = sc.nextDouble();
		desconto = preco*0.9;
		System.out.printf("Valor do produto com desconto de 10%%: %.2f ",desconto);
		
		
	sc.close();	

	}

}
