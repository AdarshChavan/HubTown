package PageObjects;

import java.beans.Visibility;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Util;

import com.github.dockerjava.api.exception.NotFoundException;

import Library.UtilityClass;

public class PocketMaster_Class {

	public WebDriver driver;
	public WebDriverWait wait;
	private static final Logger logger = LogManager.getLogger(PocketMaster_Class.class);

	public PocketMaster_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", element);

	}

	@FindBy(xpath = "//div//ul//li//a//span[text()='Master']")
	WebElement Master_Tab;

	@FindBy(xpath = "//div//ul//li//a//span[text()='User']")
	WebElement User_Tab;

	@FindBy(xpath = "(//span[text()='Pocket/Area'])[1]")
	WebElement Pocket_Area_Tab;

	@FindBy(xpath = "//span[text()=' New Pocket ']")
	WebElement New_Pocket_Button;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement Pocket_Name;

	@FindBy(xpath = "//span[text()='Select Company Name']")
	WebElement Company_Name;

	@FindBy(xpath = "//span[text()='Sq. Feet']")
	WebElement Unit_Area;

	@FindBy(xpath = "//input[@placeholder='Enter Value']")
	WebElement Unit_area_value;

	@FindBy(xpath = "//input[@placeholder='YYYY-MM-DD']")
	WebElement Invoice_cut_off_date;

	@FindBy(xpath = "//span[text()='Select Location']")
	WebElement Location;

	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement Address;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement Next_button;

	@FindBy(xpath = "//div[@class='side-bar-scrollbar']")
	WebElement Left_Menu;

	
	
	public void ClickOnMasterTab() throws IOException {
	    wait.until(ExpectedConditions.visibilityOf(Left_Menu));
	   
	    try {
	        // Locate the scrollable container
	        WebElement scrollableContainer = driver.findElement(By.xpath("(//div[@class='flex flex-column ng-star-inserted'])[2]"));

	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 1000;", scrollableContainer); // Scroll down by 100px

	        wait.until(ExpectedConditions.elementToBeClickable(Master_Tab));

	        // Click the Master Tab
	        Master_Tab.click();
	    } catch (NotFoundException e) {
	        logger.error("Element not found", e);
	    } catch (Exception e) {
	        logger.error("Failed to click Master Tab", e);
	    }
	}


	public void ClickOnPocketTab() {
		
		//Pocket_Area_Tab.click();
	}

	public void clickOnNewPocketButton() throws InterruptedException {
		//wait.until(ExpectedConditions.elementToBeClickable(New_Pocket_Button));
		Thread.sleep(3000);
		New_Pocket_Button.click();
	}

	public void EnterPocketName() throws IOException {
		Pocket_Name.sendKeys(UtilityClass.read("pocketName"));
	}

	public void selectComanyName() throws IOException {
		String companyName = UtilityClass.read("CompanyName");

		Company_Name.click();

		List<WebElement> Options = driver.findElements(By.xpath("//span[@class ='ng-star-inserted']"));

		for (WebElement option : Options) {
			if (option.getText().equalsIgnoreCase(companyName)) {
				option.click();
				return;
			}
		}

	}
	
	public void selectAreaType() throws IOException, InterruptedException {
		String areaType = UtilityClass.read("Areatype");
		Unit_Area.click();
		
		List<WebElement> areatypes = driver.findElements(By.xpath("//ul[@class='p-dropdown-items ng-star-inserted']"));
		for(WebElement areatype: areatypes) {
			if(areatype.getText().equalsIgnoreCase(areaType)) {
				areatype.click();
				return;
			}
			Thread.sleep(1000);
			Unit_area_value.sendKeys(UtilityClass.read("Areavalue"));
		}
	}
	
	
	public void Invoice_cut_off_date() {
		System.out.println("Test");
	}
	
	public void Enter_Location() throws IOException {
		String Userlocation = UtilityClass.read("Location");
		
		List<WebElement> locations = driver.findElements(By.xpath("//div[@class='p-dropdown-items-wrapper']"));
		for(WebElement location: locations) {
			if(location.getText().equalsIgnoreCase(Userlocation));
			location.click();
			return;
				
		}
		
	}
	
	public void Enter_Address() throws IOException {
		Address.sendKeys(UtilityClass.read("Address"));
	}
	
	public void ClickOnNextButton() {
		Next_button.click();
	}
	
	

}
