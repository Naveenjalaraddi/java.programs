
/*   Assignment-2. 

        ● Create a new class Employee 
        ● Add member variables: id and age of type int, name of type String and isPermanent of type boolean 
        ● Now assign values 35.5 to age; See the error message. 
        ● How can you avoid this error? Correct the error by casting. 
        ● Make all the members protected 
        ● Add amain method to it. Print message “Successfully started”. 
        ● Compile the class. 
*/

package anudip.assignments;

public class Employee {

	// Protected member variables
	protected int id;
	protected int age;
	protected String name;
	protected boolean isPermanent;

	public static void main(String[] args) {

		Employee emp = new Employee();

		// Assigning values
		emp.id = 101;
		emp.age = (int) 35.5; // Casting double to int
		emp.name = "Naveen";
		emp.isPermanent = true;
		
		System.out.println("Successfully started");

	}

}