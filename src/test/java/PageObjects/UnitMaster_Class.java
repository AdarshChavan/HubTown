package PageObjects;

import java.beans.Visibility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.UtilityClass;

public class UnitMaster_Class {

	public WebDriver driver;
	public WebDriverWait wait;

	public UnitMaster_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public static void Scroll(WebDriver driver, WebElement element, int pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + arguments[1];", element, pixels);
	}

	public void SelectDropdownOption(WebElement Dropdown, String Value) {
		Dropdown.click();
		DropdownSearchBox.sendKeys(Value);
		DropdownSearchBox.sendKeys(Keys.ARROW_DOWN);
		DropdownSearchBox.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = "//span[text()='Survey']")
	WebElement SurveyTab;

	@FindBy(xpath = "//span[text()='Units']")
	WebElement UnitTab;

	@FindBy(xpath = "//span[text()=' New Unit ']")
	WebElement NewUnit_button;

	@FindBy(xpath = "//li[text()=' Manual ']")
	WebElement ManualUnitOption;

	@FindBy(xpath = "//span[text()='Select Pocket']")
	WebElement Pocket_Name_Field;

	@FindBy(xpath = "//span[text()='Select Society']")
	WebElement Select_Society_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Unit No']")
	WebElement Enter_Unit_No_Field;

	@FindBy(xpath = "//input[@placeholder='Enter No']")
	WebElement Ident_Number_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Owner Name']")
	WebElement Owner_Name_Field;

	@FindBy(xpath = "//span[text()='Select Usage Type']")
	WebElement Usage_Type_Dropdown;

	@FindBy(xpath = "//span[text()='Select Occupancy Status']")
	WebElement Occupancy_Status_Dropdown;

	@FindBy(xpath = "//span[text()='Select Residence']")
	WebElement Residence_Dropdown;

	@FindBy(xpath = "//span[text()='Select Structure']")
	WebElement Structure_Details;

	@FindBy(xpath = "//input[@placeholder='Enter Area']")
	WebElement Area_in_Sq_ft;

	@FindBy(xpath = "//span[text()='Select Facing Type']")
	WebElement Facing_Types_Dropdown;

	@FindBy(xpath = "//span[text()='Select Unit Type']")
	WebElement Unit_Type_Dropdown;

	@FindBy(xpath = "//input[@id='censedNameFirst']")
	WebElement censedNameFirst;

	@FindBy(xpath = "//input[@id='censedNameMiddle']")
	WebElement censedNameMiddle;

	@FindBy(xpath = "//input[@id='censedNameLast']")
	WebElement censedNameLast;

	@FindBy(xpath = "//input[@id='occupierFirstName']")
	WebElement occupierFirstName;

	@FindBy(xpath = "//input[@id='occupierMiddleName']")
	WebElement occupierMiddleName;

	@FindBy(xpath = "//input[@id='occupierLastName']")
	WebElement occupierLastName;

	@FindBy(xpath = "//input[@id='originalSocietyName']")
	WebElement originalSocietyName;

	@FindBy(xpath = "//input[@id='originalSurveyNo']")
	WebElement originalSurveyNo;

	@FindBy(xpath = " //span[text()='Select Status']")
	WebElement Status_Dropdown;

	@FindBy(xpath = " //button[text()='Next']")
	WebElement Next_button;

	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement DropdownSearchBox;

	public void ClickOnSurveyTab() throws InterruptedException {
		Thread.sleep(5000);
		SurveyTab.click();
	}

	public void clickOnUnitTab() {
		UnitTab.click();
	}

	public void ClickOnNewUnitButton() {
		NewUnit_button.click();
	}

	public void ClickManualOption() {
		ManualUnitOption.click();
	}

	public void Select_Pocket() throws IOException {
		SelectDropdownOption(Pocket_Name_Field, UtilityClass.read("pocketName"));
	}

	public void Select_Society() throws IOException {

		SelectDropdownOption(Select_Society_Field, UtilityClass.read("SocietyName"));

	}

	public void Unit_No() throws IOException {
		Enter_Unit_No_Field.sendKeys(UtilityClass.read("UnitNo"));
	}

//	public void Ident_Number() throws IOException {
//		Ident_Number_Field.sendKeys(UtilityClass.read(""));
//	}

	public void Owner_Name() throws IOException {
		Owner_Name_Field.sendKeys(UtilityClass.read("OwnerName"));
	}

	public void Select_UsageType() throws IOException {
		SelectDropdownOption(Usage_Type_Dropdown, UtilityClass.read("UsageType"));
	}

	public void Select_Occupancy_Status() throws IOException {
		SelectDropdownOption(Occupancy_Status_Dropdown, UtilityClass.read("OccupancyStatus"));
	}

	public void Select_Residence() throws IOException {
		SelectDropdownOption(Residence_Dropdown, UtilityClass.read("Residence"));
	}

	public void Select_Structure_Details() throws IOException {
		SelectDropdownOption(Structure_Details, UtilityClass.read("StructureDetails"));
	}

	public void Enter_Area() throws IOException {
		Area_in_Sq_ft.sendKeys(UtilityClass.read("Area"));
	}

	public void Select_Facing_Types() throws IOException {
		WebElement scrollableDiv = driver.findElement(By.xpath("//main[@class='main-content scrollable']"));

		Scroll(driver, scrollableDiv, 100);

		wait.until(ExpectedConditions.visibilityOf(Facing_Types_Dropdown));

		SelectDropdownOption(Facing_Types_Dropdown, UtilityClass.read("FacingTypes"));
	}

//	public void Select_Unit_Type() throws IOException {
//		Unit_Type_Dropdown.click();
//		DropdownSearchBox.sendKeys(UtilityClass.read(""));
//		DropdownSearchBox.sendKeys(Keys.ARROW_DOWN);
//		DropdownSearchBox.sendKeys(Keys.ENTER);
//	}

	public void Enter_censedNameFirst() throws IOException {
		censedNameFirst.sendKeys(UtilityClass.read("CensedNameFirst"));
	}

	public void Enter_censedNameMiddle() throws IOException {
		censedNameMiddle.sendKeys(UtilityClass.read("CensedNameMiddle"));
	}

	public void Enter_censedNameLast() throws IOException {
		censedNameLast.sendKeys(UtilityClass.read("CensedNameLast"));
	}

	public void Enter_occupierFirstName() throws IOException {
		occupierFirstName.sendKeys(UtilityClass.read("OccupierFirstName"));
	}

	public void Enter_occupierMiddleName() throws IOException {
		occupierMiddleName.sendKeys(UtilityClass.read("OccupierMiddleName"));
	}

	public void Enter_occupierLastName() throws IOException {
		occupierLastName.sendKeys(UtilityClass.read("OccupierLastName"));
	}

	public void Enter_originalSocietyName() throws IOException {
		originalSocietyName.sendKeys(UtilityClass.read("OriginalSocietyName"));
	}

	public void Enter_originalSurveyNo() throws IOException {
		originalSurveyNo.sendKeys(UtilityClass.read("OriginalSurveyNo"));
	}

	public void ClickOnNext_button() throws IOException {
		Next_button.click();
	}
}
