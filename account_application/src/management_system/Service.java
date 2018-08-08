package management_system;

import java.util.*;

import com.google.gson.Gson;

public class Service {

	private static String jsonUser(String firstName, String lastName, int accountNumber) {
	
	Account user = new Account(firstName, lastName, accountNumber);
		
	Gson gson = new Gson();
    return gson.toJson(user);
    
	}	
			
	public static void main(String[] args) {
			      	
	String firstName = "A";
	String lastName = "B";
	int accountNumber = 0;

	boolean addUser = true;
	boolean retreiveUser = true;
	
	Account user = new Account(firstName, lastName, accountNumber);
	
	HashMap userHashMap = new HashMap();
	
	if (addUser == true) {		
			
		userHashMap.put(accountNumber, user);
		String outputAddUser = "User added.";
		
	}

	if (retreiveUser == true) {
		
		userHashMap.get(accountNumber);
		String outputAddUser = "User retreived.";
		
	}
		
    Set set = userHashMap.entrySet();
    Iterator i = set.iterator();
    
    while(i.hasNext()) {
       Map.Entry userMapEntry = (Map.Entry)i.next();
       System.out.print(userMapEntry.getKey() + ": ");
     System.out.println(userMapEntry.getValue());
    }
	
    System.out.println(jsonUser(firstName, lastName, accountNumber));
    
	}	
			
}