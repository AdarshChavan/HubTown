package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatutoryApprovalInternalManual_Class {

	public WebDriver driver;

	public StatutoryApprovalInternalManual_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Statutory Approval']")
	WebElement Statutory_Approval_Tab;

	@FindBy(xpath = "//span[text()=' New ']")
	WebElement CreateNew_StatutoryApproval_button;

	@FindBy(xpath = "//li[text()=' Manual ']")
	WebElement Manual_Statutory_Approval;

	@FindBy(xpath = "//span[text()='Internal']")
	WebElement Internal;

	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement Confirm_button;

	// ------------- Internal - Basic Info -----------------------------------------

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[1]")
	WebElement PocketName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[2]")
	WebElement SocietyName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[3]")
	WebElement unitNumber_Dropdown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement BasicInfoNextButton;

	// ------------- Internal - Approvals -------------------------------------------
	
	@FindBy(xpath = "//span[@aria-haspopup='listbox']")
	WebElement InitiatedBy;

	@FindBy(xpath = "//input[@placeholder='Enter Reason']")
	WebElement Reason;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	WebElement Description;

	@FindBy(xpath = "//input[@formcontrolname='eligibleMonth']")
	WebElement Eligibilitytobeproved;

	@FindBy(xpath = "//button[text()='Previous']")
	WebElement ApprovalsPreviousButton;
	
	@FindBy(xpath = "//button[@label='Send for Approval']")
	WebElement SendForApprovalButton;
	
	@FindBy(xpath = "//button[@label='Save as draft']")
	WebElement SaveasdraftButton;
	
	
	
}
