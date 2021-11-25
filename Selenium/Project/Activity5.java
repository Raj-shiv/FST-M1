/*
 *Navigate to another page
Goal: Navigate to the “Jobs” page on the site.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs’.
c. Find the navigation bar.
d. Select the menu item that says “Jobs” and click it.
e. Read the page title and verify that you are on the correct page.
f. Close the browser 
 * */

package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity5 {
	WebDriver driver;
	@BeforeClass
	public void Intialise() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void JobsPage() throws InterruptedException {
		driver.findElement(By.linkText("Jobs")).click();
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("Title of the Jobs page is : "+pageTitle);
		Assert.assertEquals("Jobs – Alchemy Jobs",pageTitle);
	}
	
	@AfterClass
	public void Terminate() {
		driver.close();
	}
}
