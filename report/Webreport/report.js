$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Britto/eclipse-workspace/CucumberLearnOnline/src/test/resources/OrangeDataTableUsingExamples.feature");
formatter.feature({
  "name": "Simple Login feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.scenarioOutline({
  "name": "This your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "proceed to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters the \"\u003cUserName\u003e\" and password \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicked button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin1234"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "This your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "proceed to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeDataTableUsingExamplesSteps.proceed_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the \"Admin\" and password \"admin1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeDataTableUsingExamplesSteps.user_enters_the_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicked button",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeDataTableUsingExamplesSteps.clicked_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "This your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Hooks"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "proceed to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeDataTableUsingExamplesSteps.proceed_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the \"Admin\" and password \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeDataTableUsingExamplesSteps.user_enters_the_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicked button",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeDataTableUsingExamplesSteps.clicked_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});