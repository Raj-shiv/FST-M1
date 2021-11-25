/*
 * Get the url of the header image
Goal: Print the url of the header image to the console
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs’.
c. Get the url of the header image.
d. Print the url to the console.
e. Close the browser.

 * */


package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	@BeforeClass
	public void intialise() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void imageURL() {
		
		String imagurl = driver.findElement(By.cssSelector("img.attachment-large.size-large.wp-post-image")).getAttribute("srcset");
	    System.out.println("Page heading imag URL is : "+imagurl);
	}
	
	@AfterClass
	public void Terminate() {
		driver.close();
		
	}
	}
