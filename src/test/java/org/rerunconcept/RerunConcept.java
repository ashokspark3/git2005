package org.rerunconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunConcept {
@Test
	private void hi() {
System.out.println("hi");
	}
@Test(retryAnalyzer = Returnfailed.class)
	private void bye() {
		Assert.assertFalse(false);
System.out.println("bye");
	}
@Test
	private void buddy() {
System.out.println("buddy");
	}
	
}
