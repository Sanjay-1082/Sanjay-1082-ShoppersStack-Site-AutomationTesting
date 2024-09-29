package com.shoppersstack.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
	@Test
	public void testUserLogin() throws InterruptedException {		
		driver.get("https://www.shoppersstack.com/");  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id='loginBtn']"));
		loginBtn.click();
		
		driver.findElement(By.id("Email")).sendKeys("sanjay06sin@gmail.com", Keys.TAB);
		driver.findElement(By.id("Password")).sendKeys("asd123!@#A");
		driver.findElement(By.id("Login")).click();
	}

}
