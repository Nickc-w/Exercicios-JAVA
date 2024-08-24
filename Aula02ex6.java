package a02;

import java.util.Scanner;
import java.util.Locale;

public class Aula02ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//s = salario, sn = salario novo
		double s,sn;
		
		
		System.out.print("Informe o sálario: ");
		s = sc.nextDouble();
		sn = s*1.15;
		System.out.printf("Novo sálario com aumento de 15%%: %.3f",sn);
		
		
    sc.close();
	}

}
