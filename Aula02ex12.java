package a02;

import java.util.Locale;
import java.util.Scanner;

import java.util.Locale;
import java.util.Scanner;

public class Aula02ex12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//n1 = numero 1, n2 = ...
		int n1,n2,n3;
		
		System.out.print("Digite um numero:");
		n1 = sc.nextInt();
		System.out.print("Digite outro numero:");
		n2 = sc.nextInt();
		System.out.print("Digite outro numero:");
		n3 = sc.nextInt();
		
		if ((n1<n2) && (n1<n3)) {
			System.out.printf("O numero %d é o menor.",n1);
		} else if ((n2<n1) && (n2<n3)) {
			System.out.printf("O numero %d é o menor.",n2);
		} else if ((n3<n1) && (n3<n2)) {
			System.out.printf("O numero %d é o menor.",n3);
		} else {
			System.out.print("Nao tem o menor! Os numeros sao iguais");
		}
		
		
		
		sc.close();

	}

}
