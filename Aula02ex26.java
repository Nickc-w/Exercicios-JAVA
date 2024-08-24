package a02;

import java.util.Scanner;

public class Aula02ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("De qual numero será a tabuada?: ");
		numero = sc.nextInt();
		
		for(int i = 1;i<=10;i++) {
			System.out.printf(" %d x %d = %d\n",numero,i,numero*i);
		}
		
		
		
		sc.close();
	}

}
