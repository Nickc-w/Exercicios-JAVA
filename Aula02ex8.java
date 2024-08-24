package a02;

import java.util.Scanner;
import java.util.Locale;

public class Aula02ex8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int d; //dias trabalhados
		double v,s; //valor da diaria, salario
		
		
		System.out.print("Informe o número de dias trabalhadas pelo funcinário: ");
		d = sc.nextInt();
		System.out.print("Informe o valor da diária do funcionário: ");
		v = sc.nextDouble();
		
		s = d*v;
		
		System.out.printf("Sálario do funcionário: %.2f reais ",s);

		sc.close();
	}

}
