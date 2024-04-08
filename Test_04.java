package Testfreecrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_04 extends LoginLogout {
		   @Test
			public void test3() throws InterruptedException
			{
			   //Test Save Event 
				 
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
			
				 Actions a12 = new Actions(driver);
				
				 WebElement a2 = driver.findElement(By.xpath("//input[@class='search'][1]"));
				 a2.sendKeys("Add");
				driver.findElement(By.xpath("//div[@class='visible menu transition']")).click();
				driver.findElement(By.name("description")).sendKeys("Testing");
				driver.findElement(By.xpath("//div[@name='category'][1]")).click();

				driver.findElement(By.xpath("//div[@class='visible menu transition']/div[6]")).click();
				 driver.findElement(By.xpath("//div[@class='ui toggle checkbox']")).click();
				 driver.findElement(By.name("location")).sendKeys("Chandigarh");
				 driver.findElement(By.xpath("//div[@name='deal']/input")).sendKeys("pick");
				 driver.findElement(By.xpath("//div[@class='visible menu transition']")).click();
				 driver.findElement(By.xpath("//div[@name='task']/input")).sendKeys("test1");
				 driver.findElement(By.xpath("//div[@class='selected item addition']")).click();
				 driver.findElement(By.xpath("//div[@name='case']/input")).sendKeys("test1");
				 driver.findElement(By.xpath("//div[@class='visible menu transition']")).click();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,350)", "");
				 
				 driver.findElement(By.xpath("//div[@class='ui input'][1]/input[@name='reminder_minutes']")).sendKeys("8");
				 driver.findElement(By.xpath("//div[@class='ui input']//input[@name='identifier']")).sendKeys("testing");
				 driver.findElement(By.xpath("//div[@name='company']/input")).sendKeys("test for life");
				 driver.findElement(By.xpath("//div[@class='visible menu transition']//div[@class='selected item addition']")).click();
				 driver.findElement(By.xpath("//div[@name='participants']//input")).sendKeys("test round");
				 driver.findElement(By.xpath("//div[@class='selected item addition']")).click();
				 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
				 
			   
			}

}
