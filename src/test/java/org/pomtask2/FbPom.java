package org.pomtask2;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbPom extends BaseClass {
	 public FbPom() {

	 PageFactory.initElements(driver, this);
	 }
	// @FindBys({@FindBy(id="email"),@FindBy (xpath="//input[@name='email']")})
	@CacheLookup
	 @FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
private WebElement user;
	 public WebElement getUser() {
			return user;
		}
	
}
