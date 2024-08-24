package a02;

import java.util.Scanner;
import java.util.Locale;

public class Aula02ex19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1,n2,n3,temp; //n1 = numero 1, n2 = ...
		
		System.out.print("Digite um numero: ");
		n1 = sc.nextDouble();
		System.out.print("Digite outro numero: ");
		n2 = sc.nextDouble();
		System.out.print("Digite outro numero: ");
		n3 = sc.nextDouble();
		
		if (n1>n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		if(n1>n3) {
			temp = n3;
			n3 = n2;
			n2 = n1;
			n1 = temp;			
		}
		if(n2>n3) {
			temp = n3;
			n3 = n2;
			n2 = temp;	
		}
		System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n1,n2,n3);
		sc.close();
	}

}


/* ou
if ((n1>n2) && (n1>n3) && (n2>n3)) {
	System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n3,n2,n1);
} else if ((n1>n2) && (n1>n3) && (n3>n2)) {
	System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n2,n3,n1);
} else if ((n2>n1) && (n1>n3) && (n2>n3)) {
	System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n3,n1,n2);
} else if((n2>n1) && (n3>n1) && (n2>n3)) {
	System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n1,n3,n2);
} else if ((n3>n2) && (n2>n1) && (n3>n1)) {
	System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n1,n2,n3);
} else if((n3>n2) && (n1>n2) && (n3>n1)){
	System.out.printf("Ordem crescente: %.1f,%.1f e %.1f",n2,n1,n3);
} else {
	System.out.print("Invalido. Possuem numeros sao iguais!");
}
*/
