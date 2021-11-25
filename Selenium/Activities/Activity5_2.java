package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		System.out.println("Check Box selected? "+driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected());
		driver.findElement(By.xpath("//input[@class='willDisappear']")).click();
		//driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		System.out.println("Check Box Selected now? "+driver.findElement(By.xpath("//input[@class='willDisappear']")).isSelected());
		
		


	}

}
