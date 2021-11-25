/*
 * Apply to a job
Goal: Search for a job and apply for it
a. Open browser with Alchemy Jobs site and navigate to the Jobs page.
b. Search for a particular job and wait for listings to show.
c. Click and open any one of the jobs listed.
d. Click the apply button and print the email to the console.
e. Close the browser.

 * */

package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity6 {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void Intialise() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,20);
		driver.get("https://alchemy.hguy.co/jobs");
	}
	
	@Test
	public void ApplyJobs() throws InterruptedException {
		driver.findElement(By.linkText("Jobs")).click();
		String pageTitle = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals("Jobs – Alchemy Jobs",pageTitle);
		driver.findElement(By.id("search_keywords")).sendKeys("Business Analyst");
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']/li")));
		Rectangle Jobsize = driver.findElement(By.xpath("//ul[@class='job_listings']/li")).getRect();
		System.out.println("Total number of Jobs displayed is : "+Jobsize);
	}
	
	@AfterClass
	public void Terminate() {
		//driver.close();
	}
}
