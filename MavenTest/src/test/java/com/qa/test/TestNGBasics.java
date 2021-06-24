package com.qa.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority=2,groups="Title")
	public void googlepage() {
	 String S= driver.getTitle();
	 System.out.println(S);
	// Assert.assertEquals(S,"Google");
	 Assert.assertEquals(S,"Google","Not matched with actual result");
	 
	
	}
	
	@Test
	
	public void logo() {
		boolean b= driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();//*[@id="image"]
		Assert.assertEquals(b, true);
		//Assert.assertTrue(b);
	}
	
	@Test(priority=3,groups="URL")
	public void googlepage1() {
	 String c= driver.getCurrentUrl();
	 System.out.println(c);
	}
	
	@Test(priority=1,groups="Title")
	public void googlegmail() {
		 WebElement c= driver.findElement(By.linkText("Gmail"));
		 System.out.println(c);
		 
		}
	
	@Test(dependsOnMethods="googlegmail")
	public void googleCheck() {
		 WebElement d= driver.findElement(By.linkText("Gmail"));
		 System.out.println(d);
		}
	
	@Test(invocationCount=0)
	public void repeat()
	{
		System.out.println("============TestNg features===============");
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.close();
	}
		
	
	
		
	}
	
	

