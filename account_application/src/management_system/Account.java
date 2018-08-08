package management_system;

public class Account {
		
	String firstName;		
	String lastName;
	int accountNumber;
	
	public Account(String firstName, String lastName, int accountNumber) {

			this.firstName = firstName;		
			this.lastName = lastName;
			this.accountNumber = accountNumber;

		}
		
		public String toString( ) {
			
			return firstName + lastName + accountNumber;			
			
		}
		
	}
	

