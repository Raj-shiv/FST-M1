package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity5 {
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
	}
	
  @Test(groups={"HeaderTests","ButtonTests"})
  public void PageTtle() {
	  
	  System.out.println("Page Title is "+driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Target Practice");
	  
  }
  
  @Test(dependsOnMethods = {"PageTtle"},groups = {"HeaderTests"})
  public void HeaderTest1() {

	  String thirdHdr = driver.findElement(By.id("third-header")).getText();
	  Assert.assertEquals("Third header", thirdHdr);
	  
  }
  
  @Test(dependsOnMethods= {"PageTtle"},groups= {"HeaderTests"})
  public void Headertest2() {
  String color =  driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
	 System.out.println(color);
	  Assert.assertEquals("rgb(33, 186, 69)", color);
  }
  
  @Test(dependsOnMethods = {"PageTtle"},groups = "ButtonTests")
  public void ButtonTest1() {
	  String But_string =  driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
	  System.out.println(But_string);
	  Assert.assertEquals("Olive", But_string);
	  
  }
  

  @Test(dependsOnMethods = {"PageTtle"},groups = "ButtonTests")
  public void ButtonTest2() {
	  
	  String But_color =  driver.findElement(By.xpath("//button[@class='ui brown button']")).getCssValue("color");
	  System.out.println(But_color);
	  Assert.assertEquals("rgb(255, 255, 255)", But_color);
	  
  }
  @AfterClass(alwaysRun=true)
  public void Teardown() {
	  driver.close();
	  
  }
}
