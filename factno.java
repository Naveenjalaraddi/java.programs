// factorial

import java.util.Scanner;

public class factno {

	public static void main(String[] args) {
		int no;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		no = scn.nextInt();
		int fact = 1;
		for (int i = 1; i <= no; i++) {

			fact = fact * i;

		}
		System.out.print("Factorial no is: " + fact);
		scn.close();
	}

}
