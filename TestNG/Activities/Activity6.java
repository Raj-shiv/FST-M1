package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Activity6 {
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
  
	@Test
	@Parameters({"username","password"})
  public void Signin(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
  }
  
  @AfterClass(alwaysRun = true)
  public void teardown() {
	  driver.close();
  }
  
}
