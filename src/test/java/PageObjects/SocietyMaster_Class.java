package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.exception.NotFoundException;

import Library.UtilityClass;

public class SocietyMaster_Class {

	public WebDriver driver;
	public WebDriverWait wait;
	private static final Logger logger = LogManager.getLogger(PocketMaster_Class.class);

	public SocietyMaster_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//span[text()='Master']")
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

	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement DropdownSearchBox;

	@FindBy(xpath = "//input[@placeholder='Enter Society Name']")
	WebElement SocietyName;

	@FindBy(xpath = "//input[@placeholder='Enter Village']")
	WebElement Village;

	@FindBy(xpath = "//input[@placeholder='Enter Taluka']")
	WebElement Taluka;

	@FindBy(xpath = "//input[@placeholder='Enter Owner Name']")
	WebElement OwnerName;

	@FindBy(xpath = "//input[@placeholder='Enter Units']")
	WebElement NoOfUnits;

	@FindBy(xpath = "//input[@placeholder='Enter Value']")
	WebElement Area;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement DataVerifiedBy;

	@FindBy(xpath = "//textarea[@placeholder='Enter CTS No']")
	WebElement CTSNo;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//span[text()='Save Progress']")
	WebElement SaveProgress;

	public void ClickOnMasterTab() throws IOException, InterruptedException {
		Thread.sleep(2000);
		Master_Tab.click();

	}

	public void clickOntheScietyTab() {
		society_tab.click();
	}

	public void ClickOntheNewSocietyButton() throws InterruptedException {
		Thread.sleep(2000);
		New_Society_button.click();
	}

	public void SelectPocketName() throws IOException {
		Pocket_Name_Dropdown.click();
		DropdownSearchBox.sendKeys(UtilityClass.read("pocketName"));
		DropdownSearchBox.sendKeys(Keys.ARROW_DOWN);
		DropdownSearchBox.sendKeys(Keys.ENTER);
	}

	public void EnterSocietyName() throws IOException {
		SocietyName.sendKeys(UtilityClass.read("SocietyName"));
	}

	public void EnterVillageName() throws IOException {
		Village.sendKeys(UtilityClass.read("Village"));
	}

	public void EnterTalukaName() throws IOException {
		Taluka.sendKeys(UtilityClass.read("Taluka"));
	}

	public void EnterOwnerName() throws IOException {
		OwnerName.sendKeys(UtilityClass.read("OwnerName"));
	}

	public void EnterNoOfUnits() throws IOException {
		NoOfUnits.sendKeys(UtilityClass.read("NoOfUnits"));
	}

	public void EnterArea() throws IOException {
		Area.sendKeys(UtilityClass.read("Area"));
	}

	public void EnterDataVerifiedBy() throws IOException {
		DataVerifiedBy.sendKeys(UtilityClass.read("DataVerifiedBy"));
	}

	public void EnterCTSNo() throws IOException {
		CTSNo.sendKeys(UtilityClass.read("CTSNo"));
	}

	public void ClickOntheSaveButton() {
		SaveButton.click();
		SaveProgress.click();

	}

}
