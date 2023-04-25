package codding;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	
	public class GoogleDropDown {
		
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
			WebElement serchBox =driver.findElement(By.xpath("//input[@name='q']"));
			serchBox.click();
			Thread.sleep(5000);
			serchBox.sendKeys("even number");
			Thread.sleep(3000);
			
			//List <WebElement> element= driver.findElements(By.xpath("//ul[@role='listbox']/li//span/b"));
			List <WebElement> group= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//descendant::div[@class='wM6W7d']"));
			//System.out.println("elements.....");
			for(int i=0; i<group.size(); i++) { 
				if(group.get(i).getText().contains("even numbers 1 to 100")) { 
			//after even number there are many bold characters so need to select which one we have to click on
			//so in this case we select s after even number
					//System.out.println("text......");
					Thread.sleep(5000);
					group.get(i).click();
					//Thread.sleep(5000);
					break;
				}
			}
			//driver.quit();		

		}

	}
