$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Scent.feature");
formatter.feature({
  "name": "Validate SCENT-Arts as a User Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to the website and verify descriptions in Areas of Scenting",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Scent.to_launch_the_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of SCENT-ArtsasaUser",
  "keyword": "When "
});
formatter.match({
  "location": "Scent.to_launch_the_url_of_SCENT_ArtsasaUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the About Us button",
  "keyword": "And "
});
formatter.match({
  "location": "Scent.i_click_on_the_About_Us_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll to the Areas of Scenting section",
  "keyword": "And "
});
formatter.match({
  "location": "Scent.i_scroll_to_the_Areas_of_Scenting_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"Hotels\",\"offices\",\"Airport\" Areas",
  "keyword": "And "
});
formatter.match({
  "location": "Scent.i_click_on_the_Areas(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Scent.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});