
//Age calculation program.
import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scn.nextInt();
		if (age >= 1 && age <= 12) {
			System.out.println("kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("teenager");
		} else if (age >= 20 && age <= 40) {
			System.out.println("Youngster");
		} else if (age >= 41 && age <= 55) {
			System.out.println("aged");
		} else if (age >=56) {
			System.out.println("old");
		} else {
			System.out.println("Invalid age enter");
		}

	}

}
