package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		System.out.println("input field is enabled? "+driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		System.out.println("input field is enabled now? "+driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled());

	}

}
