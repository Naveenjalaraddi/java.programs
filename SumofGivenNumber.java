import java.util.Scanner;

public class SumofGivenNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first_no = scn.nextInt();

		System.out.print("Enter second number: ");
		int second_no = scn.nextInt();

		int sum = first_no + second_no;

		System.out.print("Enter thired number: ");
		int thired_no = scn.nextInt();

		sum = sum + thired_no;

		System.out.print("Enter fourth number: ");
		int fourth_no = scn.nextInt();

		sum = sum + fourth_no;

		System.out.println("Sum of the four number is: " + sum);

		scn.close();
	}

}
