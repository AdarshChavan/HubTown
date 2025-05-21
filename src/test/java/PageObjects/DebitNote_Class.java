package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DebitNote_Class {

	public WebDriver driver;
	public DebitNote_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Payments']")
	WebElement PaymentTab_LeftMenu;

	@FindBy(xpath="(//span[text()='Debit Note'])[1]")
	WebElement DebitNote_LeftMenu;

	@FindBy(xpath="//span[text()=' New Debit Note ']")
	WebElement CreateDebitNoteButton;

	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[1]")
	WebElement ProcessType;

	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[2]")
	WebElement PocketName ;

	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[3]")
	WebElement Society;

	@FindBy(xpath="(//span[@aria-haspopup='listbox'])[4]")
	WebElement UnitNo;

	@FindBy(xpath="(//input[@id='amount'])[3]")
	WebElement DebitAmount;

	@FindBy(xpath="//textarea[@id='address']")
	WebElement Description;

	public void clickOnThePaymentTab() {
		PaymentTab_LeftMenu.click();
	}

	public void clickOnTheDebitNote_LeftMenu() {
		DebitNote_LeftMenu.click();
	}

	public void clickOnTheCreateDebitNoteButton() {
		CreateDebitNoteButton.click();
	}

	public void SelectProcessType() {
		ProcessType.click();
	}
}
