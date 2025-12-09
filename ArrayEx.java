
//Example of array topic 
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

		// Declare an array initialize with user input print the array elements
		Scanner scn = new Scanner(System.in);
		int no;

		System.out.print("Enter your required array elements: ");
		no = scn.nextInt();

		int[] arra = new int[no];

		System.out.println("Enter array elements one by one: ");
		for (int i = 0; i < no; i++) {

			arra[i] = scn.nextInt();

		}
		for (int j = 0; j < no; j++) {
			System.out.println(+j + ".element: " + arra[j]);

		}
		scn.close();
	}

}
