package com.shoppersstack.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogOutTest extends LogInTest{
	@Test
	public void setUpLogInTest() throws InterruptedException {
		testUserLogin();
	}
	
	@Test
	public void testLogOut() {
		driver.findElement(By.xpath("//div[text()='s']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}

}
