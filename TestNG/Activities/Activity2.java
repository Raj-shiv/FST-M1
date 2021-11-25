package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity2 {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		
	}
  @Test
  public void FirstTC() {
	  System.out.println("Title of the current Page is "+driver.getTitle());
	  String Title = driver.getTitle();
	  Assert.assertEquals("Target Practice", Title);
	  
  }
  @Test
  public void SecondTC() {
	  String blc_Button = driver.findElement(By.cssSelector("button.ui.black.button")).getText();
	  System.out.println(blc_Button);
	  Assert.assertEquals("Black", false);
	  
  }
  @Test(enabled=false)
  public void ThirdTC() {
	  
  }
  
  @Test
  private void FourthTC() throws SkipException {
	// TODO Auto-generated method stub
	  String condition = "Skip test";
	  if(condition.equals("Skip test")) {
		  throw new SkipException("Skipping the test");
	  }
	  else {
		  System.out.println("Test is not skipped");
	  }
}
@AfterClass
  public void teardown() {
	  driver.quit();
  }
  
}
