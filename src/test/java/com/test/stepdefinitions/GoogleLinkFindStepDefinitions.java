package com.test.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.test.base.TestBase;
import com.test.util.Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleLinkFindStepDefinitions extends TestBase {

	Utilities util = new Utilities();
	
	public GoogleLinkFindStepDefinitions() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Before
	public void start() {
		initialization();
	}

	@Given("^user is on Google page$")
	public void user_is_on_Google_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Started the Project");
	}

	@When("^title of Google Page is displayed$")
	public void title_of_Google_Page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Google", driver.getTitle());
	}

	@Then("^type a text search$")
	public void type_a_text_search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		util.typing(or.getProperty("searchbox"), prop.getProperty("searchText"));
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
//		driver.findElement(By.xpath(or.getProperty("searchbox"))).sendKeys(Keys.ESCAPE);
		Thread.sleep(Utilities.THREADSLEEP);
	}

	@Then("^click on Google Search button$")
	public void click_on_Google_Search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		util.click(or.getProperty("serachbtn"));
	}

	@When("^search list displayed$")
	public void search_list_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^find out where expected search result is displaying$")
	public void find_out_where_expected_search_result_is_displaying() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@After
	public void close() {
		driver.quit();
	}
}
