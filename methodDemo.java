
import java.util.Scanner;
public class methodDemo {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=scn.nextInt();
		boolean value=methodDemo.canvote(age);
		if(value) {
			System.out.println("You can vote");
		}
		else {
			System.out.println("You can't vote");
		}
		scn.close();

	}
	public static boolean canvote(int age) {
		if(age>18) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
