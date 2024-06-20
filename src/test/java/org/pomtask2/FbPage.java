package org.pomtask2;

import java.util.Iterator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;


public class FbPage  extends BaseClass {
public static void main(String[] args) {
	browserSetup("https://www.facebook.com/");
	FbPom f = new FbPom();
	
	WebElement user = f.getUser();
	user.sendKeys("ashok");
	user.clear();
	
	long withcatchstart = System.currentTimeMillis();
	System.out.println(withcatchstart);
	for (int i = 0; i < 100; i++) {
		WebElement user2 = f.getUser();
		String text = user2.getText();
	}
	long withcatchend = System.currentTimeMillis();
	System.out.println(withcatchend);
	System.out.println("withcatch:"+(withcatchend-withcatchstart));
}
	
	
	
}
