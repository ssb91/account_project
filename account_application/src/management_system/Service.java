package management_system;
import java.util.*;

public class Service {

	public static void main(String[] args) {
			
	HashMap userHashMap = new HashMap();
	      
	
	String firstName = "A";
	String lastName = "B";
	int accountNumber = 0;
	
	Account user = new Account(firstName, lastName, accountNumber);
			
	boolean addUserFunction = true;
	boolean retreiveUserFunction = true;
	
	if (addUserFunction == true) {		
			
		userHashMap.put(accountNumber + 1, user);
		System.out.println("User added.");
	
	}

	if (retreiveUserFunction == true) {
		
		userHashMap.get(accountNumber);
//		System.out.println("The user is: " + userList.get(userList.indexOf(user)));		
		   
	}

    Set set = userHashMap.entrySet();
    Iterator i = set.iterator();
    
    while(i.hasNext()) {
       Map.Entry userMapEntry = (Map.Entry)i.next();
       System.out.print(userMapEntry.getKey() + ": ");
       System.out.println(userMapEntry.getValue());
    }

	
	}
	
			
}