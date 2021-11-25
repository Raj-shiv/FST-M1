package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity3 {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
		
	}
  @Test
  public void login() {
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	  String confirm_msg = driver.findElement(By.id("action-confirmation")).getText();
	  System.out.println(driver.findElement(By.id("action-confirmation")).getText());
	  Assert.assertEquals("Welcome Back, admin", confirm_msg);
  }
  
  @AfterClass
  public void teardown()
  {
	  driver.close();
  }
}
