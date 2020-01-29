package PageObjects;

import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.Xls_Reader;

public class CreateTicketPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\aman.k\\git\\SeleniumTestLocal\\SupportTicket\\ExcelData\\sample.xlsx");
	
	public CreateTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id="ddlSupportDepartment")
	WebElement departmentDropDown;
	
	@FindBy(id="txtTitle")
	WebElement titleTextField;
	
	@FindBy(id="txtDescription")
	WebElement descriptionTextField;
	
	@FindBy(id="ddlSupportCompany")
	WebElement companyDropDown;
	
	@FindBy(id="ddlLocation")
	WebElement locationDropDown;
	
//	--------------------------------------------------------------------------------------------------------------------------
	@FindBy(id="aViewContacts")
	WebElement assignContact;
	
	@FindBy(xpath="//input[@id=\"FullName\"]")
	WebElement contactNameSearch;
	
	@FindBy(xpath="//td[@class=\"bs-checkbox \"]//input[@type='radio']")
	WebElement contactCheckbox;
	
	@FindBy(id="AddSupportContact")
	WebElement addContactButton;
	
	@FindBy(xpath="//table[@id='tblContactInformation']//tr//td[2]")
	WebElement assignedContact;
//	-----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(id="aViewCCContacts")
	WebElement addCc;
	
	@FindBy(xpath="//li[@id='liCCEmail']")
	WebElement CcEmailTab;
	
	@FindBy(xpath="//input[@class='multiple_emails-input text-left']")
	WebElement ccEmailTextField;
	
	@FindBy(id="AddSupportContact")
	WebElement addCcButton;
	
//  ------------------------------------------------------------------------------------------------------------------------------	
	@FindBy(id="aNewAttachment")
	WebElement addAttachment;
	
	@FindBy(id="txtFileName")
	WebElement attachmentTextFileName;
	
	@FindBy(id="fileAttachment")
	WebElement uploadFile;
	
	@FindBy(id="aUploadedFile")
	WebElement uploadButton;
	
	@FindBy(xpath="//table[@id='tblAttachment']//tr/td[2]")
	WebElement attachedFile;
	
//	------------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(id="CreateTicket")
	WebElement createButton;
	
	public void enter_department() {
		Select dept = new Select(departmentDropDown);
		String department = reader.getCellData("CreateTicket", 0, 2);
		dept.selectByVisibleText(department);
	}
	
	public void enter_Title() {
	
		Date date = new Date();
		String currentDate = (date.toString().trim());
		
		String title = reader.getCellData("CreateTicket", 1, 2);
		title = title + "_" + currentDate;
		titleTextField.sendKeys(title);
	}
	
	public void enter_Description() {
		String description = reader.getCellData("CreateTicket", 3, 2);
		descriptionTextField.sendKeys(description);
	}
	
	public void select_company() {
		Select company = new Select(companyDropDown);
		 String comp = reader.getCellData("CreateTicket", 2, 2);
		 company.selectByVisibleText(comp);
	}
	
	public void select_location() {
		Select ldropdown = new Select(locationDropDown);
		ldropdown.selectByVisibleText(reader.getCellData("CreateTicket", 8, 2));
	}
	
	public void click_assign_contact() {
		
		assignContact.click();
	}
	
	public void click_add_Cc() {
		addCc.click();
	}
	
	public void click_add_attachment() {
		addAttachment.click();
	}
	
	public void click_create_button() {
		createButton.click();
	}
	
	public void navigate_email_tab() throws InterruptedException {
		
		Thread.sleep(2000);
		int x2 = CcEmailTab.getLocation().getX();
		int y2 = CcEmailTab.getLocation().getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" +x2 +", " +y2 +")");
		
		CcEmailTab.click();
	}
	
	public void add_cc_email() throws InterruptedException {
		Thread.sleep(2000);
		ccEmailTextField.click();
		String ccContact = reader.getCellData("CreateTicket", 5, 2);
		Thread.sleep(2000);
		ccEmailTextField.sendKeys(ccContact);
		addCcButton.click();
		Thread.sleep(2000);
//		addCcButton.click();
	}
	
	public void assign_contact() throws InterruptedException {
		
		click_assign_contact();
		
		String contactName = reader.getCellData("CreateTicket", 4, 2);
		Thread.sleep(2000);
		contactNameSearch.sendKeys(contactName);
		Thread.sleep(2000);
		contactCheckbox.click();
		Thread.sleep(2000);
		addContactButton.click();
		
	}
	
	public void add_attachment() {
		String workingDirectory = System.getProperty("user.dir");
		String filePath = workingDirectory + "\\images\\" + reader.getCellData("CreateTicket", 6, 2);
		
		attachmentTextFileName.sendKeys(reader.getCellData("CreateTicket", 7, 2));
		
		uploadFile.sendKeys(filePath);
		
		uploadButton.click();
	}
	
	public void get_file_name() {
		if(attachedFile != null) {
			System.out.println("File uploaded successfully");
			System.out.println("Attached file is: " + attachedFile.getText());
		}
		else {
			System.out.println("---------------------Attachment upload Unsuccessful, Try again!!!!----------------");
		}
	}
	

	
	
	public void getContactInfo() {
		if(assignedContact != null) {
			System.out.println("Assigned contact is: " +assignedContact.getText());
		}
		else {
			System.out.println("Contact is not assigned");
		}
	}
	
}
