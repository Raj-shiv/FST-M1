package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		System.out.println("Check Box Displayed?"+driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed());
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		System.out.println("Check Box Displayed now?"+driver.findElement(By.xpath("//input[@class='willDisappear']")).isDisplayed());
		
		

	}

}
