package Testfreecrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_06 {
	static ChromeDriver driver;
	
	 @BeforeMethod
	 public void Test06() 
	 {
		  driver = new ChromeDriver(); //launch driver
			
			driver.get("https://freecrm.com/");
	 }
	 
	  @Test
	  public void test01() throws InterruptedException
	  {
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//div[@class='rd-navbar-nav-wrap toggle-original-elements']/ul/li[2]")).click();
		  driver.findElement(By.xpath("//div[@class='rd-navbar-nav-wrap toggle-original-elements']/ul/li[5]")).click();
		  driver.findElement(By.xpath("//div[@class='rd-navbar-nav-wrap toggle-original-elements']/ul/li[8]")).click();
		  driver.findElement(By.xpath("//div[@class='rd-navbar-nav-wrap toggle-original-elements']/ul/li[6]")).click();
		}
	  
	  

	 
@AfterMethod
			 public void close() 
			 {
					
       driver.quit();
			}

}
