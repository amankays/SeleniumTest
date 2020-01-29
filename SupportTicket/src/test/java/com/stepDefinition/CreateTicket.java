package com.stepDefinition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.driver.DriverInstance;
import PageObjects.CreateTicketPage;
import PageObjects.EditTicketPage;
import PageObjects.LoginPage;
import PageObjects.MainDashboard;
import PageObjects.SupportTicket;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateTicket {
	
	WebDriver driver;
	WebDriverWait wait;
	LoginPage loginPage;
	MainDashboard dashboardPage;
	SupportTicket supportTicketPage;
	CreateTicketPage createTicket;
	EditTicketPage editTicket;
		
	static DriverInstance instance;
	{
		instance = DriverInstance.getinstance();
		driver = instance.getDiver();
		wait = instance.getWait();
	}
	
	
	public WebElement visibilityWait(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void verify_title(String title) {
		 Boolean flag =  wait.until(ExpectedConditions.titleIs(title));
		   if(flag == true) {
			   System.out.println("Title matched successfully");
		   }
		   else {
			   System.out.println("Title doesnt matched, Please try again later.");
		   }
	}
	
	
	public WebElement loaderVisibilityWait() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"loader-text\"]")));
	}
	
	public Boolean loaderInvisibilityWait() {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class=\"loader-text\"]")));
	}
	
	@Given("user navigates to CSG Login page")
	public void user_navigates_to_CSG_Login_page() {
		driver.manage().window().maximize();
		driver.get("https://qa.cooksecuritygroup.com:9116/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password_given_below() {
					   
			   loginPage = new LoginPage(driver);
			   loginPage.fill_login_details();
		    
	}

	@Then("page with title {string} should open")
	public void page_with_title_should_open(String title) {
		
		   loaderInvisibilityWait();
		   verify_title(title);
	    
	}

	@When("user clicks on Support->Ticket")
	public void user_clicks_on_Support_Ticket() throws InterruptedException {
		
		dashboardPage = new MainDashboard(driver);
		
		dashboardPage.click_support();
		Thread.sleep(2000);
		dashboardPage.click_support_ticket();
		
		loaderInvisibilityWait();
	
	}
	
	@When("user clicks on New Ticket")
	public void user_clicks_on_New_Ticket() {
	    
		supportTicketPage = new SupportTicket(driver);
		supportTicketPage.click_new_ticket();
	  
	    loaderInvisibilityWait();    
	}

	@When("user enters given mandatory data")
	public void user_enters_below_given_data() throws InterruptedException {
		
		Thread.sleep(2000);
		createTicket = new CreateTicketPage(driver);
		createTicket.enter_department();
		createTicket.enter_Description();
		createTicket.enter_Title();
		Thread.sleep(2000);
		createTicket.click_create_button();
		
		loaderVisibilityWait();
		loaderInvisibilityWait();
	    
	}

	
//	@Then("Rajesh Sharma is assigned as contact by default")
//	public void rajesh_Sharma_is_assigned_as_contact_by_default() {
//		
//		//Assigned contact
//	    String contactInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblContactInformation']//tr//td[2]"))).getText();
//		System.out.println("Assigned contact is: " +contactInfo);
//		
//		//Match assigned contacts with logged In user.
//		if(contactInfo.equals("Rajesh Sharma")) {
//			System.out.println("Contact Info matches with Logged In user");
//		}
//		else {
//			System.out.println("Contact Info not matching with Logged In user");
//		}
//	}
	
	@When("user assign a contact")
	public void user_clicks_on_assign_contact() throws InterruptedException {
		
		createTicket = new CreateTicketPage(driver);
		createTicket.assign_contact();
		
		loaderInvisibilityWait();
	}
	

	@When("user navigate to Cc email tab")
	public void user_navigate_to_email_tab() throws InterruptedException {
		
		createTicket = new CreateTicketPage(driver);
		createTicket.click_add_Cc();
		createTicket.navigate_email_tab();
		
		
	}

	@When("enter givem emails")
	public void enter_below_givem_emails() throws InterruptedException {
	   
		createTicket = new CreateTicketPage(driver);
		createTicket.add_cc_email();
		
	}

	@Then("added emails will be selected as Cc contact")
	public void added_emails_will_be_selected_as_Cc_contact() {
	     
		List<WebElement> CcContacts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id='tblCCContact']//tr//td[1]")));
		int CcRows = CcContacts.size();
		for(int i=0;i<CcRows;i++) {
			int a=2;
			String CcContact = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblCCContact']//tr//td[2]"))).getText();
			a++;
			System.out.println("Added Cc contacts are: " +CcContact);
		}
	}


	@Then("selected user get replaced by previous assigned contact")
	public void selected_user_get_replaced_by_previous_assigned_contact() {
		
		createTicket = new CreateTicketPage(driver);
		createTicket.getContactInfo();
		
	}
	
	@When("user clicks on new attachment button")
	public void user_clicks_on_new_attachment_button() throws InterruptedException {
		Thread.sleep(3000);

		createTicket = new CreateTicketPage(driver);
		createTicket.click_add_attachment();
	}

	@When("select a given file")
	public void select_a_file_given_below() {
		
		createTicket = new CreateTicketPage(driver);
		createTicket.add_attachment();
	 
	  loaderVisibilityWait();
	  loaderInvisibilityWait();
	 
	}

	@Then("file got selected as an attachment")
	public void file_got_selected_as_an_attachment() {
	   
		createTicket = new CreateTicketPage(driver);
		createTicket.get_file_name();
	}

	
	@Then("Ticket Id created successfully")
	public void ticket_Id_created_successfully() {
	   
		editTicket = new EditTicketPage(driver);
		System.out.println("Created ticket Id is: " +editTicket.get_ticket_Id());
		
	}

	@When("user clicks on LogOut")
	public void user_clicks_on_LogOut() {
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='dropdown' and .//span[contains(text(),'Rajesh')]]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout']"))).click();
		loaderInvisibilityWait();
		
		
	}
}
