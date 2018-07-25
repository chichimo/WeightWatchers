package com.StepDefinition;

import com.Driver.DriverInfo;
import com.Pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDn extends DriverInfo{
	
	Pages page;
	
	@Given("^I have chrome browser running$")
	public void i_have_chrome_browser_running()  {
	   DriverInfo.Initializer();
	}

	@When("^I go to weigh watchers website$")
	public void i_go_to_weigh_watchers_website()  {
	    driver.get("https://www.weightwatchers.com/us/");
	}

	@Then("^I Verify the title is \"([^\"]*)\"$")
	public void i_Verify_the_title_is(String arg1)  {
		 String act = arg1;
		    String Exp = driver.getTitle();
		    if (act.equals(Exp)) {
		    	System.out.println("Title is Present");
		    }else {
		    	System.out.println("Title not presented");
		    }
	}

	@Then("^I click on Find a Meeting link$")
	public void i_click_on_Find_a_Meeting_link()  {
	    Pages page = new Pages();
	    page.Findmeeting();
	}

	@Then("^In the search field I search for zip code (\\d+)$")
	public void in_the_search_field_I_search_for_zip_code(int arg1)  {
	   Pages page = new Pages();
	   page.Search();
	}

	@Then("^I click on the search button$")
	public void i_click_on_the_search_button()  {
		 Pages page = new Pages();
		 page.Button();
	}

	@Then("^I should print the title of the first result$")
	public void i_should_print_the_title_of_the_first_result()  {
		 Pages page = new Pages();
		 page.ResultTitle();
	}

	@Then("^I click on the link$")
	public void i_click_on_the_link()  {
		 Pages page = new Pages();
		 page.FirstResult();
	}
	
	@Then("^I verify the result title with the previous clicked title$")
	public void i_verify_the_result_title_with_the_previous_clicked_title()  {
		Pages page = new Pages();
		page.Verification();
	}
	
	@Then("^I print today's hours operation time$")
	public void i_print_today_s_hours_operation_time()  {
		Pages page = new Pages();
		page.Operation_time();
	}



}
