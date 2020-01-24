package com.test.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.base.TestBase;
import com.test.util.Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleResultSearchSelectStepDefinitions extends TestBase{

	public GoogleResultSearchSelectStepDefinitions() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@When("^start two$")
	public void start() {
		initialization();
		etest = ereports.createTest("Google Result Search Select TESTING START");
		etest.info("GRSS - Google Result Search Select - BROWSER OPENED");
	}
	
	@Given("^user is in google page$")
	public void user_is_in_google_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		etest.info("GRSS - GOOGLERESULTSEARCHSELECT");
	}

	@When("^title of page is showing$")
	public void title_of_page_is_showing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals("Google", driver.getTitle());
	}

	@Then("^search a text$")
	public void search_a_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utilities.typing(or.getProperty("searchbox"), prop.getProperty("searchText"));
		Thread.sleep(Utilities.THREADSLEEP);
	}

	@Then("^select the third one$")
	public void select_the_third_one() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    List<WebElement> searchresults = driver.findElements(By.xpath(or.getProperty("searchlistlinknumbers")));
	    
	    for(WebElement e: searchresults)
	    	etest.info("GRSS - "+e.getText());
	}
	
	@Then("^close two$")
	public void close() throws InterruptedException {
		driver.quit();
		etest.info("Google Result Search Select - BROWSER CLOSED");
		etest.info("Google Result Search Select TEST FINISH");
		ereports.flush();
		Thread.sleep(Utilities.THREADSLEEP);
	}
}
