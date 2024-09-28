package com.shoppersstack.testcases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AddToCartTest extends LogInTest {

	@Test
	public void setUpLogIn() throws InterruptedException {
		testUserLogin();
	}
	
	@Test
	public void testAddToCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search=driver.findElement(By.id("search"));
		search.sendKeys("mobile");
		driver.findElement(By.id("searchBtn")).click();		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='add to cart'][1]")).click();
	}

}
