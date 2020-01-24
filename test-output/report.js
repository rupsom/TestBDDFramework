$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataTableWork.feature");
formatter.feature({
  "line": 1,
  "name": "DataTableTest",
  "description": "",
  "id": "datatabletest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7075806110,
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
      "name": "@POCTest"
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
  "duration": 142613013,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWorkStepDefinitions.title_of_page_is_showing()"
});
formatter.result({
  "duration": 21582498,
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
  "duration": 1068700555,
  "status": "passed"
});
});