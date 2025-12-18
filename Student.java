/*Create a Student class, with the following instance variables:

id: int
first name: String
last name: String
fees: double

and the following methods

instance methods:

getName() -> returns the firstname and lastname combined
getFees() -> returns the fees 

Create three objects of the Student and print the values.

Use parameterized constructor for printing different values.

I am attaching the Employee program discussed in the class for your reference.

Thanks...
 * 
 * 
 * */

package oopsconceptsprograms;

public class Student {
	int id;
	String first_name;
	String last_name;
	double fees;

	public Student(int id, String first_name, String last_name, double fees) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.fees = fees;
	}

	public void getname() {
		System.out.println("Student full name is: " + first_name + " " + last_name);
	}

	public void getfees() {
		System.out.println("Student fees is: " + fees);
	}

	public static void main(String[] args) {
		Student stu = new Student(12, "Naveen", "Jalaraddi", 50000);
		System.out.println("Student id is: " + stu.id);
		stu.getname();
		stu.getfees();

		System.out.println();

		Student stu1 = new Student(11, "Ranjan", "P", 60000);
		System.out.println("Student id is: " + stu1.id);
		stu1.getname();
		stu1.getfees();

	}

}
