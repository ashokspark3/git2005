package org.junittask;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public  class WebpageTask extends BaseClass {
@BeforeClass
	public static void m1() throws IOException {
	browserSetup("https://adactinhotelapp.com/SearchHotel.php");
	screenShot("C:\\Users\\Asus\\Documents\\selenium Task\\ashok.png");

	
	}
@Test	
public  void m2() {
	WebElement user = findById("username");
	user.sendKeys("ashokspark");
	WebElement pass = findById("password");
	pass.sendKeys("VEDFM8");
	WebElement login = findById("login");
	login.click();
	WebElement loction = findById("location");
	selectIndex(loction, 4);
	WebElement hotels = findById("hotels");
	selectValue(hotels, "Hotel Creek");
	WebElement roomtype = findById("room_type");
	selectIndex(roomtype, 2);
	WebElement roomnos = findById("room_nos");
	selectIndex(roomnos, 2);
	WebElement checkdate = findById("datepick_in");
	checkdate.sendKeys("08/03/2024");
	WebElement checkout = findById("datepick_out");
	sendkeys(checkout, "09/03/2024");
	WebElement adult = findById("adult_room");
	selectIndex(adult, 2);
	WebElement childroom = findById("child_room");
	selectIndex(childroom, 2);
	WebElement search = findById("Submit");
	search.click();
	WebElement radio = findById("radiobutton_0");
	radio.click();
	WebElement continuee = findById("continue");
	continuee.click();
	WebElement firstname = findById("first_name");
	firstname.sendKeys("ashok");
	WebElement lastname = findById("last_name");
	lastname.sendKeys("av");
	WebElement address = findById("address");
	address.sendKeys("south street");
	WebElement credticard = findById("cc_num");
	credticard.sendKeys("1234567891234567");
	WebElement cardtype = findById("cc_type");
	selectIndex(cardtype, 1);
	WebElement expiremonth = findById("cc_exp_month");
	selectIndex(expiremonth, 2);
	WebElement expireyear = findById("cc_exp_year");
	selectByText(expireyear, "2025");
	WebElement ccv = findById("cc_cvv");
	ccv.sendKeys("646");
	WebElement booknow = findById("book_now");
	booknow.click();
	
	
	
	
	}
	@AfterClass
public static void m3() throws IOException {
	WebElement order = findById("order_no");
//		order.getAttribute(value);
//	String attribute = order.getAttribute("value");
//    System.out.println(attribute);
	String orderid = order.getAttribute("value");
	System.out.println(orderid);
	
		screenShot("C:\\Users\\Asus\\Documents\\selenium Task\\ashok1.png");

}

//public void m4() {
//	
//}
//
//public void m5() {
//	
//}

}
