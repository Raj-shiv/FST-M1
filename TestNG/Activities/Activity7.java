package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity7 {
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	@DataProvider(name = "Authentication")
	public static Object[][] Credintials(){
		return new Object[][] {{"admin","password"},{"Testuser1","Testuser1"}};
		
	}
	
  @Test(dataProvider="Authentication")
  public void Signin(String username,String password) {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	  String login_confo = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals("Welcome Back, admin", login_confo);
  }
  
  @AfterClass(alwaysRun=true)
  public void teardown() {
	  driver.close();
  }
}
