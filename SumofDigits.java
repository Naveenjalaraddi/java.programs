
public class SumofDigits {

	public static void main(String[] args) {
		int number = 6886543;
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("Given Number Sum of Digits is= " + sum);

	}

}

/*
 * Tracing the loop
 * --------------------
 * first number value is =6886543;
 * first sum value is = 0;
 * 
 * while loop condition is number is > 0 will enter the loop so 6886543 > 0 condition will satisfy 
 * enter the loop
 * 
 * --1st iterate--
 * while(6886543>0){
 * sum=sum+number%10;
 * 0=0+6886543%10;
 * 0=0+3;
 * sum=3;
 * 
 * number=number/10;
 *       =6886543/10;
 * number=688654;
 * }
 * 
 * --2nd iterate--
 * while(688654>0){
 * sum=sum+number/10;
 *    =3+688654/10;
 *    =3+4;
 * sum=7;
 * 
 * number=number/10;
 *       =688654/10;
 * number=68865;
 * }
 * 
 * --3rd iterate--
 * while(68865>0){
 * sum=sum+number%10;
 *    =7+68865%10;
 *    =7+5;
 * sum=12;
 * 
 * number=number/10;
 *       =68865/10;
 * number=6886;
 * }
 * 
 * --4th iterate--
 * while(6886>0){
 * sum=sum+number%10;
 *    =12+6886%10;
 *    =12+6;
 * sum=18;
 * 
 * number=number/10;
 *       =6886/10;
 * number=688;
 * }
 * 
 * --5th iterate--
 * while(688>0){
 * sum=sum+number%10;
 *    =18+688%10;
 *    =18+8;
 * sum=26;
 * 
 * number=number/10;
 *       =688/10;
 * number=68;
 * }
 * 
 * --6th iterate--
 * while(68>0){
 * sum=sum+number%10;
 *    =26+68%10;
 *    =26+8;
 * sum=34;
 * 
 * number=number/10;
 *       =68/10;
 * number=6;
 * }
 * 
 * --7th iterate--
 * while(6>0){
 * sum=sum+number%10;
 *    =34+6%10;
 *    =40;
 *   
 * number=number/10;
 *       =6/10;
 * number=0.6;
 * }
 * 
 * number is int data type so number value is
 * number=0;
 * 
 * --8th iterate--
 * while(0>0)
 * loop will stop
 * 
 * at last sum of digits
 * sum=40;
 * at last number value
 * number=0;
 *
 * */
