package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}
	
	
  @Test
  public void run() {
	  
	  System.out.println(driver.getTitle());
	  
	  Assert.assertEquals("Training Support", driver.getTitle());
	  driver.findElement(By.id("about-link")).click();
	  String newTitle = driver.getTitle();
	  System.out.println("New Page Title is "+newTitle);
	  Assert.assertEquals("About Training Support", newTitle);
	  
	  
  }
  
  @AfterClass
  public void teardown() {
	  
	  driver.quit();
	  
  }
}
