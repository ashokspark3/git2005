package org.testngtask;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgConcept1 {
	@BeforeSuite
	private void m2() {
System.out.println("print method 2");
	}
	@BeforeTest
	private void m3() {
		System.out.println("print method 3");

	}
	@AfterClass
	private void m4() {
		System.out.println("print method 4");

	}
	@Test
	private void m5() {
		System.out.println("print method 5");

	}
	
}
