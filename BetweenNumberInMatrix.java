/*
Take a two dimensional array of size 3X3. Insert the values into the 
array using the scanner class. Insert different numbers. Now check how many numbers are between 1 to 50,
 50 to 100 and above 100. Using conditional statement for achieving the output.

Example:

81   23   340

22   5    3

2    73   105

Expected output:

In the above array there are 5 number  between 1 to 50
In the above array there are 2 number  between 50 to 100
In the above array there are 2 number  above 100

Take your own random values into the array and check.
 * 
 * */

import java.util.Scanner;

public class BetweenNumberInMatrix {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		System.out.println("Enter matrix element");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		System.out.println();
		System.out.println("Given Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
		int count_1to50 = 0;
		int count_50to100 = 0;
		int count_above100 = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] >= 1 && matrix[i][j] < 50) {
					count_1to50++;
				} else if (matrix[i][j] >= 50 && matrix[i][j] < 100) {
					count_50to100++;
				} else if (matrix[i][j] >= 100) {
					count_above100++;
				}
			}

		}
		System.out.println();
		System.out.println("*** Counting ***");
		System.out.println("Number in 1 to 50   : " + count_1to50);
		System.out.println("Number in 51 to 100 : " + count_50to100);
		System.out.println("Number above 100    : " + count_above100);

		scn.close();

	}

}
