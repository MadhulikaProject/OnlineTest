package Testfreecrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_01 extends LoginLogout  {
	  @Test
		
	  public void test01() throws InterruptedException  {
		//Test Title of the page
	     String ActualTitle = driver.getTitle();
		 String ExpectedTitle = "Cogmento CRM";
		 System.out.println("Login title of page is >>>" +ActualTitle);	 
		 Assert.assertEquals(ExpectedTitle, ActualTitle);
		 
		 }
}
