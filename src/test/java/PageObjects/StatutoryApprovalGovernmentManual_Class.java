package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatutoryApprovalGovernmentManual_Class {

	public WebDriver driver;

	public StatutoryApprovalGovernmentManual_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Statutory Approval']")
	WebElement Statutory_Approval_Tab;

	@FindBy(xpath = "//span[text()=' New ']")
	WebElement CreateNew_StatutoryApproval_button;

	@FindBy(xpath = "//li[text()=' Manual ']")
	WebElement Manual_Statutory_Approval;

	@FindBy(xpath = "//span[text()='government form']")
	WebElement government_form;

	@FindBy(xpath = "//span[text()='Sec 33/38']")
	WebElement Sec_33_38;

	@FindBy(xpath = "//span[text()='Internal']")
	WebElement Internal;

	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement Confirm_button;

	// -------------Government Annexure - Basic Info ----------------------------------

	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[1]")
	WebElement PocketName_Dropdown;

	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[2]")
	WebElement SocietyName_Dropdown;

	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[3]")
	WebElement unitNumber_Dropdown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement NextButton;
	
	// -------------Government Annexure - Approvals ----------------------------------
	
	@FindBy(xpath = "//input[@placeholder='Enter Sr. no.']")
	WebElement BasicInfoAnnex_no;
	
	@FindBy(xpath = "//input[@placeholder='Enter Authority Name']")
	WebElement Authority_Name;
	
	@FindBy(xpath = "//input[@placeholder='Enter Issued By Whom']")
	WebElement Issued_By_Whom;
	
	@FindBy(xpath = "//input[@placeholder='Enter Reference No.']")
	WebElement IssuedByReferenceNo;
	
	@FindBy(xpath = "//input[@placeholder='Select Reference Date']")
	WebElement IssuedByReferenceDate;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement ApprovalsNextButton;
	
	// -------------Government Annexure - Annex ----------------------------------
	
	@FindBy(xpath = "//input[@formcontrolname='annexCurrentoccupierFirstName']")
	WebElement CurrentOccupier_FirstName;
	
	@FindBy(xpath = "//input[@formcontrolname='annexCurrentoccupierMiddleName']")
	WebElement CurrentOccupier_MiddleName;
	
	@FindBy(xpath = "//input[@formcontrolname='annexCurrentoccupierLastName']")
	WebElement CurrentOccupier_LastName;
	
	@FindBy(xpath = "//input[@formcontrolname='cencusPresentoccupierFirstName']")
	WebElement presentOccupier_FirstName;
	
	@FindBy(xpath = "//input[@formcontrolname='cencusPresentoccupierMiddleName']")
	WebElement presentOccupier_MiddleName;
	
	@FindBy(xpath = "//input[@formcontrolname='cencusPresentoccupierLastName']")
	WebElement presentOccupier_LastName;
	
	@FindBy(xpath = "//input[@formcontrolname='cencusedFirstName']")
	WebElement Census_FirstName;
	
	@FindBy(xpath = "//input[@formcontrolname='cencusedMiddleName']")
	WebElement Census_MiddleName;
	
	@FindBy(xpath = "//input[@formcontrolname='cencusedLastName']")
	WebElement Census_LastName;
	
	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[5]")
	WebElement ResidenceSince;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Area'])[2]")
	WebElement AreainSqft;
	
	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[6]")
	WebElement UsageType;
	
	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[7]")
	WebElement OccupancyStatus;
	
	@FindBy(xpath = "(//span[@class='p-element p-dropdown-label p-inputtext ng-star-inserted'])[8]")
	WebElement Structuredetails;
	
	@FindBy(xpath = "//input[@placeholder='Enter Ep No.']")
	WebElement EpNO;
	
	@FindBy(xpath = "//input[@placeholder='Enter Photo Pass Type']")
	WebElement PhotoPassType;
	
	@FindBy(xpath = "//input[@placeholder='Enter Photo Pass No.']")
	WebElement PhotoPassNo;
	
	@FindBy(xpath = "//input[@placeholder='Enter Structure No.']")
	WebElement Structureno;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement AnnexNextButton;
	
	// -------------Government Annexure - Additional Info ----------------------------------
	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;
//	
//	@FindBy(xpath = "")
//	WebElement Annex_no;

	
}
