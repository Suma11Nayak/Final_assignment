package finalassessment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElements {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		 driver.findElement(By.xpath("//a/span")).click();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.linkText("Leave")).click();
	     driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.xpath("//li[6]")).click();
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.linkText("Time")).click();
	    
	   
	    
		
	
		
		
	}

	

}
