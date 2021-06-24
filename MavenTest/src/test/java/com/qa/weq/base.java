package com.qa.weq;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver  driver;
	
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52101780\\Downloads\\chromedriver_win32\\chromeDriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 
	}
	
	public static void failed(String MethodName) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination= new File(("C:\\Users\\52101780\\eclipse-workspace\\MavenTest\\screenshot\\" +MethodName+".png"));
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
