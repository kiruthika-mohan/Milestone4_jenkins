package com.marriott.stepDefinitions;

import com.marriott.ReusableComponent.Methods;
import com.marriott.ReusableComponent.Reusablecomponent;
import com.marriott.UIstore.OurbrandsUI;
import com.marriott.pageObject.Ourbrands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class StepDefinition extends Reusablecomponent{
	private org.apache.logging.log4j.Logger log=LogManager.getLogger(StepDefinition .class.getName());
	
	Ourbrands ob=new Ourbrands();
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Reusablecomponent.initializer();
		 Methods.loadURL(driver);
	}

	@When("^Click on our brands in homepage$")
	public void click_on_our_brands_in_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 ob.OurbrandsNav(driver);
	}

	@When("^Verify if the JWMarriott is listed in the list or not$")
	public void verify_if_the_JWMarriott_is_listed_in_the_list_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ob.JWVerify(driver);
	}

	@Then("^User navigate to another page$")
	public void user_navigate_to_another_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ob.JWClick(driver);
		log.info("Successfully navigated to JW Marriott");
	    
	}
}
