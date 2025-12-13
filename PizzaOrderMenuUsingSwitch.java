// write a program to display the price of a pizza based on the size ordered using switch statement 

import java.util.Scanner;
public class PizzaOrderMenuUsingSwitch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String size;
		System.out.println("What size of pizza you will order like small,medium,"
				+ "large & very large pizzas availble which one you want to enter: ");
		size=scn.next();
		switch(size) {
		case "small":
		case "Small":
		case "SMALL":
			System.out.println("you order small pizza=50 rupess");
			break;
		case "medium":
		case "Medium":
		case "MEDIUM":
			System.out.println("you order medium pizza=100 rupess");
			break;
		case "large":
		case "Large":
		case "LARGE":
		System.out.println("you order large pizza=150 rupess");
		    break;
		case "verylarge":
		case "Verylarge":
		case "Very large":
		case "VERYLARGE":
		case "Very Large":
		System.out.println("you order verylarge pizza=200 rupess");
		    break;
		default:
		System.out.println("not avilble this type or may be not understand try again");
				
		}
		scn.close();

	}

}
