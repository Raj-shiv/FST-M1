/*
 * Create a new job listing
Goal: Create a new job listing
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/jobs’
c. Locate the navigation menu and click the menu item that says “Post a Job”
d. Fill in the necessary details and click the button that says “Preview”.
e. Click on the button that says “Submit Listing”.
f. Verify that the job listing was posted by visiting the jobs page.
g. Close the browser.

 * */

package JobBoardActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void Initilisation() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		
	}
	
  @Test
  public void PostJob() throws InterruptedException {
	  
	  driver.findElement(By.linkText("Post a Job")).click();
	  String PJobTitle = driver.getTitle();
	  System.out.println("Post job Page Title"+PJobTitle);
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("user_login")).sendKeys("root");
	  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("wp-submit")).click();
	  driver.findElement(By.id("job_title")).sendKeys("Business Analyst");
	  Thread.sleep(2000);
	 // driver.switchTo().frame("job_description_ifr");
	  
	  driver.switchTo().frame("job_description_ifr");
	  //driver.findElement(By.xpath("//*[@id='tinymce']/p")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Creating a detailed business analysis, outlining problems, opportunities and solutions for a business\n"
	  		+ "Budgeting and forecasting\n"
	  		+ "Planning and monitoring\n"
	  		+ "Variance analysis\n"
	  		+ "Pricing\n"
	  		+ "Reporting\n"
	  		+ "Defining business requirements and reporting them back to stakeholders");
	  driver.switchTo().defaultContent();
	  driver.findElement(By.id("application")).sendKeys("shiva@rockon.com");
	  driver.findElement(By.id("company_name")).sendKeys("Rockon.pvt.ltd");
	  driver.findElement(By.id("company_website")).sendKeys("https://rockon.libstart.com");
	  driver.findElement(By.id("company_tagline")).sendKeys("Sports game company");
	  driver.findElement(By.id("company_twitter")).sendKeys("libstart@rackon");
	  driver.findElement(By.xpath("//input[@value='Preview']")).click();
	  driver.findElement(By.id("job_preview_submit_button")).click();
	  String PostJSuccess = driver.findElement(By.xpath("//div[@class='entry-content clear']")).getText();
	  System.out.println("Current Post Job Status : "+PostJSuccess);
  }
  
  @AfterClass(alwaysRun=true)
  public void Terminate()
  {
	  
  }
}
