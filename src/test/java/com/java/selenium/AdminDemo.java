package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminDemo {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	Thread.sleep(5000);
	driver.findElement(By.id("password")).sendKeys("admin");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("ajax-loading-block-window")).click();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(5000);
	
	

	}

}
