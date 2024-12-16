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

	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", element);
	}

	@FindBy(xpath = "//span[text()='Unit/Hut']")
	WebElement UnitTab;

	@FindBy(xpath = "//span[text()=' New Unit ']")
	WebElement NewUnit_button;

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

	public void clickOnUnitTab() {
		UnitTab.click();
	}

	public void ClickOnNewUnitButton() {
		NewUnit_button.click();
	}

	public void Select_Pocket() throws IOException {
		String pocket = UtilityClass.read("");
		Pocket_Name_Field.click();
		List<WebElement> pocketnames = driver.findElements(By.xpath(""));
		for (WebElement pocketname : pocketnames) {
			if (pocketname.getText().equalsIgnoreCase(pocket))
				;
			pocketname.click();
			return;
		}
	}

	public void Select_Society() throws IOException {
		String Society = UtilityClass.read("");
		Select_Society_Field.click();
		List<WebElement> societynames = driver.findElements(By.xpath(""));
		for (WebElement societyname : societynames) {
			if (societyname.getText().equalsIgnoreCase(Society))
				;
			societyname.click();
			return;
		}
	}

	public void Unit_No() throws IOException {
		Enter_Unit_No_Field.sendKeys(UtilityClass.read(""));
	}

	public void Ident_Number() throws IOException {
		Ident_Number_Field.sendKeys(UtilityClass.read(""));
	}

	public void Owner_Name() throws IOException {
		Owner_Name_Field.sendKeys(UtilityClass.read(""));
	}

	public void select_UsageType() throws IOException {
		String Usage_Type = UtilityClass.read("");
		Usage_Type_Dropdown.click();

		List<WebElement> UsageTypes = driver.findElements(By.xpath(""));
		for (WebElement UsageType : UsageTypes) {
			if (UsageType.getText().equalsIgnoreCase(Usage_Type)) {
				UsageType.click();
				return;
			}
		}
	}

	public void Select_Occupancy_Status() throws IOException {
		String Occupancy_Status = UtilityClass.read("");
		Occupancy_Status_Dropdown.click();
		List<WebElement> allstatus = driver.findElements(By.xpath(""));
		for (WebElement status : allstatus) {
			if (status.getText().equalsIgnoreCase(Occupancy_Status)) {
				status.click();
			}

		}
	}

	public void Select_Residence() throws IOException {
		String resedence_type = UtilityClass.read("");
		Residence_Dropdown.click();
		List<WebElement> types = driver.findElements(By.xpath(""));
		for (WebElement type : types) {
			if (type.getText().equalsIgnoreCase(resedence_type)) {
				type.click();
				return;
			}
		}
	}

	public void Select_Structure_Details() throws IOException {
		String structure_Details = UtilityClass.read("");
		Structure_Details.click();
		List<WebElement> structurs = driver.findElements(By.xpath(""));
		for (WebElement structur : structurs) {
			if (structur.getText().equalsIgnoreCase(structure_Details)) {
				structur.click();
				return;
			}
		}
	}

	public void Enter_Area() throws IOException {
		Area_in_Sq_ft.sendKeys(UtilityClass.read(""));
	}

	public void Select_Facing_Types() throws IOException {
		String Facing_Types = UtilityClass.read("");
		Facing_Types_Dropdown.click();

		List<WebElement> facings = driver.findElements(By.xpath(""));
		for (WebElement facing : facings) {
			if (facing.getText().equalsIgnoreCase(Facing_Types)) {
				facing.click();
				return;
			}
		}
	}

	public void Select_Unit_Type() throws IOException {
		String Unit_Type = UtilityClass.read("");
		Unit_Type_Dropdown.click();

		List<WebElement> Units = driver.findElements(By.xpath(""));
		for (WebElement Unit : Units) {
			if (Unit.getText().equalsIgnoreCase(Unit_Type)) {
				Unit.click();
				return;
			}
		}
	}

	public void Enter_censedNameFirst() throws IOException {
		censedNameFirst.sendKeys(UtilityClass.read(""));
	}

	public void Enter_censedNameMiddle() throws IOException {
		censedNameMiddle.sendKeys(UtilityClass.read(""));
	}

	public void Enter_censedNameLast() throws IOException {
		censedNameLast.sendKeys(UtilityClass.read(""));
	}

	public void Enter_occupierFirstName() throws IOException {
		occupierFirstName.sendKeys(UtilityClass.read(""));
	}

	public void Enter_occupierMiddleName() throws IOException {
		occupierMiddleName.sendKeys(UtilityClass.read(""));
	}

	public void Enter_occupierLastName() throws IOException {
		occupierLastName.sendKeys(UtilityClass.read(""));
	}

	public void Enter_originalSocietyName() throws IOException {
		originalSocietyName.sendKeys(UtilityClass.read(""));
	}

	public void Enter_originalSurveyNo() throws IOException {
		originalSurveyNo.sendKeys(UtilityClass.read(""));
	}

	public void Select_Status() throws IOException {
		Status_Dropdown.sendKeys(UtilityClass.read(""));
	}

	public void ClickOnNext_button() throws IOException {
		Next_button.click();
	}
}
