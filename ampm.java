
//am,pm showing program
import java.util.Scanner;

public class ampm {

	public static void main(String[] args) {
		int time;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a time: ");
		time = scn.nextInt();
		ampm.printtime(time);

		System.out.println(ampm.printtime(time));
		scn.close();
	}

	public static String printtime(int time) {
		if (time >= 1 && time <= 12) {
			return "am";
		} else if (time >= 13 && time <= 24) {
			return "pm";
		} else
			return "invalid input";

	}

}
