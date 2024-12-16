package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatutoryApprovalManual_Class {
	
	public WebDriver driver;
	public StatutoryApprovalManual_Class(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Statutory Approval']")
	WebElement Statutory_Approval_Tab;
	
	@FindBy(xpath="//span[text()=' New ']")
	WebElement CreateNew_StatutoryApproval_button;
	
	@FindBy(xpath="//li[text()=' Manual ']")
	WebElement Manual_Statutory_Approval;
	
	@FindBy(xpath="//span[text()='government form']")
	WebElement government_form;
	
	@FindBy(xpath="//span[text()='Sec 33/38']")
	WebElement Sec_33_38;
	
	@FindBy(xpath="//span[text()='Internal']")
	WebElement Internal;
	
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement Confirm_button;
	
	@FindBy(xpath="//span[text()='Select pocket']")
	WebElement PocketName_Dropdown;
	
	@FindBy(xpath="//span[text()='Select society']")
	WebElement SocietyName_Dropdown;
	
	@FindBy(xpath="//span[text()='Select unit']")
	WebElement unitNumber_Dropdown;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement NextButton;
	
	
	

}
