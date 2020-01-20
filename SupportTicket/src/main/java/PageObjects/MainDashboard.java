package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainDashboard {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public MainDashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//Page elements
	@FindBy(xpath="//a[@class=\"accordion-toggle\"]//span[contains(text(),'Support')]")
	WebElement support;
	
	@FindBy(xpath="//a[@href=\"/Support/Dashboard/Dashboard\"]")
	WebElement supportDashboard;
	
	@FindBy(xpath="//a[@href=\"/Support/Dashboard/TicketDashboard\"]")
	WebElement supportTicket;
	
	
	//Methods to handle page elements
	public void click_support() throws InterruptedException {
		
		int x = support.getLocation().getX();
		int y = support.getLocation().getY();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" +x +", " +y +")");
		
		Thread.sleep(2000);
		
		support.click();
	}
	
	public void click_support_dashboard() throws InterruptedException {
		
		int x = supportDashboard.getLocation().getX();
		int y = supportDashboard.getLocation().getY();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" +x +", " +y +")");
		
		Thread.sleep(2000);
		
		supportDashboard.click();
	}
	
	public void click_support_ticket() {
		
		int x = supportTicket.getLocation().getX();
		int y = supportTicket.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x +", "+y +")");
		
		supportTicket.click();
	}
	
	
	public void pageVerify(String title) {
		
		title = driver.getTitle();
		
		if(title.equals("Login | Cook Command Center")) 
			System.out.println("Page title is correct");
		}

}
