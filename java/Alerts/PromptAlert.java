package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe"); 

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        // Maximize the browser 
        driver.manage().window().maximize(); 
        // Launch Website 
        driver.get("https://demoqa.com/alerts"); 
        // clicking on prompt button 
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click(); 
        // accepting javascript alert 
       Alert alert = driver.switchTo().alert(); 
        alert.accept();
        // clicking on prompt button 
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click(); 
        // Rejecting javascript alert 
   Alert alert1 = driver.switchTo().alert(); 
   alert1.dismiss();         

          

    
	}
}

