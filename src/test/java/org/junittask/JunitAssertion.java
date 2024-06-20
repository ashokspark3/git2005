package org.junittask;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JunitAssertion extends BaseClass {
	
	@Test
public void tc1() {
System.out.println("ashok");
}
	@Test
public void tc2() {
browserSetup("http://www.facebook.com");
WebElement user = findById("email");
user.sendKeys("cricket");
String attribute = user.getAttribute("value");
// System.out.println(attribute);
//1 assert true case
// Assert.assertTrue(attribute.equals("Cricket"));
// Assert.assertTrue(attribute.equals("cricket"));
//2 assert failure case
 //Assert.assertFalse(attribute.equals("ashok"));
 //3 assert equals
// Assert.assertEquals("cricket",attribute);
 Assert.assertEquals("user name","cricket",attribute);

System.out.println("assertion performed");
		
}
	@Test
public void tc3() {
System.out.println("Test3");
}
	@Test
public void tc4() {
	System.out.println("Test4");

}
}
