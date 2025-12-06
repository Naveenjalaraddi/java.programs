import java.util.Scanner;

public class Primeno_or_not {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scn.nextInt();
		boolean isprime = true;
		if (number == 1) {
			isprime = false;
		}
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				isprime = false;

			}

		}
		if (isprime) {
			System.out.println(number + ".is prime number");
		} else {
			System.out.println(number + ".is not prime number");

		}

	}

}
