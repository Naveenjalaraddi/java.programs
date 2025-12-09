
/* wap to find the sub array of a given array.asubarray is part of the given array.
 * take a method named:
 * method name: subArray
 * 
 * three parameters
 * parameter one: given array
 * parameter two: start index
 * parameter three: end index
 *
 * return the sub array 
 * 
 * */
import java.util.Scanner;

public class SubArrayIsPartofGivenArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter given array creating number: ");
		int arrayno = scn.nextInt();

		int[] given_array = new int[arrayno];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arrayno; i++) {
			given_array[i] = scn.nextInt();
		}

		System.out.println("Enter want you want starting array num: ");
		int start_array = scn.nextInt();
		System.out.println("Enter want you want array ending num: ");
		int ending_array = scn.nextInt();

		SubArrayIsPartofGivenArray.subarr(given_array, start_array, ending_array);
		scn.close();
	}

	public static void subarr(int given_array[], int start_index, int end_index) {
		int len = end_index - start_index;

		int[] sub = new int[len];
		int no = 0;
		for (int j = start_index; j < end_index; j++) {

			sub[no] = given_array[j];
			no++;
		}
		System.out.println("Sub array is: ");
		for (int x : sub)

			System.out.print(x + "  ");

	}

}
