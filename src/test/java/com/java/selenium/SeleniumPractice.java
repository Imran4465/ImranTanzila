package com.java.selenium;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumPractice {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/?sk=welcome");
		 driver.manage().window().maximize();
		
		 driver.findElement(By.id("email")).sendKeys("dinerpur@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("2Partners");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg'])[7]")).click();
		 driver.findElement(By.xpath("l9j0dhe7")).click();
		
		 
		 String title="Facebook";
		 
		 Assert.assertEquals(title, driver.getTitle());
		
		 System.out.println("My page title is "+driver.getTitle()); 
	}

}
