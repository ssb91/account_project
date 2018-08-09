package management_system;

public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private int id;

	public Account() {
		
	}
	
	public Account(int iD, String firstName, String lastName, int accountNumber) {
		this.id = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;

	}

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String toString() {

		return firstName + ", " + lastName + ", " + accountNumber;

	}

}
