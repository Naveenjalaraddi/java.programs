
public class TypeCasting {

	public static void main(String[] args) {

		// implicit conversion

		int number = 10;
		// automatic casting from int to long
		long long_num = number;
		// automatic casting from int to double
		double double_num = long_num;

		System.out.println("int number=" + number);
		System.out.println("int number to long long_number=" + long_num);
		System.out.println("long long_number to Double double_number=" + double_num);

		// explicit conversion

		byte number1 = 67;
		int result = (int) number1;
		System.out.println("byte number1 to int result= " + result);

		int number2 = 400;
		byte result1 = (byte) number2;
		System.out.println("int number2 to byte result1= " + result1);

		double number3 = 100.83847;
		int result2 = (int) number3;
		System.out.println("double number2 to int result2= " + result2);

		// ASCII value printing
		int num = 'a';
		System.out.println("ASCII value of a= " + num);

		char value = 'a' + 2;
		System.out.println("a+2 using ASCII value= " + value);

	}

}
