package GoogleAppsProject;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Project_Activity2 {
	
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
	  public void Google_KeepApp() throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(driver,5);
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAccessibilityId("New text note")));
		  driver.findElementByAccessibilityId("New text note").click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		  driver.findElementById("com.google.android.keep:id/edit_note_text").click();
		  driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("My New Note");
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("My New Notes description");
		  Thread.sleep(2000);
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  
		 List<MobileElement> titles = driver.findElementsById("com.google.android.keep:id/index_note_title");
		  
		  for(MobileElement title:titles)
		  {
			  System.out.println(title.getText());
			  if(title.getText()!=("My New Note")) {
				  Assert.assertTrue(false);
			  }
		  }
		  //System.out.println(driver.findElementsById("com.google.android.keep:id/index_note_title").getText());
		  
	  }
	 
	
	  @AfterClass
	  public void Teardown() {
		  driver.quit();
		  
	  }

}
