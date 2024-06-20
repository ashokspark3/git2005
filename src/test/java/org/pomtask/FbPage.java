package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class FbPage extends BaseClass {
public static void main(String[] args) {
	browserSetup("https://www.facebook.com/");
	FbPom f= new FbPom();
	 WebElement user = f.getUser();
	user.sendKeys("ashok");
	driver.navigate().refresh();
	user.sendKeys("eniya");
	
	
}
	
	
}
