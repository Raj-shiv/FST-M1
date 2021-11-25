package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println(driver.getTitle());
		System.out.println("Text the link is "+driver.findElement(By.id("about-link")).getText());
		System.out.println("Text the link is "+driver.findElement(By.className("green")).getText());
		System.out.println("Text the link is "+driver.findElement(By.linkText("About Us")).getText());
		System.out.println("Text the link is "+driver.findElement(By.cssSelector(".green")).getText());
		System.out.println("Text the link is "+ driver.findElement(By.linkText("About Us")).getText());
		
		

	}

}
