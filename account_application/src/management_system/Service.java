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
			      	
	boolean addUser = true;
	boolean retreiveUser = true;
	
	Account user1 = new Account("A", "B", 123);
	Account user2 = new Account("X", "Y", 234);
	
	HashMap userHashMap = new HashMap();
	
	
	if (addUser == true) {		

		userHashMap.put(123, user1);
		userHashMap.put(234, user2);
		String outputAddUser = "User added.";

	}

	if (retreiveUser == true) {
		
		userHashMap.get(123);
		userHashMap.get(234);
		String outputAddUser = "User retreived.";
		
	}
		
	
    Set set = userHashMap.entrySet();
    Iterator hashMapCounter = set.iterator();
    
    while(hashMapCounter.hasNext()) {
    Map.Entry userMapEntry = (Map.Entry)hashMapCounter.next();
    System.out.print(userMapEntry.getKey() + ": ");
    System.out.println(userMapEntry.getValue());
    }
	
    System.out.println(	jsonUser("A", "B", 123) +  "\n" + jsonUser("X", "Y", 234));
    
	}	
			
}