package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.UtilityClass;

public class SocietyMaster_Class {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public SocietyMaster_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@FindBy(xpath = "//div//ul//li//a//span[text()='Master']")
	WebElement Master_Tab;
	
	@FindBy(xpath = "//span[text()='Society/Chawl']")
	WebElement society_tab;
	
	@FindBy(xpath = "//span[text()=' New Society ']")
	WebElement New_Society_button;
	
	@FindBy(xpath = "//span[text()='Select Pocket']")
	WebElement Pocket_Name_Dropdown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement Next_button;
	
	@FindBy(xpath = "//div[@class='overflow-y-auto']")
	WebElement Left_Menu;
	
	public void ClickOnTheMasterTab() {
		
		wait.until(ExpectedConditions.visibilityOf(Left_Menu));
		WebElement scrollableContainer = driver.findElement(By.cssSelector(".overflow-y-auto"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 1000;", scrollableContainer);
		
		wait.until(ExpectedConditions.visibilityOf(Master_Tab));
		
		Master_Tab.click();
		
	}
	
	public void clickOntheScietyTab() {
		society_tab.click();
	}
	
	public void ClickOntheNewSocietyButton() throws InterruptedException {
		Thread.sleep(2000);
		New_Society_button.click();
	}
	
	public void SelectPocketName() throws IOException{
		Pocket_Name_Dropdown.click();
		String Pocket_Name = UtilityClass.read("pocketName");
		List<WebElement> pocketnames = driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));
		
		for(WebElement pocketname: pocketnames) {
			if(pocketname.getText().equalsIgnoreCase("Pocket_Name"));
			pocketname.click();
			return;
		}
	}
	
	
	public void ClickOnNextButton() {
		Next_button.click();
	}
	
	
	
	
	
	
	
	
	
}
