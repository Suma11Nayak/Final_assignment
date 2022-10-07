package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




	@SuppressWarnings("deprecation")


public class SimpleAlert {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.switchTo().frame("login_page");
		  driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		  Alert HdfcAlert=driver.switchTo().alert();
		  String actualResult=HdfcAlert.getText();
	
		  HdfcAlert.accept();
		  driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
		  System.out.println(actualResult);
		  String expectedResult="Customer ID  cannot be left blank1.";
		
		  Assert.assertEquals(actualResult,expectedResult,"actual result and expected results are not matching");
		
	}

}


	

