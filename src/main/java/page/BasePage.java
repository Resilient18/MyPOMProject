package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	
	WebDriver driver; 
	
	public void selectDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	
	}
	
	public int randomNumGen(int bound) {
		Random rnd = new Random();
		int RandomNo = rnd.nextInt(bound);
		return RandomNo;
	}

}
