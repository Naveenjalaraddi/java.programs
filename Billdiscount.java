/*write a program to input total amount in a bill ,if amount is greater 
than 1000 then add a discount of 8% to the bill amount is greater than 2000 
then add a discount of 15% to the bill amount. if the amount is less then 1000 then no discount.*/

import java.util.Scanner;
public class Billdiscount {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int amount;
		System.out.print("Your bill amount is: ");
		amount=scn.nextInt();
		int disc;
		int pay;
		if(amount>1000&&amount<2000) {
			disc=amount/100*8;
			pay=amount-disc;
			System.out.println("you shop above 1000 rupess so you will get 8% discount so you payable amount is: "+pay);
			}
		else if(amount >2000) {
			disc=amount/100*15;
			pay=amount-disc;
			System.out.println("you shop above 2000 rupess so you will get 15% discount so you payable amount is: "+pay);

		}
		else {
			System.out.println("Payable amount is: "+amount);
		}
	

	}

}

