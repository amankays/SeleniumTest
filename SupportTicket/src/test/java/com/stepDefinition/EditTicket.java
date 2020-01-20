package com.stepDefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverInstance;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditTicket {
	
	
	WebDriver driver;
	WebDriverWait wait;
	List<String> ticketRecId;
	int ticketTableRows, resourceTableRows;
	String winHandleBefore;
	
	
	static DriverInstance instance;
	{
		instance = DriverInstance.getinstance();
		driver = instance.getDiver();
		wait = instance.getWait();
	}
	
	public WebElement loaderVisibilityWait() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"loader-text\"]")));
	}
	
	public Boolean loaderInvisibilityWait() {
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class=\"loader-text\"]")));
	}
	
	
	@When("user search for below ticket Id")
	public void user_search_for_below_ticket_Id(DataTable data) {
		
		List<String> ticketRecId  = data.asList();
		this.ticketRecId = ticketRecId;
		loaderInvisibilityWait();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='TicketRecId']"))).sendKeys(ticketRecId.get(0));
		
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).build().perform();
		
	}

	@Then("Ticket row will be filtered")
	public void ticket_row_will_be_filtered() throws InterruptedException {
		
		Thread.sleep(3000);
		List<WebElement> ticketTable = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id='tblDashboardTicket']//tbody//tr//td[1]")));
		ticketTableRows = ticketTable.size();
		System.out.println("Rows in table are: " + ticketTableRows);
		if(ticketTableRows == 0) {
			System.out.println("There is no such ticket present in Ticket Dashboard, Try Again !!!!");
		
		}
		else {
			for(int i = 1; i <= ticketTableRows; i++) {
				
				WebElement firstTicketIdColumn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblDashboardTicket']//tbody//tr["+i+"]//td[2]")));
				String ticketId = firstTicketIdColumn.getText();
				String ticketRecId = this.ticketRecId.get(0);
				if(ticketId == ticketRecId) {
					System.out.println("Ticket filtered successfully");	
					break;
				}
				else {
					System.out.println("This ticket Id is not in the table");
				}
			}
		}
		
	 
	}

	@When("user clicks on Ticket ID link")
	public void user_clicks_on_Ticket_ID_link() throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='tblDashboardTicket']//tbody//tr[1]//td[2]//a"))).click();
		System.out.println("Clicked on " +ticketRecId+ " ticket Id link");	
		
		
		
	}
	
	@Then("new window will open with page title {string}")
	public void new_window_will_open_with_page_title(String string) throws InterruptedException {
		

		winHandleBefore = driver.getWindowHandle();
		
	
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(5000);
		String newWindowTitle = driver.getTitle();
		System.out.println("New window title: " +newWindowTitle);
		
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(3000);
		
		if(newWindowTitle.equals(string)) {
			System.out.println("Title of the new window is matched successfully.");
		}
		else {
			System.out.println("Title for new window is not as expected");
		}
	
	   
	}
	
//	@When("user change the department to select.")
//	public void user_change_the_department_to_select() throws InterruptedException {
//		
//		Thread.sleep(3000);
//	   Select dept = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ddlSupportDepartment")))  );
//	   dept.selectByVisibleText("--Select--");
//		
//	}
	
	@When("user change the department to below option.")
	public void user_change_the_department_to_below_option(DataTable data) {
		
		List<String> deptmnt  = data.asList();
		String department = deptmnt.get(0);
		   Select dept = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ddlSupportDepartment")))  );
		   dept.selectByVisibleText(department);
	 
	}

	@When("user change the status to below option.")
	public void user_change_the_status_to_below_option(DataTable data) {
	
		List<String> state  = data.asList();
		String status = state.get(0);
		   Select dept = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ddlStatus")))  );
		   dept.selectByVisibleText(status);
		  
	}
	
	@When("Click on save")
	public void click_on_save() throws InterruptedException {
	   
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='form-group  pull-right']//a[1]"))).click();
		Thread.sleep(2000);
	}

	@Then("Primary resource will be inactive.")
	public void primary_resource_will_be_inactive() {
		
		
		List<WebElement> resourceTable = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id=\"tblResources\"]//tbody//tr//td[6]")));
		resourceTableRows = resourceTable.size();
		System.out.println("Rows in Resource table are: " + resourceTableRows);
		if(resourceTableRows == 0) {
			System.out.println("There is no rows in resource table, Try Again !!!!");
		
		}
		else {
			for(int i = 1; i <= resourceTableRows; i++) {
				
				wait.until(ExpectedConditions.attributeToBe(By.className("RVSBridgeEnabledCheckBox"),"value","true"));
				Boolean flag = wait.until(ExpectedConditions.attributeToBe(By.className("RVSBridgeEnabledCheckBox"),"value","true"));
				if(flag == true) {
					System.out.println("This resource is Active");	
				}
				else {
					
					System.out.println("All resources are Inactive");
				}			
			}
		}
		
	}

	@Then("Board field is also changed.")
	public void board_field_is_also_changed() throws InterruptedException {
		
		Thread.sleep(2000);
		String board = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ddlBoard"))).getText();
	    System.out.println("Board is niw: " +board);
	}
	
	@When("user closes the edit ticket window")
	public void user_closes_the_edit_ticket_window() throws InterruptedException {
		
				Thread.sleep(5000);
		// Close the new window, if that window no more required
				driver.close();
				
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}
				// Switch back to original browser (first window)
//				driver.switchTo().window(winHandleBefore);
	    
	}

}
