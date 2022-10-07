package finalassessment;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;


public class HRMWithTestNG {
	
	
	WebDriver driver;
	@Test(priority=1)

 void hrmLogin() 
	{
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
	
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		
		
	}

	@Test(priority=0)


	void ApplyLeave() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//String a=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
			driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
			
		    driver.findElement(By.linkText("Leave")).click();
		    driver.findElement(By.linkText("Apply")).click();
		    driver.findElement(By.xpath("//div[@class=\'oxd-select-text-input\']")).click();
		    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		    driver.findElement(By.xpath("//input[@placeholder=\'yyyy-mm-dd\']")).sendKeys("2022-09-23");
		    driver.findElement(By.xpath("//textarea")).sendKeys("Travelling");
		    driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		}
		
	
	

}
