package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfAgreement_Class {
	
	public WebDriver driver;
	public ListOfAgreement_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// -------------List Of Agreement "RENT" - Basic Info ----------------------------------
	
	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[1]")
	WebElement PocketName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[2]")
	WebElement SocietyName_Dropdown;

	@FindBy(xpath = "(//span[@aria-haspopup='listbox'])[3]")
	WebElement unitNumber_Dropdown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement BasicInfoNextButton;
	
	// -------------List Of Agreement "RENT" - Agreement Type ----------------------------------
	
	@FindBy(xpath="//span[@aria-haspopup='listbox']")
	WebElement AgreementType;
	
	@FindBy(xpath="//input[@placeholder='Enter Tenancy Period']")
	WebElement TenancyPeriod;
	
	@FindBy(xpath="//input[@placeholder='Enter Monthly Amt.']")
	WebElement MonthlyAmt;
	
	@FindBy(xpath="//input[@placeholder='Enter Payment Frequency']")
	WebElement PaymentFreq;
	
	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[2]")
	WebElement Property;
	
	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[3]")
	WebElement Building;
	
	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[4]")
	WebElement Floor;
	
	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[5]")
	WebElement Flatno;
	
	@FindBy(xpath="//textarea[@placeholder='Description']")
	WebElement AgreementTypeDescription;
	
	// -------------List Of Agreement "RENT" - Additional Charges ----------------------------------
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement AgreementTypeNextButton;
	
	@FindBy(xpath="//span[@aria-haspopup='listbox']")
	WebElement Type;
	
	@FindBy(xpath="//input[@placeholder='Enter Amount']")
	WebElement Amount;
	
	@FindBy(xpath="//textarea[@placeholder='Description']")
	WebElement AdditionalChargesDescription;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement AdditionalChargesNextButton;
	
	// -------------List Of Agreement "RENT" - Agreement Action ----------------------------------
	
	@FindBy(xpath="//input[@placeholder='Enter Agreement Amount']")
	WebElement AgreementAmt;
	
	@FindBy(xpath="//textarea[@placeholder='Description']")
	WebElement AgreementActionDescription;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement AgreementActionNextButton;
	
	// -------------List Of Agreement "RENT" - Documents ----------------------------------
	
	@FindBy(xpath = "//button[@label='Send for Approval']")
	WebElement SendForApprovalButton;

	@FindBy(xpath = "//button[@label='Save as draft']")
	WebElement SaveAsDraftButton;
	
	

}
