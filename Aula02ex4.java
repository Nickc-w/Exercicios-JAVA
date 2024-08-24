package a02;

import java.util.Locale;
import java.util.Scanner;

public class Aula02ex4 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// n1 = numero 1, n2 = ...., mediap = media ponderada
		double n1,n2,n3,mediap;
		
		
		 System.out.printf("Informe o primeiro valor: ");
		 n1 = sc.nextDouble();
		 System.out.printf("Informe o segundo valor: ");
		 n2 = sc.nextDouble();
		 System.out.printf("Informe o terceiro valor: ");
		 n3 = sc.nextDouble();
		 
		 mediap = (n1*2+n2*3+n3*5)/10.0;
		 
		 System.out.printf("Media ponderada: %.3f",mediap);
		 	
		
		sc.close();
	}

}
