package org.groupstask;

import org.testng.annotations.Test;

public class Groupsss {
@Test(groups = "sanity")
	private void hi() {
System.out.println("hi");
	}
@Test(groups = "sanity")
	private void bye() {
		System.out.println("bye");

	}
@Test(groups = "smoke",dependsOnGroups = "sanity")
	private void goodMorning() {
		System.out.println("goodmorning");

	}
@Test(groups = "reg")
	private void goodEvening () {
		System.out.println("goodevening");

	}
	
	
}
