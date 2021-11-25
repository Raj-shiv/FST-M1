package GoogleAppsProject;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Project_Activity4 {
 
  AndroidDriver<MobileElement> driver;
	 @BeforeClass
	  public void AppiumSetup() throws InterruptedException {
		 DesiredCapabilities Caps = new DesiredCapabilities();
		 Caps.setCapability("deviceName", "Pixel4_TestDevice");
		 Caps.setCapability("platform", "android");
		 Caps.setCapability("automationName", "UIAutomator2");
		 Caps.setCapability("appPackage", "com.android.chrome");
		 Caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		 Caps.setCapability("noReset", true);
		 URL AppiumURL = null;
		try {
			AppiumURL = new URL("http://localhost:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver = new AndroidDriver<MobileElement>(AppiumURL,Caps);
		 driver.get("https://www.training-support.net/selenium");
		 Thread.sleep(2000);
	  }
	 
	 @Test
	  public void Train_supp_task() throws InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
		 //wait.until(ExpectedConditions.titleContains());
		 Thread.sleep(3000);
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(10)"));
		driver.findElementByXPath("//android.view.View[contains(@text,'To-Do List')]").click();
		 Thread.sleep(5000); 
		 driver.findElementByClassName("android.widget.EditText").sendKeys("Add tasks to list");
		 //driver.findElementById("taskInput").sendKeys("Add tasks to list");
		 driver.findElementByXPath("//android.widget.Button[contains(@text,'Add Task')]").click();
		 Thread.sleep(5000);
		 driver.findElementByClassName("android.widget.EditText").sendKeys("Get number of tasks");
		 //driver.findElementById("taskInput").sendKeys("Get number of tasks");
		 driver.findElementByXPath("//android.widget.Button[contains(@text,'Add Task')]").click();
		 Thread.sleep(5000);
		 //driver.findElementById("taskInput").sendKeys("Clear the list");
		 driver.findElementByClassName("android.widget.EditText").sendKeys("Clear the list");
		 driver.findElementByXPath("//android.widget.Button[contains(@text,'Add Task')]").click();
		 Thread.sleep(5000);
		 driver.findElementByXPath("//android.view.View[contains(@text,'Add tasks to list')]").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//android.view.View[contains(@text,'Get number of tasks')]").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//android.view.View[contains(@text,'Clear the list')]").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//android.view.View[contains(@text,'Clear List')]").click();
		 Thread.sleep(3000);
		 List<MobileElement> Elements = driver.findElementsByXPath("//android.view.View");
		 //Assert.assertEquals("Clear List",driver.findElementByXPath("//android.view.View[contains(@text,'Clear the list')]").getText());
		 System.out.println(Elements.size());
		 if(Elements.size()<=10)
			 Assert.assertTrue(true);
		 else
			 Assert.assertTrue(false);
		 
	  }
		

	  @AfterClass
	  public void teardown() {
		  driver.quit();
		  
	  }

}
