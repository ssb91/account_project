package management_system;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.gson.Gson;

public class ManagementTests {

	private static String jsonUser(String firstName, String lastName, int accountNumber) {
		
	Account user = new Account(firstName, lastName, accountNumber);
		
	Gson gson = new Gson();
    return gson.toJson(user);
    
	}	
	
	@Test
	public void testJsonUser() {

			assertEquals("{\"firstName\":\"A\",\"lastName\":\"B\",\"accountNumber\":123}", jsonUser("A", "B", 123));
			
	}

	
	@Test
	public void testJsonUser2() {

		HashMap userHashMap = new HashMap();
		
		Account user1 = new Account("A", "B", 123);
		Account user2 = new Account("X", "Y", 234);

		userHashMap.put("A", user1);
		userHashMap.put("X", user2);

		Set set = userHashMap.entrySet();
	    Iterator hashMapCounter = set.iterator();
	    
	    while(hashMapCounter.hasNext()) {
	        Map.Entry userMapEntry = (Map.Entry)hashMapCounter.next();
//	        System.out.print(userMapEntry.getKey() + ": ");
//	        System.out.println(userMapEntry.getValue());
	        }
		
		assertEquals(user1, userHashMap.get("A"));
		assertEquals(user2, userHashMap.get("N"));
			
	}
		
}