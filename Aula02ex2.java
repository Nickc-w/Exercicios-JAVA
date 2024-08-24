package a02;

import java.util.Locale;
import java.util.Scanner;


public class Aula02ex2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//n = numero
        int n;
		
		
		System.out.printf("Digite o primeiro valor: ");
		n = sc.nextInt();
		System.out.printf("Dobro de %d: %d\nTriplo de %d: %d\nQuadruplo de %d: %d",n,n*2,n,n*3,n,n*4);
		
		
		
       
	sc.close();
	}

}
