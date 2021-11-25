package GoogleAppsProject;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Project_Activity3 {
	
	AndroidDriver<MobileElement> driver;
	 @BeforeClass
	  public void AppiumSetup() {
		 DesiredCapabilities Caps = new DesiredCapabilities();
		 Caps.setCapability("deviceName", "Pixel4_TestDevice");
		 Caps.setCapability("platform", "android");
		 Caps.setCapability("automationName", "UIAutomator2");
		 Caps.setCapability("appPackage", "com.google.android.keep");
		 Caps.setCapability("appActivity", ".activities.BrowseActivity");
		 Caps.setCapability("noReset", true);
		 URL AppiumURL = null;
		try {
			AppiumURL = new URL("http://localhost:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver = new AndroidDriver<MobileElement>(AppiumURL,Caps);
	  }
		 
	  @Test
	  public void Google_keepRemender() throws InterruptedException {
		  
		  WebDriverWait wait = new WebDriverWait(driver,5);
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAccessibilityId("New text note")));
		  driver.findElementByAccessibilityId("New text note").click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		  driver.findElementById("com.google.android.keep:id/edit_note_text").click();
		  driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("My New Note for reminder");
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("My New Notes description for reminder");
		  Thread.sleep(2000);
		  driver.findElementById("com.google.android.keep:id/menu_switch_to_list_view").click();
		  //com.google.android.keep:id/menu_switch_to_list_view
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  //Pick a date & time
		  driver.findElementByXPath("//android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]").click();
		  Thread.sleep(2000);
		  
		  //com.google.android.keep:id/time_spinner
		  driver.findElementById("com.google.android.keep:id/time_spinner").click();
		  Thread.sleep(2000);
		  //com.google.android.keep:id/reminder_time_afternoon
		  
		  driver.findElementById("com.google.android.keep:id/reminder_time_afternoon").click();
		  Thread.sleep(2000);
		  //com.google.android.keep:id/save
		  driver.findElementById("com.google.android.keep:id/save").click();
		  Thread.sleep(2000);
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  
		  //com.google.android.keep:id/browse_reminder_chip
		 Assert.assertTrue(driver.findElementById("com.google.android.keep:id/reminder_chip_text").isEnabled());

	  }
	
	  @AfterClass
	  public void Teardown() {
		  driver.quit();
	  }

}
