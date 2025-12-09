import java.util.Scanner;
public class ArrayElementCheck {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a size of array: ");
		int size=scn.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter a array elements:" );
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.print("Enter a search elemnts no: ");
		int search=scn.nextInt();
		boolean found=false;
		for(int k=0; k<arr.length; k++) {
			if(arr[k]==search) {
				found=true;
			}
		}
		if(found) {
			System.out.println(search+ ".is present in this array");
		}
		else {
			System.out.println(search+".is not present in this array");
		}
scn.close();
	}

}
