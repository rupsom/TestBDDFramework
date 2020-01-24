$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleLinkFind.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.uri("GoogleResultSearchSelect.feature");
formatter.feature({
  "line": 1,
  "name": "Auto result click",
  "description": "",
  "id": "auto-result-click",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search Result clicking",
  "description": "",
  "id": "auto-result-click;search-result-clicking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "start two",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user is in google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of page is showing",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "search a text",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "select the third one",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close two",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Hi \"naveen\" and \"rupam\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.start()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.user_is_in_google_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.title_of_page_is_showing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.search_a_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.select_the_third_one()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleResultSearchSelectStepDefinitions.close()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});