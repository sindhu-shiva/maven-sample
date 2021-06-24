package com.qa.weq;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class CaptureScreenShot extends base{
	
	@BeforeMethod
	public void setup() {
		initialization();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	
	@Test
	public void TitleOfPages()
	{
		 
		 Assert.assertEquals( driver.getTitle(), "gooogle");
		
		
	}
	
	@Test
	public void Logos()
	{
		 
		 Assert.assertEquals( driver.getTitle(), "gooogle");
		
		
	}
	

}
