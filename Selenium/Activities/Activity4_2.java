package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shivaraj");

		        //Find the input fields and enter text
		       driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("HUlagur");

		        //Enter the email
		        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");

		        //Enter the contact number
		        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

		        //Enter Message
		        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

		        //Click Submit
		        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		    }
		

	}


