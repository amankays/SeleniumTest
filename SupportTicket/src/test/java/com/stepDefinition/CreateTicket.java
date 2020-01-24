package com.stepDefinition;


import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverInstance;

import PageObjects.CreateTicketPage;
import PageObjects.LoginPage;
import PageObjects.MainDashboard;
import PageObjects.SupportTicket;
import io.cucumber.datatable.DataTable;
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
	
	String department;
	String title;
	String desc ;
	String fileName;
	String CcHeading = "Assign Contact";
	 String date1;
	
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
		
//		loaderVisibilityWait();
		loaderInvisibilityWait();
	
	}
	
	@When("user clicks on New Ticket")
	public void user_clicks_on_New_Ticket() {
	    
		supportTicketPage = new SupportTicket(driver);
		supportTicketPage.click_new_ticket();
	  
		loaderVisibilityWait();
	    loaderInvisibilityWait();    
	}

	@When("user enters below given data")
	public void user_enters_below_given_data(DataTable ticketData) throws InterruptedException {
		

		Thread.sleep(5000);
		List<List<String>> dataList = ticketData.asLists();
		
		for(List<String> row: dataList) {
			
//			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//			System.out.println(dateFormat.format(new Date()));
			
			Date date = new Date();
			String currentDate = (date.toString().trim());
			
//			String currentDate = dateFormat.format(new Date());
	
			
			department = row.get(0);
			title = row.get(1) + "_" + currentDate;
			desc = row.get(2);
		}
		

		
		//Add department.
		wait.until(ExpectedConditions.numberOfElementsToBe(By.id("ddlSupportDepartment"), 1));
		Select depart = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSupportDepartment"))));
		depart.selectByVisibleText(department);
		
		//Add title for the ticket.
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Title"))).sendKeys(title);
		
		//Add description for the ticket.
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtDescription"))).sendKeys(desc);
	    
	}

	@When("click on create")
	public void click_on_create() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("CreateTicket"))).click();
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
//		
//	}
	
	@When("user assign a contact")
	public void user_clicks_on_assign_contact() throws InterruptedException {
		
	   //Click on assign contact button.
		createTicket = new CreateTicketPage(driver);
		createTicket.assign_contact();
		loaderInvisibilityWait();
	}

//	@When("select a user given below")
//	public void select_a_user_given_below(DataTable contactUser) throws InterruptedException {
//	    
//		List<String> contactInfo = contactUser.asList();
//		Thread.sleep(3000);
//		
//		//Search user to select as a contact
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\"FullName\"]"))).sendKeys(contactInfo.get(0));
//		Thread.sleep(2000);
//		
//		//Check checkbox to select user as contact.
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class=\"bs-checkbox \"]//input[@type='radio']"))).click();
//		
//		//Click on add button to add contact.
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("AddSupportContact"))).click();
//		
//		loaderInvisibilityWait();
//	}
	
	@When("user clicks on Cc Add new button")
	public void user_clicks_on_Cc_Add_new_button() throws InterruptedException {
		
	    wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("aViewCCContacts"), 2));
	    
	    Thread.sleep(3000);
	    //click on add new button to add Cc contact.
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("aViewCCContacts"))).click();
	    
	}

	@Then("Add Cc Pop-up opens")
	public void add_Cc_Pop_up_opens(){
		
	   String panelHeading = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"panel-heading\" and .//span[contains(text(),'Add Cc')]]"))).getText();
	   if(panelHeading.equals(CcHeading)) {
		   System.out.println("Add Cc Pop-Up appears");
	   }else {
		   System.out.println("Unable to Open Add Cc Pop-Up");
	   }
	}

	@When("user navigate to email tab")
	public void user_navigate_to_email_tab() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement emailTab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@id='liCCEmail']")));
	    
		int x2 = emailTab.getLocation().getX();
		int y2 = emailTab.getLocation().getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" +x2 +", " +y2 +")");
		
//		ac.moveToElement(el);
		emailTab.click();

		System.out.println("Email tab in Add Cc clicked");
	}

	@When("enter below givem emails")
	public void enter_below_givem_emails(DataTable CcContact) throws InterruptedException {
	   
		List<String> CcEmail = CcContact.asList();
		
		System.out.println("Added email is: " +CcEmail.get(0));
		String CcEmails = CcEmail.get(0);
		
//		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("txtCCContactEmail"), 3));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txtCCContactEmail']"))).sendKeys(CcEmail.get(0));
		
//		((JavascriptExecutor) driver).executeScript("document.getElementById('txtCCContactEmail').style.display='block';");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("CCContactEmail"))).click();
	
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("CCContactEmail"))).clear();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='multiple_emails-input text-left']"))).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='multiple_emails-container']"))).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='multiple_emails-input text-left']"))).sendKeys(CcEmails);
		
		
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tabCCEmail']//div[@class='col-md-8']"))).sendKeys(CcEmails);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("CCContactEmail"))).sendKeys(CcEmails);
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("AddSupportContact"), 2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("AddSupportContact"))).click();
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("AddSupportContact"))).click();
		
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
		
	String contactInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblContactInformation']//tr//td[2]"))).getText();
	System.out.println("Replaced contact is: " +contactInfo);
	}
	
	@When("user clicks on new attachment button")
	public void user_clicks_on_new_attachment_button() throws InterruptedException {
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("aNewAttachment"), 2));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("aNewAttachment"))).click();
	}

	@When("select a file given below")
	public void select_a_file_given_below(DataTable file) {
		
	List<String> attachmentFile = file.asList();
	  
	  //send file name
	  wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("txtFileName"), 2));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtFileName"))).sendKeys(attachmentFile.get(1));
	  fileName = attachmentFile.get(1);
	  
	  //File Attachment
	  WebElement uploadElement =   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileAttachment")));
	  
	  String workingDirectory = System.getProperty("user.dir");
	  String filePath = workingDirectory + "\\images\\" + attachmentFile.get(0);
	  
	  System.out.println("Working Directory is: " +workingDirectory);
	  System.out.println("File path is: " +filePath);
	  
	  uploadElement.sendKeys(filePath);
	  
	  //Click on save to upload file
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("aUploadedFile"))).click();
	  loaderVisibilityWait();
	  loaderInvisibilityWait();
	 
	}

	@Then("file got selected as an attachment")
	public void file_got_selected_as_an_attachment() {
	   
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.id("tblAttachment"), 2));
		String attachmentName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblAttachment']//tr/td[2]"))).getText();
		System.out.println("Attachment name is: "+attachmentName);
		if(attachmentName.equals(fileName)) {
			System.out.println("Attachement uploaded successfully");
		}
		else {
			System.out.println("---------------------Attachment upload Unsuccessful, Try again!!!!----------------");
		}
	}

	
	@Then("Ticket Id created successfully")
	public void ticket_Id_created_successfully() {
	   
		String ticketId = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='panel custom-panel']//div//h3[contains(text(),'Ticket')]"))).getText();
		System.out.println("Created ticket Id is: " +ticketId);
	}

	@When("user clicks on LogOut")
	public void user_clicks_on_LogOut() {
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href=\"#\" and .//span[contains(text(),'Rajesh')]]"))).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='dropdown' and .//span[contains(text(),'Rajesh')]]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout']"))).click();
		loaderInvisibilityWait();
		
		
	}
}
