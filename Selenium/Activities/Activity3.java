package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("Shiva");
		driver.findElement(By.id("lastName")).sendKeys("Shiva");
		driver.findElement(By.id("email")).sendKeys("Shiva@gmail.com");
		driver.findElement(By.id("number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		//driver.close();
	}

}
