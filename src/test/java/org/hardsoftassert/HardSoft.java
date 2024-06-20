package org.hardsoftassert;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoft extends BaseClass {

		
	
	
@Test
private void hi() {
System.out.println("hi");
}
@Test

private void bye() 
{
	Assert.assertTrue(false);

//	Assert.assertTrue(true);
	System.out.println("bye");

}
@Test

private void goodMorning() {
	browserSetup("https://www.facebook.com/");
	WebElement user= findById("email");
	user.sendKeys("ashok");
	String username = user.getAttribute("value");
	Assert.assertFalse(username.equalsIgnoreCase("Ashok"),"username field");
	
	Assert.assertTrue(username.equals("ashok"));
	System.out.println("goodmorning");

}
@Test

private void goodEvening () {
	SoftAssert s=new SoftAssert();
	
	System.out.println("goodevening");
	

}}
