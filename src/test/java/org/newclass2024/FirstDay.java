package org.newclass2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
public static void main(String[] args) {
	

	WebDriver d= new ChromeDriver();
	d.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.18.1");
	d.manage().window().maximize();
}}
