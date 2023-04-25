package com.java.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='nav-icon far fa-user']")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[text()=' Categories']")).click();
		WebElement text1=driver.findElement(By.xpath("//div[@class='content-header']"));
		String result=text1.getText();
		String abc="Dashboard";
		
		Assert.assertEquals(result,abc);
		System.out.println(result);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		
		String title ="Your store. Login";
		Assert.assertEquals(title, driver.getTitle());
		System.out.println("Page title is: " +driver.getTitle());
		
		driver.quit();
		
	}

}
