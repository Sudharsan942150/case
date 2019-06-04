package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng1 {
	WebDriver driver;

@Test
void f()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    System.out.println(driver.getTitle());
    // Using by cssSelector and xpath
    driver.findElement(By .linkText("SignIn")).click();
    driver.findElement(By .cssSelector("input#userName")).sendKeys("Lalitha");
    driver.findElement(By .xpath("//*[@id=\"password\"]")).sendKeys("password123");
    driver.findElement(By .name("Login")).click();
    
    
    
    /* using by find element
    driver.findElement(By .linkText("SignIn")).click();
    driver.findElement(By .name("userName")).sendKeys("Lalitha");
    driver.findElement(By .name("password")).sendKeys("password123");
    driver.findElement(By .name("Login")).click();
    String str=driver.findElement(By .linkText("OrderDetails")).getText();
    System.out.println(str);
    if(str.equals("OrderDetails")) {
    	System.out.println("Sign in success");
    }
    else
    {
    	System.out.println("Sign in not success");
    	
    }
    driver.findElement(By .linkText("OrderDetails")).click();
    driver.findElement(By .linkText("Home")).click();*/
    
  driver.close();
 
   }
@Test
public void shri() {
	  System.out.println("------------------------------->Shri");
}
}