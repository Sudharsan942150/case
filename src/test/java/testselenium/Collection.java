package testselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Collection {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\drivers\\chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    System.out.println(driver.getTitle());
	    //System.out.println("--------------------->"+driver.findElements(By .tagName("a")));
	    List<WebElement> link_coll=driver.findElements(By .tagName("a"));
	    for(int i=0;i<link_coll.size()-1;i++)
	    {
	    	String str=link_coll.get(i).getText();
	    	if(str.equalsIgnoreCase("Signin"))
	    	{
	    		System.out.println("--------------------->"+link_coll.size());
	    		link_coll.get(i).click();
	    		break;
	    	}
	    }
	    driver.close();
	    
	    
	    
  }
}
