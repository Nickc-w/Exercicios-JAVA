package a02;

import java.util.Locale;
import java.util.Scanner;

public class Aula02ex3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double peso,altura,imc;
		
		System.out.printf("Informe o peso(kg): ");
		peso = sc.nextDouble();
		System.out.printf("Informe a altura(m): ");
		altura = sc.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.printf("IMC: %.3f",imc);
		
		
		
		
	 sc.close();

	}

}
