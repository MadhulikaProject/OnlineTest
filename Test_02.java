package Testfreecrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_02 extends LoginLogout {
	  @Test
	 public void test01() throws InterruptedException {
	//Test home and Calender Create new Event

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement home	= driver.findElement(By.xpath("//div[@class='ui left fixed vertical  icon menu sidebar-dark left-to-right']"));
		 
		 
		 Actions a11 = new Actions(driver);
		 a11.moveToElement(home).perform();
		 Thread.sleep(1000);
	     driver.findElement(By.linkText("Home")).click();
	     driver.findElement(By.linkText("Calendar")).click();
	     driver.findElement(By.linkText("Contacts")).click();
	     driver.findElement(By.linkText("Companies")).click();
	     driver.findElement(By.linkText("Deals")).click();
	     driver.findElement(By.linkText("Tasks")).click();
	     driver.findElement(By.linkText("Cases")).click();
	     driver.findElement(By.linkText("Calls")).click();
	     driver.findElement(By.linkText("Documents")).click();
	     driver.findElement(By.linkText("Email")).click();
	     driver.findElement(By.linkText("Campaigns")).click();
	
}
}
