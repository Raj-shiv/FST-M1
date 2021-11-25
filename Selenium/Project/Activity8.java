/*
 * Login into the website’s backend
Goal: Visit the site’s backend and login
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs/wp-admin’.
c. Find the username field of the login form and enter the username into that field.
d. Find the password field of the login form and enter the password into that field.
e. Find the login button and click it.
f. Verify that you have logged in.
g. Close the browser.

 * */

package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity8 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void Initialise() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,10);
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}
	@Test
	public void AdminConsole() {
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Dashboard')]")));
		String Login_text = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
		Assert.assertEquals("Dashboard", Login_text);
		
	}
	
	@AfterClass
	public void Terminate() {
		driver.close();
	}
}
