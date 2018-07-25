package com.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInfo {
	public static WebDriver driver;
	
	
	
	public static void Initializer() {
		
		

		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

}
