/*
 * Verify the website’s second heading
Goal: Read the second heading of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs’.
c. Get the second heading on the page.
d. Make sure it matches “Quia quis non” exactly.
e. If it matches, close the browser.

 * */

package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity4 {
	WebDriver driver;
	@BeforeClass
	public void intialise() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	@Test
	public void secondHeading() {
		
		String secondhead= driver.findElement(By.xpath("//div[@class='entry-content clear']/h2")).getText();
		System.out.println("Second heading on the current Page is : "+secondhead);
		Assert.assertEquals("Quia quis non", secondhead);
		
	}
	
	@AfterClass
	public void Terminate() {
		driver.close();
	}
}
