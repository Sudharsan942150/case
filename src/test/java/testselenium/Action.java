package testselenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	WebDriver driver;
  @Test
  public void f() {

	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\drivers\\chromedriver.exe");
	   	 driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    System.out.println(driver.getTitle());
	    driver.findElement(By .linkText("SignIn")).click();
	    Actions a=new Actions(driver);
	    driver.findElement(By .cssSelector("input#userName")).sendKeys("Lalitha");
	    driver.findElement(By .xpath("//*[@id=\"password\"]")).sendKeys("password123");
	    a.sendKeys(Keys.ENTER).perform();
	    
	    
  }
}
