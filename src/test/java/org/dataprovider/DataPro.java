package org.dataprovider;

import org.baseclass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro extends BaseClass {
@Test(dataProvider = "FB")
	private void hi(CharSequence value, CharSequence value2) {
		browserSetup("https://www.facebook.com/");
		findById("email").sendKeys(value);
		findById("pass").sendKeys(value2);

	}

	@DataProvider(name="FB")
	public Object[][] data()
	{
	Object a[][] 	=new Object[3][2];
a[0][0] ="ashok";

a[0][1] ="125";
a[1][0] ="arun";
a[1][1] ="2564";
a[2][0] ="kavi";
a[2][1] ="4565";
		
		return a;
		
		
		
		
	}

}
