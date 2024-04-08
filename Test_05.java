package Testfreecrm;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_05 extends LoginLogout {
		   @Test
			public void test5() throws InterruptedException, IOException
			{
			   //Test screenshot of events
				 
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				WebElement home	= driver.findElement(By.xpath("//div[@class='ui left fixed vertical  icon menu sidebar-dark left-to-right']"));
				Actions a11 = new Actions(driver);
				 a11.moveToElement(home).perform();
				 Thread.sleep(1000);
			     driver.findElement(By.linkText("Home")).click();
			     driver.findElement(By.linkText("Calendar")).click();
			
				 
			  
			    driver.findElement(By.xpath("//button[@class='ui mini basic icon button'][1]")).click();
			     driver.navigate().refresh();   
			     Thread.sleep(1000);
			      driver.findElement(By.name("title")).sendKeys("Task");
				 
			     
				
			     
			     driver.findElement(By.xpath("//button[@class='ui mini basic icon button'][1]")).click();
			     driver.navigate().refresh();   
			     Thread.sleep(1000);
				 driver.findElement(By.name("title")).sendKeys("Task");
				 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();

				 TakesScreenshot ts = driver;
				 File source = ts.getScreenshotAs(OutputType.FILE);
				 File destination = new File("C:\\Users\\madhu\\eclipse-workspace\\onlinemarket\\Screenshort" +Math.random()+".png");
				 FileUtils.copyFile(source, destination);
			}
}