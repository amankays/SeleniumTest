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
