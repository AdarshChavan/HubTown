package PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.Month;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public void SelectDropdownOption(WebElement Dropdown, String Value) {
		Dropdown.click();
		DropdownSearchBox.sendKeys(Value);
		DropdownSearchBox.sendKeys(Keys.ARROW_DOWN);
		DropdownSearchBox.sendKeys(Keys.ENTER);
	}

	@FindBy(xpath = "//div//ul//li//a//span[text()='Master']")
	WebElement Master_Tab;

	@FindBy(xpath = "//div//ul//li//a//span[text()='User']")
	WebElement User_Tab;

	@FindBy(xpath = "(//span[text()='Pocket/Area'])[1]")
	WebElement Pocket_Area_Tab;

	@FindBy(xpath = "//span[text()=' New Pocket ']")
	WebElement New_Pocket_Button;

	@FindBy(xpath = "//input[@placeholder='Select Start Date']")
	WebElement StarDateField;

	@FindBy(xpath = "//input[@placeholder='Select End Date']")
	WebElement EndDateField;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement Pocket_Name;

	@FindBy(xpath = "//span[text()='Select Company Name']")
	WebElement Company_Name;

	@FindBy(xpath = "//span[text()='Sq. Feet']")
	WebElement Unit_Area;

	@FindBy(xpath = "//input[@placeholder='Enter Value']")
	WebElement Unit_area_value;

	@FindBy(xpath = "//input[@placeholder='Select Date']")
	WebElement Invoice_cut_off_date;

	@FindBy(xpath = "//span[text()='Select Location']")
	WebElement Location;

	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement Address;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement Next_button;

	@FindBy(xpath = "//div[@class='side-bar-scrollbar']")
	WebElement Left_Menu;

	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement DropdownSearchBox;

	@FindBy(xpath = "//input[@formcontrolname='numOfTemples']")
	WebElement Temples;

	@FindBy(xpath = "//input[@formcontrolname='numOfChurches']")
	WebElement Churches;

	@FindBy(xpath = "//input[@formcontrolname='numOfHospitals']")
	WebElement Hospitals;

	@FindBy(xpath = "//input[@formcontrolname='numOfToilets']")
	WebElement Toilets;

	@FindBy(xpath = "//input[@formcontrolname='numOfFireBrigades']")
	WebElement Brigades;

	@FindBy(xpath = "//input[@formcontrolname='numOfWaterSupplies']")
	WebElement WaterSupplies;

	@FindBy(xpath = "//input[@formcontrolname='numOfMosques']")
	WebElement Mosques;

	@FindBy(xpath = "//input[@formcontrolname='numOfParks']")
	WebElement Parks;

	@FindBy(xpath = "//input[@formcontrolname='numOfSchools']")
	WebElement School;

	@FindBy(xpath = "//input[@formcontrolname='numOfBanks']")
	WebElement Banks;

	@FindBy(xpath = "//input[@formcontrolname='numOfRailwayStations']")
	WebElement RailwayStations;

	@FindBy(xpath = "//input[@formcontrolname='numOfPoliceStations']")
	WebElement PoliceStations;

	@FindBy(xpath = "//input[@formcontrolname='numOfColleges']")
	WebElement Colleges;

	@FindBy(xpath = "//input[@formcontrolname='numOfBusDepots']")
	WebElement BusDepots;

	@FindBy(xpath = "//input[@formcontrolname='numOfMarkets']")
	WebElement Markets;

	@FindBy(xpath = "//input[@formcontrolname='numOfElectricSupplies']")
	WebElement ElectricSupplies;

	@FindBy(xpath = "//span[text()='Select Usage Type']")
	WebElement UsageType;

	@FindBy(xpath = "//span[text()='Select Process Type']")
	WebElement ProcessType;

	@FindBy(xpath = "(//input[@placeholder='Enter Amount'])[1]")
	WebElement FromAmountRange;

	@FindBy(xpath = "(//input[@placeholder='Enter Amount'])[2]")
	WebElement ToAmountRange;

	@FindBy(xpath = "//input[@placeholder='Select Start Date']")
	WebElement StartDate;

	@FindBy(xpath = "//input[@placeholder='Select End Date']")
	WebElement EndDate;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	WebElement Description;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save;

	@FindBy(xpath = "//span[text()='Save Progress']")
	WebElement SaveProgress;
	

	public void ClickOnMasterTab() throws IOException, InterruptedException {
		Thread.sleep(2000);
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss(); // or alert.accept();
		} catch (NoAlertPresentException e) {
			// No alert present, move on
		}

		wait.until(ExpectedConditions.visibilityOf(Left_Menu));

		try {
			WebElement scrollableContainer = driver
					.findElement(By.xpath("(//div[@class='flex flex-column ng-star-inserted'])[2]"));

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 1000;", scrollableContainer);

			wait.until(ExpectedConditions.elementToBeClickable(Master_Tab));

			Master_Tab.click();
		} catch (NotFoundException e) {
			logger.error("Element not found", e);
		} catch (Exception e) {
			logger.error("Failed to click Master Tab", e);
		}
	}

	public void ClickOnPocketTab() {

		Pocket_Area_Tab.click();
	}

	public void clickOnNewPocketButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(New_Pocket_Button));
		New_Pocket_Button.click();
	}

	public void EnterPocketName() throws IOException {
		Pocket_Name.sendKeys(UtilityClass.read("pocketName"));
	}

	public void selectComanyName() throws IOException {		
		SelectDropdownOption(Company_Name,UtilityClass.read("CompanyName"));
	}

	public void selectAreaType() throws IOException, InterruptedException {
		String areaType = UtilityClass.read("Areatype");

		if (areaType.equalsIgnoreCase("Square Meters")) {
			Unit_Area.click();
			Unit_Area.sendKeys(Keys.ARROW_DOWN);
			Unit_Area.sendKeys(Keys.ENTER);
		}

	}

	public void EnterUnit_area_value() throws IOException {
		Unit_area_value.sendKeys(UtilityClass.read("Areavalue"));
	}

	public void Enter_Location() throws IOException {
		SelectDropdownOption(Location,UtilityClass.read("Location"));
	}

	public void Enter_Address() throws IOException {
		Address.sendKeys(UtilityClass.read("Address"));
	}

	public void ClickOnNextButton() {
		Next_button.click();
	}

	public String[] getMonthYear(String monthyear) {
		return monthyear.split(" ");
	}

	public void SelectDate(WebElement dateField, String day, String month, String year) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		dateField.click();
		Thread.sleep(1000);

		while (true) {

			WebElement header = driver.findElement(By.xpath("//div[contains(@class, 'p-datepicker-header')]"));
			String headerText = header.getText();
			String[] current = getMonthYear(headerText);

			if (current[0].equalsIgnoreCase(month) && current[1].equalsIgnoreCase(year))
				break;

			int currentMonth = Month.valueOf(current[0].toUpperCase()).getValue();
			int targetMonth = Month.valueOf(month.toUpperCase()).getValue();
			int currentYearNum = Integer.parseInt(current[1]);
			int targetYearNum = Integer.parseInt(year);

			String navBtn = (targetYearNum < currentYearNum
					|| (targetYearNum == currentYearNum && targetMonth < currentMonth)) ? "Previous Month"
							: "Next Month";

			driver.findElement(By.xpath("//button[@aria-label='" + navBtn + "']")).click();

			wait.until(ExpectedConditions.not(ExpectedConditions
					.textToBe(By.xpath("//div[contains(@class, 'p-datepicker-header')]"), headerText)));
		}

		String xpath = "//div[@aria-label='Choose Date']//table//tbody//tr//td[not(contains(@class,'p-disabled'))]//span[text()='"
				+ day + "']";
		WebElement dayElement = driver.findElement(By.xpath(xpath));
		dayElement.click();
	}

	public void selectStartDate() throws IOException, InterruptedException {
		SelectDate(StarDateField, UtilityClass.read("StartDateDay"), UtilityClass.read("StartDateMonth"),
				UtilityClass.read("StartDateYear"));
	}

	public void Invoice_cut_off_date() throws IOException, InterruptedException {
		SelectDate(Invoice_cut_off_date, UtilityClass.read("InvoicecutoffDateDay"),
				UtilityClass.read("InvoicecutoffDateMonth"), UtilityClass.read("InvoicecutoffDateYear"));
	}

	public void SelectEndDAte() throws IOException, InterruptedException {
		SelectDate(EndDateField, UtilityClass.read("EndDateDay"), UtilityClass.read("EndDateMonth"),
				UtilityClass.read("EndDateYear"));
	}

	public void EnterNoofTemples() throws IOException {
		Temples.sendKeys(UtilityClass.read("Temples"));
	}

	public void EnterNoofChurches() throws IOException {
		Churches.sendKeys(UtilityClass.read("Churches"));
	}

	public void EnterNoofHospitals() throws IOException {
		Hospitals.sendKeys(UtilityClass.read("Hospitals"));
	}

	public void EnterNoofToilets() throws IOException {
		Toilets.sendKeys(UtilityClass.read("Toilets"));
	}

	public void EnterFireBrigade() throws IOException {
		Brigades.sendKeys(UtilityClass.read("FireBrigade"));
	}

	public void EnterWaterSupply() throws IOException {
		WaterSupplies.sendKeys(UtilityClass.read("WaterSupply"));
	}

	public void EnterNoofmosques() throws IOException {
		Mosques.sendKeys(UtilityClass.read("mosques"));
	}

	public void EnterNoofParks() throws IOException {
		Parks.sendKeys(UtilityClass.read("Parks"));
	}

	public void EnterNoofSchool() throws IOException {
		School.sendKeys(UtilityClass.read("School"));
	}

	public void EnterNoofbank() throws IOException {
		Banks.sendKeys(UtilityClass.read("bank"));
	}

	public void EnterRailwaystation() throws IOException {
		RailwayStations.sendKeys(UtilityClass.read("Railwaystation"));
	}

	public void EnterPolicestation() throws IOException {
		PoliceStations.sendKeys(UtilityClass.read("Policestation"));
	}

	public void EnterNoofcollege() throws IOException {
		Colleges.sendKeys(UtilityClass.read("college"));
	}

	public void EnterBusDepot() throws IOException {
		BusDepots.sendKeys(UtilityClass.read("BusDepot"));
	}

	public void EnterNoofmarket() throws IOException {
		Markets.sendKeys(UtilityClass.read("market"));
	}

	public void EnterElectricitySupply() throws IOException {
		ElectricSupplies.sendKeys(UtilityClass.read("ElectricitySupply"));
	}

	public void SelectUsageType() throws IOException {
		SelectDropdownOption(UsageType, UtilityClass.read("UsageType"));
	}

	public void SelectProcessType() throws IOException {
		SelectDropdownOption(ProcessType, UtilityClass.read("ProcessType"));
	}

	public void EnterFromAmountRange() throws IOException {
		FromAmountRange.sendKeys(UtilityClass.read("FromAmountRange"));
	}

	public void EnterToAmountRange() throws IOException {
		ToAmountRange.sendKeys(UtilityClass.read("ToAmountRange"));
	}

	public void SelectRange1StartDate() throws InterruptedException, IOException {
		SelectDate(StartDate, UtilityClass.read("Range1StartDateDay"),
				UtilityClass.read("Range1StartDateMonth"), 
				UtilityClass.read("Range1StartDateYear"));
	}

	public void SelectRange1EndDate() throws InterruptedException, IOException {
		SelectDate(EndDate, UtilityClass.read("Range1EndDateDay"),
				UtilityClass.read("Range1EndDateMonth"), 
				UtilityClass.read("Range1EndDateYear"));
	}

	public void ClickOnTheSaveButton() {
		Save.click();
		SaveProgress.click();
	}
}
