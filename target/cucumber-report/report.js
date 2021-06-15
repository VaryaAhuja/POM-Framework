$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Valid Login feature",
  "description": "",
  "id": "valid-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Valid Login",
  "description": "",
  "id": "valid-login-feature;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Application should be launched with \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters valid userid and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should be navigated to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should see the logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.application_should_be_launched_with_url()"
});
formatter.result({
  "duration": 7425369189,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_enters_valid_useerid_and_password()"
});
formatter.result({
  "duration": 8500935,
  "error_message": "java.lang.NullPointerException\r\n\tat com.vtiger.StepDefinations.LoginStepDefinations.user_enters_valid_useerid_and_password(LoginStepDefinations.java:24)\r\n\tat ✽.When user enters valid userid and password(login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinations.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinations.user_should_be_navigated_to_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinations.user_should_see_the_logout_link()"
});
formatter.result({
  "status": "skipped"
});
});