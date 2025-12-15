import java.util.Scanner;
public class SumofDigits_NumberFromUser {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number=scn.nextInt();
		int sum=0;
		for(int i=0; i<number; i++) {
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("Sum of the Given Number: "+sum);

	}

}
