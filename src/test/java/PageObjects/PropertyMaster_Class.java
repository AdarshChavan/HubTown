package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyMaster_Class {

	public WebDriver driver;
	public PropertyMaster_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	@FindBy(xpath = "//span[text()='Select Operating Unit']")
	WebElement Operating_Unit;
	
	@FindBy(xpath = "//input[@Placeholder='Enter  Property Name']")
	WebElement Property_Name;
	
	@FindBy(xpath = "//span[text()='Select Region']")
	WebElement Region;
	
	@FindBy(xpath = "//span[text()='Select Property Site']")
	WebElement Property_Site;
	
	@FindBy(xpath = "//span[text()='Select Zone']")
	WebElement Zone;
	
	@FindBy(xpath = "//span[text()='Select District ']")
	WebElement District;
	
	@FindBy(xpath = "//span[text()='Select Plot Type']")
	WebElement Plot_Type;
	
	@FindBy(xpath = "//input[@id='portfolio']")
	WebElement Portfolio;
	
	
}
