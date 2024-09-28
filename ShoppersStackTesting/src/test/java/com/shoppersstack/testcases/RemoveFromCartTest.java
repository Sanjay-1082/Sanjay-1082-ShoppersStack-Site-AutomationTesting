package com.shoppersstack.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends AddToCartTest{
	@Test
	public void setUpAddToCart() throws InterruptedException {
		testAddToCart(); 
	}
	@Test
	public void testRemoveFromCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("cart")).click();
		driver.findElement(By.xpath("//button[text()='Remove from cart']")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.findElement(By.linkText("Home")).click();
	}

}
