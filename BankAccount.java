
/* Assignment-2. 
     Write a Java program that allows the user to create a bank account and perform 
     transactions such as deposit, withdrawal, and balance inquiry. Using a conditional 
     operator (ternary operator ), display the message whether minimum balance is maintained or not. Steps: 
      ● Create a class BankAccount 
      ● Add three member variables: String accountHolderName , int accountNumber and int balance; 
      ● Add a constructors using all three members 
      ● Add getters and setters. 
      ● Add method deposit (int), withdraw(int) 
      ● Implement the methods by increasing or decreasing the balance 
      ● In the main method create a bank account 
      ● Withdraw money from this account and/or deposit into this account 
      ● Get the balance 
      ● Create a string variable “status” inside the main method 
      ● Assign values to status as “Minimum Balance Maintained” if balance is above or equal to 5000. 
       Otherwise values of status will be “Minimum Balance not Maintained”. Use conditional
       operator (ternary operator ) to assign the values of the status. 
      ● Display the status
*/


package anudip.assignments;

public class BankAccount {
	// Member variables
	String accountHolderName;
	int accountNumber;
	int balance;

	public BankAccount(String accountHolderName, int accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Getters and Setters
	String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// Deposit method
	public void deposit(int amount) {
		balance = balance + amount;
	}

	// Withdraw method
	public void withdraw(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public static void main(String[] args) {
		// Creating bank account
		BankAccount account = new BankAccount("Naveen", 12, 75900);

		// Deposit and withdraw
		account.deposit(2000);
		account.withdraw(3500);

		// Get balance
		int currentBalance = account.getBalance();
		System.out.println("Current Balance: " + currentBalance);

		// Ternary operator to check minimum balance
		String status;
		status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

		// Display status
		System.out.println(status);

	}

}
