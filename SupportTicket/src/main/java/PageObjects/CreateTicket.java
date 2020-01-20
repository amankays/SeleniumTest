package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTicket {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CreateTicket(WebDriver driver) {
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
	
	@FindBy(id="aViewContacts")
	WebElement assignContact;
	
	@FindBy(id="aViewCCContacts")
	WebElement addCc;
	
	@FindBy(id="aNewAttachment")
	WebElement addAttachment;
	
	
}
