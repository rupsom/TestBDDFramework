$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataTableWork.feature");
formatter.feature({
  "line": 1,
  "name": "DataTableTest",
  "description": "",
  "id": "datatabletest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13922703500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Browser will open through setup() and close with close()",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Search box will get data through Data Table Concept",
  "description": "",
  "id": "datatabletest;search-box-will-get-data-through-data-table-concept",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@second"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Home Page Opening",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Title of page is showing",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Provide the search text",
  "rows": [
    {
      "cells": [
        "Selenium Tutorial"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Google Search button click",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableWorkStepDefinitions.home_Page_Opening()"
});
formatter.result({
  "duration": 267027100,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWorkStepDefinitions.title_of_page_is_showing()"
});
formatter.result({
  "duration": 29631200,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cGoogle[1]\u003e but was:\u003cGoogle[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.test.stepdefinitions.DataTableWorkStepDefinitions.title_of_page_is_showing(DataTableWorkStepDefinitions.java:40)\r\n\tat ✽.When Title of page is showing(DataTableWork.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DataTableWorkStepDefinitions.provide_the_search_text(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWorkStepDefinitions.google_Search_button_click()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1341979300,
  "status": "passed"
});
formatter.uri("GoogleLinkFind.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11650770200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Google Search for particular data",
  "description": "",
  "id": "google-search;google-search-for-particular-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "start one",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is on Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of Google Page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "type a text search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on Google Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "search list displayed",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "find out where expected search result is displaying",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close one",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.start()"
});
formatter.result({
  "duration": 11372707000,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.user_is_on_Google_page()"
});
formatter.result({
  "duration": 346400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.title_of_Google_Page_is_displayed()"
});
formatter.result({
  "duration": 21985700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.type_a_text_search()"
});
formatter.result({
  "duration": 10380574900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.click_on_Google_Search_button()"
});
formatter.result({
  "duration": 2051561700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.search_list_displayed()"
});
formatter.result({
  "duration": 107879300,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.find_out_where_expected_search_result_is_displaying()"
});
formatter.result({
  "duration": 171645100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleLinkFindStepDefinitions.close()"
});
formatter.result({
  "duration": 11076852200,
  "status": "passed"
});
formatter.after({
  "duration": 219939500,
  "status": "passed"
});
formatter.uri("GoogleResultSearchSelect.feature");
formatter.feature({
  "line": 1,
  "name": "Auto result click",
  "description": "",
  "id": "auto-result-click",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11765410300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search Result clicking",
  "description": "",
  "id": "auto-result-click;search-result-clicking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@second"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "start two",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is in google page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is showing",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search a text",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "select the third one",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close two",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.start()"
});
formatter.result({
  "duration": 11522496500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.user_is_in_google_page()"
});
formatter.result({
  "duration": 369700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.title_of_page_is_showing()"
});
formatter.result({
  "duration": 12772700,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.search_a_text()"
});
formatter.result({
  "duration": 10289328600,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.select_the_third_one()"
});
formatter.result({
  "duration": 334043100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.close()"
});
formatter.result({
  "duration": 11113547000,
  "status": "passed"
});
formatter.after({
  "duration": 300202500,
  "status": "passed"
});
});