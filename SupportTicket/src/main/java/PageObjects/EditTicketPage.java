package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.Xls_Reader;

public class EditTicketPage {

	WebDriver driver;
	WebDriverWait wait;
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\aman.k\\git\\SeleniumTestLocal\\SupportTicket\\ExcelData\\sample.xlsx");
	
	public EditTicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[@class='panel custom-panel']//div//h3[contains(text(),'Ticket')]")
	WebElement ticketId;
	
	public String get_ticket_Id() {
		return ticketId.getText();
		
	}
	
}
