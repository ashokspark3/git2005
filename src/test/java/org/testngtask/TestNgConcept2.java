package org.testngtask;

import org.testng.annotations.Test;

public class TestNgConcept2 {
	@Test(priority = 5)
private void hi() {
System.out.println("hi");
}
	@Test(priority = 10,invocationCount = 4)
private void vaada() {
System.out.println("vaada");
}
	@Test(priority = 0,enabled = false)
private void gdnt() {
System.out.println("gdnt");
}
	@Test(invocationCount = 4,enabled = false)
private void gdeve() {
System.out.println("gdeve");
}
	@Test(priority = -20)
private void salute() {
System.out.println("salute");
}
	@Test(priority = -15)
private void goodmorning() {
System.out.println("gdmng");
}
	@Test(priority = -3)
private void bye() {
System.out.println("bye");
}
}
