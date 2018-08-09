package management_system;

import static org.junit.Assert.*;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.gson.Gson;

public class ManagementTests {

	
	@Test
	public void testJsonUser2() {

		HashMap userHashMap = new HashMap();
		
		Account user1 = new Account(1, "A", "B", 123);
		Account user2 = new Account(2, "X", "Y", 234);
		Account user3 = new Account(3, "X", "Y", 342);
		Account user4 = new Account(4, "A", "Y", 423);
		Service service = new Service();
		
		service.addingAccounts(user1);
		service.addingAccounts(user2);
		service.addingAccounts(user3);
		service.addingAccounts(user4);

	    
		assertEquals(3, service.counterMethod("X"));
	    }
		
			
	}
		