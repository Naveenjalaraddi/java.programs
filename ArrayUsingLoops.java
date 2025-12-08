/* Array using loops program
 * 1)Given an array of ints, return true if..1,2,3,..appears in the array somewhere 
 * Example: 
 * input:[1,1,2,3,1]--output:true
 * input:[1,1,2,4,1]--output:false;
 * input:[1,1,2,1,2,3]--output:true;
 * */

import java.util.Scanner;

public class ArrayUsingLoops {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter given array length: ");
		int length = scn.nextInt();

		int[] arr = new int[length];
		System.out.println("Enter array elements:");
		for (int i = 0; i < length; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Array elements is: ");

		boolean value = ArrayUsingLoops.arraycheck(arr);
		if (value) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static boolean arraycheck(int[] arr) {
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] == 1 && arr[j + 1] == 2 && arr[j + 2] == 3) {

				return true;
			}

		}
		return false;

	}

}

