package org.pomtask;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbPom  extends BaseClass{
	public FbPom() {
	
		PageFactory.initElements(driver,this);
		
		}
	// either one condition false it wont execute
	@FindBys({@FindBy(id="email"),@FindBy (xpath="//input[@name='emal']")})
	// either one is true it will allow the process
	// @FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})

	//@FindBy(id="email")
	private WebElement user;
	public WebElement getUser() {
		return user;
	}
	
	

}
