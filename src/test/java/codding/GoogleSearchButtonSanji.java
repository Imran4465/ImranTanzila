package codding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchButtonSanji {

public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		WebElement search= driver.findElement(By.xpath("//input[@title='Search']"));
		Thread.sleep(3000);
		search.click();
		//Using Actions Class
		//Actions action=new Actions(driver);
		//action.click(search).build().perform();
		
		
		//using JavaScript
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", search);
		
		
		//ele.click();
		search.sendKeys("sylhet");
		//Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(search));
		
		
		
		//search.click();
		//Thread.sleep(3000);
		//search.sendKeys("Selenium");
		List<WebElement> element=driver.findElements(By.xpath("//ul[@role='listbox']//descendant::div[@class='wM6W7d']"));
		//List<WebElement> element = driver.findElements(By.xpath("//ul[@role='listbox']/li//span/b"));
		//List<WebElement> element = driver.findElements(By.xpath("(//div[@class='wM6W7d'])[7]"));
		for(int i=0; i<element.size(); i++) { 
			if(element.get(i).getText().equalsIgnoreCase("sylhet weather")) { 
		//after even number there are many bold characters so need to select which one we have to click on
		//so in this case we select s after even number
				//System.out.println("text......");
				Thread.sleep(5000);
				System.out.println("Holds on, I am clicking***********************");
				element.get(i).click();
				Thread.sleep(5000);
				break;
			}
			
		}
		
	}

}
