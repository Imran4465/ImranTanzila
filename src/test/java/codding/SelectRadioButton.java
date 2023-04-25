package codding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ele=driver.findElement(By.xpath("//input[@value='radio2']"));// isSelected(),isDisplayed(),isEnabled()
		boolean select=ele.isSelected();
		if(!select) {
			Thread.sleep(3000);
			ele.click();
		} 
		
		
		}
}
