package GoogleAppsProject;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Project_Activity5 {
	
	 AndroidDriver<MobileElement> driver;
	 DesiredCapabilities Caps = new DesiredCapabilities();
	 @BeforeClass
	  public void AppiumSetup() throws InterruptedException {
		
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
		// Thread.sleep(2000);
	  }
	 
	  @Test(enabled=true)
	  public void Support_SuccessLogin() throws InterruptedException {
		  
		  URL AppiumURL = null;
			try {
				AppiumURL = new URL("http://localhost:4723/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 driver = new AndroidDriver<MobileElement>(AppiumURL,Caps);
			 driver.get("https://www.training-support.net/selenium");
		  
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.xpath("//android.view.View[1]/android.widget.Button[@text='Login']")));
		  
//		  TouchActions action = new TouchActions(driver);
//		  action.scroll(element, 10, 100);
//		  action.perform();
		  Thread.sleep(3000);
		  //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingForward()"));
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
		//		+ ".scrollForward(5).scrollIntoView(textContains(\"Please sign in.\"))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
		 driver.findElementByXPath("//android.view.View[contains(@text,'Please sign in')]").click();
		  //Thread.sleep(3000);
		  //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(10)"));
		  Thread.sleep(3000);
		  //.scrollIntoView(textContains(\"Login Form\"))Login Form  Please sign in.
		  //driver.findElementById("username").sendKeys("admin");
		 // driver.findElement(MobileBy.id("username")).sendKeys("admin");
		  driver.findElementByXPath("//android.view.View/android.widget.EditText[1]").sendKeys("admin");
		  Thread.sleep(3000);
		  driver.findElementByXPath("//android.view.View/android.widget.EditText[2]").sendKeys("password");
		  //driver.findElementById("password").sendKeys("password");
		  Thread.sleep(3000);
		  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		  Thread.sleep(3000);
		  //String Login_Confo = driver.findElementById("action-confirmation").getText();
		  String Login_Conf = driver.findElementByXPath("//android.view.View/android.view.View[4]").getText();
		 System.out.println(Login_Conf);
		  if(Login_Conf.contentEquals("Welcome Back, admin"))
		  {
			  System.out.println("Login Successfull");
			  Assert.assertTrue(true);
		  }
		  
	  }
	  
	  @Test(enabled=true)
	  public void Support_unSuccessLogin() throws InterruptedException {
		  
		  URL AppiumURL = null;
			try {
				AppiumURL = new URL("http://localhost:4723/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 driver = new AndroidDriver<MobileElement>(AppiumURL,Caps);
			 driver.get("https://www.training-support.net/selenium");
			 
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.xpath("//android.view.View[1]/android.widget.Button[@text='Login']")));
		  
//		  TouchActions action = new TouchActions(driver);
//		  action.scroll(element, 10, 100);
//		  action.perform();
		  Thread.sleep(3000);
		  //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingForward()"));
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
		//		+ ".scrollForward(5).scrollIntoView(textContains(\"Please sign in.\"))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
		 driver.findElementByXPath("//android.view.View[contains(@text,'Please sign in')]").click();
		  //Thread.sleep(3000);
		  //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(10)"));
		  Thread.sleep(3000);
		  //.scrollIntoView(textContains(\"Login Form\"))Login Form  Please sign in.
		  //driver.findElementById("username").sendKeys("admin");
		 // driver.findElement(MobileBy.id("username")).sendKeys("admin");
		  driver.findElementByXPath("//android.view.View/android.widget.EditText[1]").sendKeys("admin");
		  Thread.sleep(3000);
		  driver.findElementByXPath("//android.view.View/android.widget.EditText[2]").sendKeys("password1");
		  //driver.findElementById("password").sendKeys("password");
		  Thread.sleep(3000);
		  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		  Thread.sleep(3000);
		  //String Login_Confo = driver.findElementById("action-confirmation").getText();
		  String Login_Conf = driver.findElementByXPath("//android.view.View/android.view.View[4]").getText();
		 System.out.println(Login_Conf);
		  if(Login_Conf.contentEquals("Invalid Credentials"))
		  {
			  System.out.println("Login UnSuccessfull");
			  Assert.assertTrue(false);
		  }
		  
	  }
	  
	
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
