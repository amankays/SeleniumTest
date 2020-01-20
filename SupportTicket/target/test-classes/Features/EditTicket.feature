#Author: Aman Kumar
Feature: Successfully do changes in edit ticket page.

  Background: 
    Given Browsere is "chrome"

  @CSGLogin
  Scenario: Successful Login with valid credentials
    Given user navigates to CSG Login page
    When user enters username and password given below
      | rajesh.s | Kays@csg126 |
    Then page with title "Dashboard | Cook Command Center" should open

  @redirectSupportTicket
  Scenario: user must be redirected to Support->Ticket page
    When user clicks on Support->Ticket
    Then page with title "Support Ticket Dashboard | Cook Command Center" should open
    
 @searchParticularTicket
 Scenario: user search for particular ticket and filter the desired ticket.
 When user search for below ticket Id
 | 11111 |
 Then Ticket row will be filtered
 
 @newEditTicketWindowHandle
 Scenario: A new page will be opened on click of Ticket Id link, title of page will be verified.
 When user clicks on Ticket ID link
 Then new window will open with page title "EditTicket | Cook Command Center"
 
 @boardDepenedentOnDepartment
 Scenario: In edit ticket page when user change the department, board will also changed.
 When user change the department to below option.
 | Engineering |
 Then Board field is also changed.
 
  @closeTicketstatusInactiveprimaryuser
 Scenario: Primary and non primary resources are marked to be "inactive" if the status of the ticket is set to closed.
 When user change the status to below option.
 | Closed |
 And Click on save
 Then Primary resource will be inactive.
 
 
 @CloseNewEditTicketWindow
 Scenario: Close the edit ticket window and switch to dashboard window.
 When user closes the edit ticket window
 Then page with title "Support Ticket Dashboard | Cook Command Center" should open
 

 
 @SuccessfullyLogOut
  Scenario: user successfully logout on click of LogOut option.
  When user clicks on LogOut
  Then page with title "Login | Cook Command Center" should open
 


