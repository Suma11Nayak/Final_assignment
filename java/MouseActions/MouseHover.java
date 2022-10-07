package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			String baseUrl;
			  //driver = new FirefoxDriver();
			  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();
			   driver.get("https://www.mapsofindia.com/");
	           driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Actions mouse=new Actions(driver);
				driver.manage().window().maximize();
			
				mouse.moveToElement(driver.findElement(By.linkText("Travel"))).build().perform();
		
		}

	


	}

