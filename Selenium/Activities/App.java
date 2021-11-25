package ibm.comm.Selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException 
    {
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.google.com/");
       Thread.sleep(2000);
       driver.close();
       
    }
}
