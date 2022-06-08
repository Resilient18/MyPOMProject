package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
public class DashboardPage {

	WebDriver driver; 
	
	public void Dashboard(WebDriver driver) { 
		this.driver = driver; 
		
		
		
	}
	
	//Element List
	
	@FindBy(how = How.XPATH, using ="//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@class ='sidebar-collapse' ]/descendant::a[6]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy (how = How.XPATH, using = " //a[contains(text(), 'Add Customer')]")WebElement ADD_CUSTOMER_ELEMENT;
	
	
	public void validateDashboardPage(String dashboard) { 
		
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard", "WrongPage!!");
	}
	
	public void clickCustomerMenu() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void addCustomer() { 
		ADD_CUSTOMER_ELEMENT.click();
	}
	
}
