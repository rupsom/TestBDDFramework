package com.test.stepdefinitions;

import java.util.List;

import com.test.base.TestBase;
import com.test.util.Utilities;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTableWorkStepDefinitions extends TestBase{

	public DataTableWorkStepDefinitions() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Before
	public void setup() {
		initialization();
		etest = ereports.createTest("DATA TABLE TESTING");
		etest.info("BROWSER OPENED");
	}
	
	@Given("^Home Page Opening$")
	public void home_Page_Opening() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    etest.info("WE ARE IN HOME PAGE");
	}

	@When("^Title of page is showing$")
	public void title_of_page_is_showing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		etest.info("HOME PAGE Title - "+driver.getTitle());
	    Assert.assertEquals("Google1", driver.getTitle());
	}

	@Then("^Provide the search text$")
	public void provide_the_search_text(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc) 
	    List<List<String>> listarg = arg1.raw();
	    Utilities.typing(or.getProperty("searchbox"), listarg.get(0).get(0));
	    Thread.sleep(Utilities.THREADSLEEP);
	}

	@Then("^Google Search button click$")
	public void google_Search_button_click() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Utilities.click(or.getProperty("serachbtn"));
	    etest.info("Google Search button clicked");
	}
	
	@After
	public void close() {
		driver.quit();
	    ereports.flush();
	}
}
