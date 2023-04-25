package codding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Exception {
	
	
	public static void main(String[] args) {
		
	}
		
		public  static void getFluentWait(WebElement elem, long time) {
			
			WebDriver driver =new ChromeDriver();
			// Declare and initialize a fluent wait
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			// Specify the time-out of the wait
			wait.withTimeout(5000, TimeUnit.MILLISECONDS);
			// Specify polling time
			wait.pollingEvery(250, TimeUnit.MILLISECONDS);
			// Specify what exceptions to ignore
			wait.ignoring(StaleElementReferenceException.class);

			// This is how we specify the condition to wait on.
			// This is what we will explore more in this chapter
			wait.until(ExpectedConditions.visibilityOfAllElements(elem));

	}
		}
	

