package a02;

import java.util.Locale;
import java.util.Scanner;

public class Aula02ex14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double peso,altura,imc;
		
		System.out.printf("Informe o peso(kg): ");
		peso = sc.nextDouble();
		System.out.printf("Informe a altura(m): ");
		altura = sc.nextDouble();
		
		//Considerando =
		//Menor que 20: Abaixo do peso
		//Entre 22 e 27: Dentro do peso
		//Maior que 27: Sobrepeso/Obesidade
		
		imc = peso/(altura*altura);
		System.out.printf("imc: %f",imc);
		if (imc < 22) {
			System.out.print("\nA pessoa esta abaixo do peso!");
		} else if (imc < 27) {
			System.out.print("\nA pessoa esta dentro do peso!");
		} else {
			System.out.print("\nA pessoa esta acima do peso!");
		}
		
	 sc.close();


	}

}
