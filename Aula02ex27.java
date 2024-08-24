package a02;

public class Aula02ex27 {

	public static void main(String[] args) {

		for(int i = 1;i<=100;i++) {
			if (	(i%3==0) && (i%5==0)) {
				System.out.printf("FizzBuzz!!..");
			} else if (i%5==0){
				System.out.printf("Buzz!!..");
			} else if (i%3 == 0) {
				System.out.printf("Fizz!!..");
			} else {
				System.out.printf("%d..",i);
			}
		}


	}

}
