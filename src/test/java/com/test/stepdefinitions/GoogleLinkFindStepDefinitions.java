package com.test.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

	public GoogleLinkFindStepDefinitions() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@When("^start one$")
	public void start() {
		initialization();
		etest = ereports.createTest("Google Link Find TESTING START");
		etest.info("Google Link Find - BROWSER OPENED");	
	}

	@Given("^user is on Google page$")
	public void user_is_on_Google_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		etest.info("GLL - Started the Project");
	}

	@When("^title of Google Page is displayed$")
	public void title_of_Google_Page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		etest.info("GLL - "+driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
	}

	@Then("^type a text search$")
	public void type_a_text_search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Utilities.typing(or.getProperty("searchbox"), prop.getProperty("searchText"));
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
//		driver.findElement(By.xpath(or.getProperty("searchbox"))).sendKeys(Keys.ESCAPE);
		Thread.sleep(Utilities.THREADSLEEP);
		
		etest.info("GLL - TEXT GIVEN");
	}

	@Then("^click on Google Search button$")
	public void click_on_Google_Search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Utilities.click(or.getProperty("serachbtn"));
		etest.info("GLL - BUTTON CLICKED");
	}

	@When("^search list displayed$")
	public void search_list_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Utilities.isElementsAvailable(or.getProperty("searchlist"));
		etest.info("GLL - SEARCH LIST SHOWED");
	}

	@Then("^find out where expected search result is displaying$")
	public void find_out_where_expected_search_result_is_displaying() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ArrayList<String> searchResultList = new ArrayList<String>();
		
		List<WebElement> searchResultLinks = driver.findElements(By.xpath(or.getProperty("searchlistlink")));
		System.out.println(searchResultLinks.size());
		
		for(WebElement e: searchResultLinks) {
			searchResultList.add(e.getAttribute("href"));
		}
		
		for(int i=0; i<searchResultList.size(); i++) {
			System.out.println(searchResultList.get(i));
			if (searchResultList.get(i).contains("wikipedia"))
				etest.info("GLL - WIKIPEDIA LINK IS LOCATED ON "+(i+1)+"th POSITION");
		}
	}

	@Then("^close one$")
	public void close() throws InterruptedException {
		driver.quit();
		etest.info("Google Link Find - BROWSER CLOSED");
		etest.info("Google Link Find TEST FINISH");
		ereports.flush();
		Thread.sleep(Utilities.THREADSLEEP);
	}
}
