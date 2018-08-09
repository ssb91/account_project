package management_system;

import java.util.*;

import com.google.gson.Gson;

public class Service {
	private Map<Integer, Account> userHashMap;


	public Service() {
		userHashMap = new HashMap<Integer, Account>();
	}

	private static String jsonUser(int id, String firstName, String lastName, int accountNumber) {

		Account user = new Account(id, firstName, lastName, accountNumber);
		Gson gson = new Gson();
		return gson.toJson(user);

	}

	public void addingAccounts(Account id) {
		userHashMap.put(id.getId(), id);
	}
		
	
	public int counterMethod(String name) {

	    Iterator hashMapCounter = userHashMap.entrySet().iterator();

	    int counter = 0;
	    for(Account value: userHashMap.values()) {
			if(value.getFirstName().equals(name)) {
				counter++;
			}
		}
	    System.out.println(counter);
		return counter;
	}
		
}