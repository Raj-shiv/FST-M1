package ibm.comm.Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.findElement(By.cssSelector("button[id='toggleCheckbox']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//label[text()='Dynamic Checkbox']")));
		driver.findElement(By.cssSelector("button[id='toggleCheckbox']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Dynamic Checkbox']")));
		driver.close();
		
		
		
		
		
		
		

	}

}
