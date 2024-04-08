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

public class LoginLogout {
	static ChromeDriver driver;
	
	 @BeforeMethod
	 public void launch() throws InterruptedException
	 {
		  driver = new ChromeDriver(); //launch driver
			
			driver.get("https://freecrm.com/");
			Thread.sleep(1000);
			  driver.manage().window().maximize();
			  driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
			  driver.findElement(By.name("email")).sendKeys("madhulikamalik21@gmail.com");
			  driver.findElement(By.name("password")).sendKeys("Test@123");
			  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			  Thread.sleep(2000);		
	 }
	 
	 
@AfterMethod
			 public void close() 
			 {
					
	  driver.findElement(By.xpath("//div[@class='ui basic button floating item dropdown']")).click();
	  driver.findElement(By.xpath("//div[@class='menu transition visible']//a[9]")).click();
			
			driver.quit();	
			 }

}
