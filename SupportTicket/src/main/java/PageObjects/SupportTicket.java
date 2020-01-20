package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SupportTicket {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public SupportTicket(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	@FindBy(xpath="//a[contains(text(),'New Ticket')]")
	WebElement newTicket;
	
	public void click_new_ticket() {
		newTicket.click();
		
	}

}
