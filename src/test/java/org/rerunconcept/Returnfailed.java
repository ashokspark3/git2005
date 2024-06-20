package org.rerunconcept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Returnfailed implements  IRetryAnalyzer{

	
	int min = 1, max= 10;
	@Override
	public boolean retry(ITestResult result) {
		if (min<=max) {
			min++;
			return true;
		}
		return false;
	}

	
	
	
}
