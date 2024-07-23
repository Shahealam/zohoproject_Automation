package testcase;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utility.Readxlsdata;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass=Readxlsdata.class,dataProvider="bvtdata")
	public static void LoginTest(String username,String password) throws InterruptedException
	{
		System.out.println("clicked sccessfully");
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText(loc.getProperty("signing_link"))).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys("username");
		
		//public static void LoginTest(String username,String password) 
		//@Test(dataProviderClass=Readxlsdata.class,dataProvider="bvtdata")
		
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("login_next_btn"))).click();
		
		
	}

	
	

}
