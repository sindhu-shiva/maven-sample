package com.qa.weq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class reportlogin {
	
 WebDriver driver;
	@Test
	@Parameters({"url", "username", "password"})
	
	public void login(String u, String un ,String pwd){
	
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromeDriver.exe");
     driver= new ChromeDriver();
 	driver.get("u");
 	driver.findElement(By.xpath("//input[@name='ctl00$PagePlaceHolder$LoginControl$UserName']")).sendKeys("un");
 	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 	driver.findElement(By.id("ctl00_PagePlaceHolder_LoginControl_Password")).sendKeys("password");
}
}
}