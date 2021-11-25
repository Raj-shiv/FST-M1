/*
 * Verify the website heading
Goal: Read the heading of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs’.
c. Get the heading of the webpage.
d. Make sure it matches “Welcome to Alchemy Jobs” exactly.
e. If it matches, close the browser
 */


package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity2 {
	WebDriver driver;
	@BeforeClass
	public void Initialise() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
  @Test
  public void pageHeadingVal() {
	  
	  String pageheading = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
	  System.out.println("Current Page heading is : "+ pageheading);
	  Assert.assertEquals("Welcome to Alchemy Jobs", pageheading);
  }
  
  @AfterClass
  public void Terminate() {
	  driver.close();
  }
}
