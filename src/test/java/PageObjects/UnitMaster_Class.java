package PageObjects;


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

	@FindBy(xpath = "//input[@placeholder='Enter Age']")
	WebElement Age_Field;

	@FindBy(xpath = "//span[text()='Select Religion']")
	WebElement Religion_Field;

	@FindBy(xpath = "//span[text()='Select Cast']")
	WebElement Cast_Field;

	@FindBy(xpath = "//span[text()='Select Language']")
	WebElement Language_Field;

	@FindBy(xpath = "//span[text()='Select Family Type']")
	WebElement FamilyType_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Qualification']")
	WebElement Qualification_Field;

	@FindBy(xpath = "//span[text()='Select Marital Status']")
	WebElement MaritalStatus_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Contact Number']")
	WebElement ContactNumber_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Occupation']")
	WebElement Occupation_Field;

	@FindBy(xpath = "//span[text()='Select Disability']")
	WebElement Disability_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Nominee Name']")
	WebElement NomineeName_Field;

	@FindBy(xpath = "//textarea[@placeholder='Enter Address']")
	WebElement Address_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Bank Name']")
	WebElement BankName_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Account Number']")
	WebElement BankAccountNo_Field;

	@FindBy(xpath = "//input[@placeholder='Enter IFSC Code']")
	WebElement IFSCCode_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Branch Name']")
	WebElement BranchName_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Rent Amount']")
	WebElement RentAmount_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Rent Recipient']")
	WebElement PaysRentto_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Document Code']")
	WebElement OtherDoc_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Household Services']")
	WebElement HouseholdServices_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement CompanyDetails_Field;

	@FindBy(xpath = "//span[@aria-haspopup='listbox']")
	WebElement DocumentType_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Reference No']")
	WebElement ReferenceNo_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Remark']")
	WebElement Remark_Field;

	@FindBy(xpath = "//input[@type='file']")
	WebElement fileupload;

	@FindBy(xpath = "//button[text()='Browse files']")
	WebElement BrowseFileButton;
//	
//	@FindBy(xpath = "")
//	WebElement ;
//	
//	@FindBy(xpath = "")
//	WebElement ;
//	
//	@FindBy(xpath = "")
//	WebElement ;
//	
//	@FindBy(xpath = "")
//	WebElement ;

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

	public void EnterAge() throws IOException {
		Age_Field.sendKeys(UtilityClass.read("Age"));
	}

	public void SelectReligion() throws IOException {
		SelectDropdownOption(Religion_Field, UtilityClass.read("Religion"));
	}

	public void SelectCast() throws IOException {
		SelectDropdownOption(Cast_Field, UtilityClass.read("Cast"));
	}

	public void SelectLanguage() throws IOException {
		SelectDropdownOption(Language_Field, UtilityClass.read("Language"));
	}

	public void SelectFamilyType() throws IOException {
		SelectDropdownOption(FamilyType_Field, UtilityClass.read("FamilyType"));
	}

	public void EnterQualification() throws IOException {
		Qualification_Field.sendKeys(UtilityClass.read("Qualification"));
	}

	public void SelectMaritalStatus() throws IOException {
		SelectDropdownOption(MaritalStatus_Field, UtilityClass.read("MaritalStatus"));
	}

	public void EnterContactNo() throws IOException {
		ContactNumber_Field.sendKeys(UtilityClass.read("ContactNo"));
	}

	public void EnterOccupation() throws IOException {
		Occupation_Field.sendKeys(UtilityClass.read("Occupation"));
	}

	public void SelectDisability() throws IOException {
		SelectDropdownOption(Disability_Field, UtilityClass.read("Disability"));
	}

	public void EnterNomineeName() throws IOException {
		NomineeName_Field.sendKeys(UtilityClass.read("NomineeName"));
	}

	public void EnterAddress() throws IOException {
		Address_Field.sendKeys(UtilityClass.read("Address"));
	}

	public void EnterBankName() throws IOException {
		BankName_Field.sendKeys(UtilityClass.read("BankName"));
	}

	public void EnterBankAccountNo() throws IOException {
		BankAccountNo_Field.sendKeys(UtilityClass.read("BankAccountNo"));
	}

	public void EnterIFSCCode() throws IOException {
		IFSCCode_Field.sendKeys(UtilityClass.read("IFSCCode"));
	}

	public void EnterBranchName() throws IOException {
		BranchName_Field.sendKeys(UtilityClass.read("BranchName"));
	}

	public void EnterRentAmount() throws IOException {
		RentAmount_Field.sendKeys(UtilityClass.read("RentAmount"));
	}

	public void EnterPaysRentto() throws IOException {
		PaysRentto_Field.sendKeys(UtilityClass.read("PaysRentto"));
	}

	public void EnterOtherDoc() throws IOException {
		OtherDoc_Field.sendKeys(UtilityClass.read("OtherDoc"));
	}

	public void EnterHouseholdServices() throws IOException {
		HouseholdServices_Field.sendKeys(UtilityClass.read("HouseholdServices"));
	}

	public void EnterCompanyDetails() throws IOException {
		CompanyDetails_Field.sendKeys(UtilityClass.read("CompanyDetails"));
	}

	public void SelectDocumentType() throws IOException {
		SelectDropdownOption(DocumentType_Field, UtilityClass.read("DocumentType"));
	}

	public void EnterReferenceNo() throws IOException {
		ReferenceNo_Field.sendKeys(UtilityClass.read("ReferenceNo"));
	}

	public void EnterRemark() throws IOException {
		Remark_Field.sendKeys(UtilityClass.read("Remark"));
	}

	public void SelectDocument() throws IOException, InterruptedException {
		BrowseFileButton.click();
		Thread.sleep(1000);
		fileupload.sendKeys(UtilityClass.read("Browsefile"));
	}

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[1]")
	WebElement FamilySize_Field;

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[2]")
	WebElement NoofAdults_Field;

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[3]")
	WebElement NoofChildrenbelow14_Field;

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[4]")
	WebElement NoofChildrenbetween15To20_Field;

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[5]")
	WebElement NoofWorkingPersons_Field;

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[6]")
	WebElement TotalIncomeofFamily_Field;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement Name_Field;

	@FindBy(xpath = "//span[@aria-label='Select Gender']")
	WebElement Gender_Dropdown;

	@FindBy(xpath = "//span[@aria-label='Select Relation']")
	WebElement Relation_Dropdown;

	@FindBy(xpath = "//input[@placeholder='Enter Age']")
	WebElement Member_Age_Field;

	@FindBy(xpath = "(//input[@placeholder='Enter Number'])[7]")
	WebElement MonthlyIncome_Field;

	@FindBy(xpath = "//span[@aria-label='Select Marital Status']")
	WebElement MaritalStatus_Dropdown;

	public void EnterFamilySize() throws IOException {
		FamilySize_Field.sendKeys(UtilityClass.read("FamilySize"));
	}

	public void EnterNoOfAdults() throws IOException {
		NoofAdults_Field.sendKeys(UtilityClass.read("NoofAdults"));
	}

	public void EnterNoofChildrenBelow14() throws IOException {
		NoofChildrenbelow14_Field.sendKeys(UtilityClass.read("NoofChildren(below14)"));
	}

	public void EnterNoofChildrenBetween15To20() throws IOException {
		NoofChildrenbetween15To20_Field.sendKeys(UtilityClass.read("NoofChildren(15-20)"));
	}

	public void EnterNoofWorkingPersons() throws IOException {
		NoofWorkingPersons_Field.sendKeys(UtilityClass.read("NoofWorkingPersons"));
	}

	public void EnterTotalIncomeofFamily() throws IOException {
		TotalIncomeofFamily_Field.sendKeys(UtilityClass.read("TotalIncomeofFamily"));
	}

	public void EnterName() throws IOException {
		Name_Field.sendKeys(UtilityClass.read("MemberName"));
	}

	public void SelectGender() throws IOException {
		Gender_Dropdown.sendKeys(UtilityClass.read("MemberGender"));
	}

	public void SelectRelation() throws IOException {
		Relation_Dropdown.sendKeys(UtilityClass.read("MemberRelation"));
	}

	public void EnterMemberAge() throws IOException {
		Age_Field.sendKeys(UtilityClass.read("MemberAge"));
	}

	public void SelectMemberMaritalStatus() throws IOException {
		MaritalStatus_Dropdown.sendKeys(UtilityClass.read("MemberMaritalStatus"));
	}

	public void EnterMonthlyIncome() throws IOException {
		MonthlyIncome_Field.sendKeys(UtilityClass.read("MemberMonthlyIncome"));
	}

}
