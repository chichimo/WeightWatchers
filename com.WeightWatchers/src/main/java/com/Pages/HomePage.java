package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Driver.DriverInfo;

public class HomePage extends DriverInfo {
	
@FindBy(xpath="//a[contains(.,'Find a Meeting ')]") WebElement FindMeeting;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Findmeeting() {
		FindMeeting.click();
	}

}
