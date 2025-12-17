package oopsconceptsprograms;

class Display {
	public void display(int num) {
		System.out.println("Number= " + num);
	}

	public void display(char ch) {
		System.out.println("Charcter= " + ch);
	}

	public void display(String str) {
		System.out.println("String= " + str);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Display dis = new Display();
		dis.display(4);
		dis.display('a');

	}

}
