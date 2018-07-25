package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Driver.DriverInfo;

public class Pages extends DriverInfo {
	
	

	@FindBy(xpath="//a[contains(.,'Find a Meeting ')]") WebElement FindMeeting;
	@FindBy(xpath="//input[@id='meetingSearch']") WebElement meetingsearch;
	@FindBy(xpath="//button[@type='button']") WebElement searchbutton;
	@FindBy(xpath="//*[@id=\"ml-1180510\"]/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span") WebElement rltTitle;
	@FindBy(xpath="//*[@id=\"ml-1180510\"]/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]") WebElement distance;
	@FindBy(xpath="//span[contains(.,'WEIGHT WATCHERS STORE 23RD ST-5TH AVE')]") WebElement fstResult;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div/div[1]/div/span") WebElement Verify;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/ui-view/ui-view/div[1]/div/div/div[2]/div[1]/div/div/schedule-detailed/div/div[4]/div[2]/div[1]/div[1]") WebElement Optime;
	

	
	
	public Pages() {
		PageFactory.initElements(driver, this);
	}
	
	public void Findmeeting() {
		FindMeeting.click();
	}
	
	public void Search() {
		meetingsearch.sendKeys("10011");
	}
	
	public void Button () {
		searchbutton.click();
	}
	
	public void ResultTitle() {
		System.out.println(rltTitle.getText() + rltTitle.getAttribute("class"));
		System.out.println(distance.getText()+ distance.getAttribute("class"));
	}
	
	
	
	public void FirstResult() {
		fstResult.click();
	}
	
	public void Verification() {
//		if (rltTitle.equals(Verify)) {
//			System.out.println("The name Matches");
//		}else {
//			System.out.println("The name doesn't match");
//		}
		System.out.println(Verify.getText() + Verify.getAttribute("class"));
		
	}
	
	public void Operation_time() {
		System.out.println(Optime.getText()+Optime.getAttribute("class"));
	}
}
