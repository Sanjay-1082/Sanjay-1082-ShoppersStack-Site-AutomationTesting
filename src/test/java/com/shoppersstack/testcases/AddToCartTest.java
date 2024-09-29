package com.shoppersstack.testcases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AddToCartTest extends BaseTest {

	
	@Test
	public void testAddToCart() throws InterruptedException {
		driver.get("https://www.shoppersstack.com/");  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id='loginBtn']"));
		loginBtn.click();
		
		driver.findElement(By.id("Email")).sendKeys("sanjay06sin@gmail.com", Keys.TAB);
		driver.findElement(By.id("Password")).sendKeys("asd123!@#A");
		driver.findElement(By.id("Login")).click();
		WebElement search=driver.findElement(By.id("search"));
		search.sendKeys("tshirt");
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();		
		driver.findElement(By.xpath("//button[text()='add to cart'][1]")).click();
		Thread.sleep(2000);
	}

}
