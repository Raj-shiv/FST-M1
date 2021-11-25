/*Verify the website title
Goal: Read the title of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs’.
c. Get the title of the website.
d. Make sure it matches “Alchemy Jobs – Job Board Application” exactly.
e. If it matches, close the browser*/



package JobBoardActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
	WebDriver driver;
	@BeforeClass
	public void initialisation() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
  
	@Test
	public void Pagetitle() {
		
		String pagettle = driver.getTitle();
		System.out.println("Current URL page Title is: "+pagettle);
		Assert.assertEquals("Alchemy Jobs – Job Board Application", pagettle);
	}
	
	
	@AfterClass
	public void terminate() {
		driver.close();
	}
  
  
}
