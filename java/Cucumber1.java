package stepdefinations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber1 {
	private static WebDriver driver = null;
	
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 

	}

	
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	  
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.linkText("Leave")).click();
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.xpath("//div[@class=\'oxd-select-text-input\']")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\'yyyy-mm-dd\']")).sendKeys("2022-09-23");
	    driver.findElement(By.xpath("//textarea")).sendKeys("Travelling");
	    driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
	}
	@Then("user is loggedout")
	public void user_is_loggedout() {
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		driver.findElement(By.xpath("//li[4]/a[@class=\"oxd-userdropdown-link\"]")).click();
	}

	
			
	
	}
	




