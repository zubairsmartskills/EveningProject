$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile/amazon.feature");
formatter.feature({
  "name": "To validate search function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To user launch edge browser and pass valid url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_user_launch_edge_browser_and_pass_valid_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate search function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "name": "To user enter valid product name",
  "rows": [
    {
      "cells": [
        "samsung",
        "iphone",
        "moto"
      ]
    },
    {
      "cells": [
        "samsung23",
        "iphone 15",
        "moto 40"
      ]
    },
    {
      "cells": [
        "samsung 24",
        "iphone 16",
        "moto 50"
      ]
    },
    {
      "cells": [
        "samsung 25",
        "iphone 17",
        "moto 60"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Loginpage.toUserEnterValidProductName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user Click search  button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpage.toUserClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user quit edge browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toUserQuitEdgeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featurefile/chrome.feature");
formatter.feature({
  "name": "To invalidate Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fb"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fb"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To user launch browser and pass url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toUserLaunchBrowserAndPassUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter invalid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toUserEnterInvalidUsernameAndInvalidPassword()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: To check\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.step.StepDefinition.toUserEnterInvalidUsernameAndInvalidPassword(StepDefinition.java:42)\r\n\tat ✽.To user enter invalid username and invalid password(file:src/test/resources/featurefile/chrome.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To user Click login  button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toUserClickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});