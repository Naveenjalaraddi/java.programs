
// WAP to find sum of matrix using two, 2dimensional arrays
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enetr how many rows1 you want: ");
		int rows1 = scn.nextInt();
		System.out.print("Enter how many columns1 you want: ");
		int columns1 = scn.nextInt();

		int matrix1[][] = new int[rows1][columns1];
		int matrix2[][] = new int[rows1][columns1];
		System.out.println("Enter first matrix1 elements: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = scn.nextInt();
			}
		}

		System.out.println("Enter first matrix2 elements: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = scn.nextInt();
			}
		}
		System.out.println("1st Matrix: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("2nd Matrix: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of two matrix: ");
		int summatrix[][] = new int[rows1][columns1];
		for (int i = 0; i < summatrix.length; i++) {
			for (int j = 0; j < summatrix.length; j++) {
				summatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(summatrix[i][j] + " ");
			}
			System.out.println();
		}
		scn.close();

	}
}
