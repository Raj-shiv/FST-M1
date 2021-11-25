package GoogleAppsProject;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Project_Activity1 {
	
	AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	  public void Setup() {
		
		DesiredCapabilities Caps = new DesiredCapabilities();
		Caps.setCapability("deviceName", "Pixel4_TestDevice");
		Caps.setCapability("platform", "android");
		Caps.setCapability("automationName", "UIAutomator2");
		Caps.setCapability("appPackage", "com.google.android.apps.tasks");
		Caps.setCapability("appActivity", ".ui.TaskListsActivity");
		Caps.setCapability("noReset", true);
		
		//Define Appium URL
		URL appiumURL = null;
		try {
			appiumURL = new URL("http://localhost:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver<MobileElement>(appiumURL,Caps);
	  }
	
	  @Test
	  public void Google_AddTasks() throws InterruptedException {

		  
			
			  WebDriverWait wait = new WebDriverWait(driver,5);
			  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tasks_fab")));
			  driver.findElementById("tasks_fab").click();
			  //driver.findElementById("container").click();
			  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			  //driver.findElementById("add_task_title").click();
			  
			  //AddTask1:Complete Activity with Google Tasks
			  driver.findElementById("com.google.android.apps.tasks:id/add_task_title").
			  sendKeys("Complete Activity with Google Tasks");
			  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			  driver.findElementById("com.google.android.apps.tasks:id/add_task_done").
			  click(); //AddTask2:Complete Activity with Google Keep
			  driver.findElementById("tasks_fab").click();
			  driver.findElementById("com.google.android.apps.tasks:id/add_task_title").
			  sendKeys("Complete Activity with Google Keep");
			  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			  driver.findElementById("com.google.android.apps.tasks:id/add_task_done").
			  click(); //AddTask3:Complete the second Activity Google Keep
			  driver.findElementById("tasks_fab").click();
			  driver.findElementById("com.google.android.apps.tasks:id/add_task_title").
			  sendKeys("Complete the second Activity Google Keep");
			  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			  driver.findElementById("com.google.android.apps.tasks:id/add_task_done").
			  click();
			 
		  List<MobileElement> tasks = driver.findElementsById("com.google.android.apps.tasks:id/task_name");
		  int Size = tasks.size();
		  Assert.assertTrue(Size>3);
		  //Assert.assertEquals("Complete Activity with Google Tasks",tasks.forEach((task)->task.getText()[2]));
		  
//		 for(MobileElement task:tasks)
//		 {
//			 System.out.println(task.getText());
//		 }
		  
		  
		  
		  
	  }
  

	  @AfterClass
	  public void Teardown() {
		  driver.quit();
		  
	  }

}
