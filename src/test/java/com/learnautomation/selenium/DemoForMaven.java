package com.learnautomation.selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoForMaven {
	
	WebDriver driver;
	@Test
	public void testHello()
	{
		System.out.println("Welcome to Maven");
		
		driver=new ChromeDriver();
		driver.get("https://portal-qa1.regence.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Regence"));
	}

}
