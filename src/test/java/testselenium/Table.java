package testselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	WebDriver driver;

@Test
void f()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
    System.out.println(driver.getTitle());
    driver.findElement(By .linkText("Cruises")).click();
    WebElement tab=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
    List<WebElement> tabler=tab.findElements(By .tagName("tr"));
    //System.out.println("---------------->"+tabler.size());
    
     
    for(int i=0;i<tabler.size();i++)
    {
    	
        List<WebElement> tabled=tabler.get(i).findElements(By .tagName("td"));
        //System.out.println("---------------->"+tabled.size());
    	for(int j=0;j<tabled.size();j++)
    	{
    		if(i==4&& j!=1)
    		System.out.print(tabled.get(j).getText()+" ");
    	}
    	System.out.println();
    }
    driver.close();
    
}
}