package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ZooplaPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("smarttech1990@gmail.com");
		driver.findElement(By.id("password")).sendKeys("smarttech@20");
		driver.findElement(By.xpath("//button[@class='c-juxpAL c-juxpAL-ervJfA-fw-true c-juxpAL-fKTdVa-category-primary']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		String title ="Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
		Assert.assertEquals(title, driver.getTitle());
		System.out.println("My page name is Zoopla: " +driver.getTitle());

		//driver.close();
		driver.quit();
	}

}
