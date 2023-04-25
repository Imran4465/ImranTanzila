package codding;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// maximize window
		driver.manage().deleteAllCookies();
		// delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");

		WebElement elem = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		elem.sendKeys("iphone");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//descendant::div[@class='wM6W7d']"));
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//descendant::div[@class='pcTkSc']"));
		// System.out.println("total number of suggestions in search box:::===>" +
		// list.size());
		////div[@class='aajZCb']//li//descendant::div[@class='eIPGRd']
		for (int i = 0; i< list.size(); i++) {
			// System.out.println("List of elements fund : " + list.get(i).getText());
			if (list.get(i).getText().contains("iPhone 11")) {
				// System.out.println("Clicking element is a : " + list.get(i).getText());

				Thread.sleep(3000);
				list.get(i).click();
				break;

			}

		}
	}
}
