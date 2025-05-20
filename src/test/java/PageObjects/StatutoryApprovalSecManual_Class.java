package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatutoryApprovalSecManual_Class {

	public WebDriver driver;

	public StatutoryApprovalSecManual_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Statutory Approval']")
	WebElement Statutory_Approval_Tab;

	@FindBy(xpath = "//span[text()=' New ']")
	WebElement CreateNew_StatutoryApproval_button;

	@FindBy(xpath = "//li[text()=' Manual ']")
	WebElement Manual_Statutory_Approval;

	@FindBy(xpath = "//span[text()='Sec 33/38']")
	WebElement Sec_33_38;

	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement Confirm_button;

	// -------------Government Annexure - Basic Info ----------------------------------

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[1]")
	WebElement PocketName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[2]")
	WebElement SocietyName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[3]")
	WebElement unitNumber_Dropdown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement NextButton;

	// -------------GSection 33/38 - Approvals ----------------------------------

	@FindBy(xpath = "//input[@placeholder='Enter Initiated By']")
	WebElement InitiatedBy;

	@FindBy(xpath = "//input[@placeholder='Enter Reason']")
	WebElement Reason;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	WebElement Description;

	@FindBy(xpath = "//input[@formcontrolname='eligibleMonth']")
	WebElement Eligibilitytobeproved;

	@FindBy(xpath = "//button[text()='Previous']")
	WebElement ApprovalsPreviousButton;

	// -------------Section 33/38 - Documents ----------------------------------
	
	@FindBy(xpath = "//button[@label='Send for Approval']")
	WebElement SendForApprovalButton;

	@FindBy(xpath = "//button[@label='Save as draft']")
	WebElement SaveAsDraftButton;

}
