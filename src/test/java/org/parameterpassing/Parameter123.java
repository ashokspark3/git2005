package org.parameterpassing;

import org.baseclass.BaseClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter123 extends BaseClass {

	@Parameters({"ashok","anbu"})
	@Test
	private void hi(int a, int b) {

		
		int c= a+b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
	}
	@Parameters({"value1","value2"})
	@Test
	private void bye(@Optional("admin") String user, String pass) {
browserSetup("https://www.facebook.com/");
findById("email").sendKeys(user);
findById("pass").sendKeys(pass);
clik(findByName("login"));
		
	}
	
	
	
}
