package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeRequest_Class {

	public WebDriver driver;

	public ChangeRequest_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// -------------Change Request - Basic Info ----------------------------------

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[1]")
	WebElement PocketName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[2]")
	WebElement SocietyName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[3]")
	WebElement unitNumber_Dropdown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement BasicInfoNextButton;

	// -------------Change Request - Action ----------------------------------

	@FindBy(xpath = "//input[@placeholder='Enter Tenancy Period']")
	WebElement TenancyPeriod;

	@FindBy(xpath = "//input[@placeholder='Enter Monthly Amt.']")
	WebElement MonthlyAmt;

	@FindBy(xpath = "//input[@placeholder='Enter Payment Frequency']")
	WebElement PaymentFreq;

	@FindBy(xpath = "//textarea[@placeholder='Description']")
	WebElement ActionDescription;

	@FindBy(xpath = "//input[@id='contactNo']")
	WebElement ContactNo;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='middleName']")
	WebElement MiddleName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement LastName;

	@FindBy(xpath = "//input[@id='BankAccount']")
	WebElement BankAccountNo;

	@FindBy(xpath = "//input[@id='BankName']")
	WebElement BankName;

	@FindBy(xpath = "//input[@id='BranchName']")
	WebElement BranchName;

	@FindBy(xpath = "//input[@id='ifsc']")
	WebElement IFSCCode;

	@FindBy(xpath = "//span[@aria-label='Select Reason']")
	WebElement Reason;

	@FindBy(xpath = "//span[@aria-label='Select Document Type']")
	WebElement DocumentType;

	@FindBy(xpath = "//textarea[@id='addresss']")
	WebElement Address;

	@FindBy(xpath = "//textarea[@id='remarks']")
	WebElement Description;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement ActionNextButton;

	// ------------- Change Request - Documents ----------------------------------

	@FindBy(xpath = "//button[@label='Send for Approval']")
	WebElement SendForApprovalButton;

	@FindBy(xpath = "//button[@label='Save as draft']")
	WebElement SaveAsDraftButton;

}
