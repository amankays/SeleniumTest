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
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_enters_username_and_password_given_below()"
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
      "name": "@AssignContact"
    }
  ]
});
formatter.step({
  "name": "user assign a contact",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_assign_contact()"
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
  "name": "user navigate to Cc email tab",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_navigate_to_email_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter givem emails",
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.enter_below_givem_emails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "added emails will be selected as Cc contact",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTicket.added_emails_will_be_selected_as_Cc_contact()"
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
  "name": "select a given file",
  "keyword": "And "
});
formatter.match({
  "location": "CreateTicket.select_a_file_given_below()"
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
  "name": "user enters given mandatory data",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_enters_below_given_data()"
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
  "status": "passed"
});
formatter.step({
  "name": "page with title \"EditTicket | Cook Command Center\" should open",
  "keyword": "And "
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
  "name": "user successfully logout on click of LogOut option.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SuccessfullyLogOut"
    }
  ]
});
formatter.step({
  "name": "user clicks on LogOut",
  "keyword": "When "
});
formatter.match({
  "location": "CreateTicket.user_clicks_on_LogOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page with title \"Login | Cook Command Center\" should open",
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
});