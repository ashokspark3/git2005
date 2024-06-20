package org.sequentialandparallel;

import org.baseclass.BaseClass;
import org.dataprovider.DataPro;
import org.testng.annotations.Test;


public class SeqPara extends BaseClass {
	
	
	//calling dataprovider for fb details from another dataprovider class		
	@Test(dataProvider = "FB",dataProviderClass =DataPro.class )
	private void hi(CharSequence value, CharSequence value2) {
browserSetup("https://www.facebook.com/");
findById("email").sendKeys(value);
findById("pass").sendKeys(value2);
	}
	@Test
	private void bye() {
browserSetup("https://www.amazon.in/");
	}
	@Test
	private void go() {
browserSetup("https://www.flipkart.com/");
	}

}
