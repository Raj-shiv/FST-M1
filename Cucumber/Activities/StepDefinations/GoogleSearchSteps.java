package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on the google home page")
	public void givenFunction() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,15);
		driver.get("https://Google.com");
	}
	@When("^user types in cheese and hits enter")
	public void whenFunction() {
		driver.findElement(By.name("q")).sendKeys("Cheese",Keys.RETURN);
		
	}
	@Then("^Show how many search results were shown")
	public void thenFunction() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
		String resultsStats = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results "+resultsStats);
	}
	
	@And("^Close the browser")
	public void andFunction() {
		driver.close();
	}
}
