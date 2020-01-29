#Author: Aman Kumar
Feature: Successfully create a ticket under Supoport -> Ticket page

  Background: 
    Given Browsere is "chrome"

  @CSGLogin
  Scenario: Successful Login with valid credentials
    Given user navigates to CSG Login page
    When user enters username and password
    Then page with title "Dashboard | Cook Command Center" should open

  @redirectSupportTicket
  Scenario: user must be redirected to Support->Ticket page
    When user clicks on Support->Ticket
    Then page with title "Support Ticket Dashboard | Cook Command Center" should open
    
  @verifyassigncontact
	Scenario: Verify that logged in user is added as the contact while  creating the ticket
	When user clicks on New Ticket
  Then page with title "CreateTicket | Cook Command Center" should open
  
  @AssignContact
  Scenario: Verify that Contact area will designate one contact per ticket.
  When user assign a contact
  Then selected user get replaced by previous assigned contact
  
  
 @AddCcContact
	Scenario: Verify that user can add user contacts as Cc
	When user navigate to Cc email tab
	And enter givem emails
	Then added emails will be selected as Cc contact
	
    
  @addAttachment
  Scenario: Verify that user can add attachment
  When user clicks on new attachment button
  And select a given file
  Then file got selected as an attachment
  
  @CreateTicketFillAllmandatoryFields
  Scenario: Verify that when the new ticket is created from the Tickets, page is redirected to the Edit Ticket page with a successful message " Ticket was created successfully"
    When user enters given mandatory data
    Then Ticket Id created successfully
    And page with title "EditTicket | Cook Command Center" should open
     
  
	
	
  @SuccessfullyLogOut
  Scenario: user successfully logout on click of LogOut option.
    When user clicks on LogOut
    Then page with title "Login | Cook Command Center" should open
