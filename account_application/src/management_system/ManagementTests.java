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
		
		Account Auser = new Account(1, "A", "B", 123);
		Account userX = new Account(2, "X", "Y", 234);
		Account Xuser = new Account(3, "X", "Y", 342);
		Account userA = new Account(4, "A", "Y", 423);
		Service service = new Service();
		
		service.addingAccounts(Auser);
		service.addingAccounts(userX);
		service.addingAccounts(Xuser);
		service.addingAccounts(userA);

	    
		assertEquals(2, service.counterMethod("X"));
	    }
		
			
	}
		