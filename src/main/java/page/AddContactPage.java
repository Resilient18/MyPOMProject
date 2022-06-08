package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddContactPage extends BasePage {

	WebDriver driver; 
	public void addContactPage(WebDriver driver) { 
		
		this.driver = driver;
		
	}
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add Contact')]" ) WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'account']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'cid']") WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'email']") WebElement EMAIL_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//input[@id = 'phone']") WebElement PHONE_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//input[@id = 'address']") WebElement ADDRESS_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//span[@id = 'select2-country-container']") WebElement COUNTRY_ELEMENT; 
	@FindBy(how = How.XPATH, using = "//button[@id = 'submit']") WebElement SAVE_ELEMENT; 
	
	
	public void validateAddContactPage(String addContact) {
		
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT, addContact, "Wrong Page!!");
		
	}	
	public void insertFullName(String fullName) { 
		
		FULL_NAME_ELEMENT.sendKeys(fullName + randomNumGen(99));
	
	}
	public void selectCompanyName(String company) {
		selectDropDown(COMPANY_NAME_ELEMENT, company);
	
	}
	public void clicksubmit() { 
		SAVE_ELEMENT.click();
	}
}

