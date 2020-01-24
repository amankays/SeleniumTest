package PageObjects;

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
	WebElement departmentTextField;
	
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
//	-----------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(id="aViewCCContacts")
	WebElement addCc;
	
	@FindBy(id="aNewAttachment")
	WebElement addAttachment;
	
	public void enter_department(String department) {
		departmentTextField.sendKeys(department);
	}
	
	public void enter_title(String title) {
		titleTextField.sendKeys(title);
	}
	
	public void enter_description(String description) {
		descriptionTextField.sendKeys(description);
	}
	
	public void select_location(String location) {
		Select loc = new Select(locationDropDown);
		loc.selectByVisibleText(location);
	}
	
	public void assign_contact() throws InterruptedException {
		
		assignContact.click();
		
		String contactName = reader.getCellData("CreateTicket", 4, 2);
		Thread.sleep(2000);
		contactNameSearch.sendKeys(contactName);
		Thread.sleep(2000);
		contactCheckbox.click();
		Thread.sleep(2000);
		addContactButton.click();
		
		
		
	}
	
	public void add_cc(String ccUser) {
		addCc.click();
	}
}
