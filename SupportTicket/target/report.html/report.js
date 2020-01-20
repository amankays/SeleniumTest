$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CreateTicket.feature");
formatter.feature({
  "name": "Successfully create a ticket under Supoport -\u003e Ticket page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CSGLogin"
    }
  ]
});
formatter.step({
  "name": "user navigates to CSG Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateTicket.user_navigates_to_CSG_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password given below",
  "rows": [
    {
      "cells": [
        "rajesh.s",
        "Kays@csg126"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_enters_username_and_password_given_below(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page with title \"Dashboard | Cook Command Center\" should open",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.page_with_title_should_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user must be redirected to Support-\u003eTicket page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@redirectSupportTicket"
    }
  ]
});
formatter.step({
  "name": "user clicks on Support-\u003eTicket",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_Support_Ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page with title \"Support Ticket Dashboard | Cook Command Center\" should open",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.page_with_title_should_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that logged in user is added as the contact while  creating the ticket",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@verifyassigncontact"
    }
  ]
});
formatter.step({
  "name": "user clicks on New Ticket",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_New_Ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page with title \"CreateTicket | Cook Command Center\" should open",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.page_with_title_should_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that Contact area will designate one contact per ticket.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@changeAssignContact"
    }
  ]
});
formatter.step({
  "name": "user clicks on assign contact",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_assign_contact()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select a user given below",
  "rows": [
    {
      "cells": [
        "rajni sandhu"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.select_a_user_given_below(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selected user get replaced by previous assigned contact",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.selected_user_get_replaced_by_previous_assigned_contact()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can add user contacts as Cc",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddCcContact"
    }
  ]
});
formatter.step({
  "name": "user clicks on Cc Add new button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_Cc_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add Cc Pop-up opens",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.add_Cc_Pop_up_opens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to email tab",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_navigate_to_email_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter below givem emails",
  "rows": [
    {
      "cells": [
        "rajni.s@kaysharbor.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.enter_below_givem_emails(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027KAYS-WS-17\u0027, ip: \u002710.0.0.189\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.16 (93fcc21110c10..., userDataDir: C:\\Users\\aman.k\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:58819}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: cc184785910d68cefe2eba93d4d3aab3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.stepDefinition.CreateTicket.enter_below_givem_emails(CreateTicket.java:279)\r\n\tat ✽.enter below givem emails(file:src/test/resources/Features/CreateTicket.feature:37)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "added emails will be selected as Cc contact",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.added_emails_will_be_selected_as_Cc_contact()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can add attachment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addAttachment"
    }
  ]
});
formatter.step({
  "name": "user clicks on new attachment button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_new_attachment_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select a file given below",
  "rows": [
    {
      "cells": [
        "123.jpg",
        "New image file attached"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.select_a_file_given_below(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "file got selected as an attachment",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.file_got_selected_as_an_attachment()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Browsere is \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateInstance.browsere_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that when the new ticket is created from the Tickets, page is redirected to the Edit Ticket page with a successful message \" Ticket was created successfully\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateTicketFillAllmandatoryFields"
    }
  ]
});
formatter.step({
  "name": "user enters below given data",
  "rows": [
    {
      "cells": [
        "Helpdesk",
        "Title is to test create another ticket with automation.",
        "rajesh.s created this ticket."
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_enters_below_given_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on create",
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.click_on_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ticket Id created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.ticket_Id_created_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for presence of element located by: By.xpath: //div[@class\u003d\u0027panel custom-panel\u0027]//div//h3[contains(text(),\u0027Ticket\u0027)] (tried for 120 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.stepDefinition.CreateTicket.ticket_Id_created_successfully(CreateTicket.java:359)\r\n\tat ✽.Ticket Id created successfully(file:src/test/resources/Features/CreateTicket.feature:54)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027KAYS-WS-17\u0027, ip: \u002710.0.0.189\u0027, os.name: \u0027Windows 8\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.2\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.16 (93fcc21110c10..., userDataDir: C:\\Users\\aman.k\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:58819}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: cc184785910d68cefe2eba93d4d3aab3\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027panel custom-panel\u0027]//div//h3[contains(text(),\u0027Ticket\u0027)]}\r\n\tat sun.reflect.GeneratedConstructorAccessor11.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:182)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:179)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat com.stepDefinition.CreateTicket.ticket_Id_created_successfully(CreateTicket.java:359)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "page with title \"EditTicket | Cook Command Center\" should open",
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.page_with_title_should_open(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
