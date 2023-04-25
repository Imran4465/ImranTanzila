package codding;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindow {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://demoqa.com/browser-windows";
		driver.get(url);
		//driver.navigate().to(url);
		
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		
		String mainwindow=driver.getWindowHandle();//To handle mainwindow
		Set<String> set=driver.getWindowHandles(); //To handle childwindow & return String type set
		Iterator<String> iterator=set.iterator();  //To go one by one
		while(iterator.hasNext()) {                //Ignore mainwindow
			String childwindow=iterator.next();    //For counting of childwindow
			if(!mainwindow.equalsIgnoreCase(childwindow)) { //Is not mainwindow then switch to childwindow
				driver.switchTo().window(childwindow);
				Thread.sleep(4000);
				driver.close();
			  System.out.println("Close to childwindow");
				
			}
	}
       driver.switchTo().window(mainwindow); //switchTo().defaultContain(mainwindow)
       Thread.sleep(4000);
       driver.close();
       System.out.println("Close to mainwindow");
	}
		
	}

