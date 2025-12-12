
public class SwapTwoVariables {

	public static void main(String[] args) {
		// with 3rd variable
		int temp;
		int first_no = 1;
		int second_no = 2;
		System.out.println("With 3rd variable");
		System.out.println("=======================");

		System.out.println("before swap a= " + first_no);
		System.out.println("before swap b= " + second_no);
		temp = first_no;
		first_no = second_no;
		second_no = temp;
		System.out.println("after swap a= " + first_no);
		System.out.println("after swap b= " + second_no);
		System.out.println("=========================");

		System.out.println();
		// with out 3rd variable
		System.out.println("Without 3rd variable");
		System.out.println("=========================");

		int first_num = 10;
		int second_num = 20;
		System.out.println("before swap x= " + first_num);
		System.out.println("before swap y= " + second_num);

		first_num = first_num + second_num;
		second_num = first_num - second_num;
		second_num = first_num - second_num;
		System.out.println("after swap x= " + first_num);
		System.out.println("after swap y= " + second_num);

	}

}
