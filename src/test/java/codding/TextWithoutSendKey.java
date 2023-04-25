package codding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextWithoutSendKey {
	
	
	

	

		public static void main(String[] args) throws Throwable {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com/");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement send = driver.findElement(By.xpath("//input[@type='text']"));
			js.executeAsyncScript("arguments[0].value= 'mailto:hamid_002@yahoo.com'", send );
				
		}

	}

	



