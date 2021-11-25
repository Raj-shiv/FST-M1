/*
 * Create a job listing using the backend
Goal: Visit the site’s backend and create a job listing
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs/wp-admin’ and log in.
c. Locate the left hand menu and click the menu item that says “Job Listings”.
d. Locate the “Add New” button and click it.
e. Fill in the necessary details.
f. Click the “Publish” button.
g. Verify that the job listing was created.
h. Close the browser
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

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void Initialise() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,10);
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	
	}
  @Test
  public void JobListing() throws InterruptedException {
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Dashboard')]")));
	  String Login_text = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	  Assert.assertEquals("Dashboard", Login_text);
	  driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
	  driver.findElement(By.xpath("//div/a[contains(text(),'Add New')]")).click();
	  driver.findElement(By.cssSelector("textarea.editor-post-title__input")).sendKeys("Developer1");
	  driver.findElement(By.xpath("//div[contains(@id,'editor-')]")).sendKeys("xyz");
	  driver.findElement(By.id("_application")).sendKeys("classvate@zing.com");
	  driver.findElement(By.id("_job_location")).sendKeys("classvate@zing.com");
	  driver.findElement(By.id("_company_website")).sendKeys("https://classvate.com");
	  driver.findElement(By.id("_company_name")).sendKeys("Classvate.pvt.ltd");
	  driver.findElement(By.id("_company_tagline")).sendKeys("Service company");
	  driver.findElement(By.id("_company_twitter")).sendKeys("shiva@classvate.com");
	  //driver.findElement(By.xpath("//*[@id=\"_job_expires\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@class='components-button is-secondary']")).click();
	  String PostJobtest = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
	  System.out.println(PostJobtest);
	  Assert.assertEquals("Developer1", PostJobtest);
  }
  
  @AfterClass
  public void terminate() {
	  driver.close();
  }
}
