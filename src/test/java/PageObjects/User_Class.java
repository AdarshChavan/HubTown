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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.UtilityClass;

public class User_Class {
	public WebDriver driver;
	public WebDriverWait wait;

	public User_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", element);
	}

	@FindBy(xpath = "//span[text()='User']")
	WebElement User_tab;

	@FindBy(xpath = "//span[text()=' New User ']")
	WebElement NewUser;

	@FindBy(xpath = "//input[@placeholder='Enter First Name']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Enter Last Name']")
	WebElement LastName;

	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Enter User Name']")
	WebElement UserName;

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	WebElement Password;

	@FindBy(xpath = "//span[text()='Select role']")
	WebElement AssignRole;

	@FindBy(xpath = "//div[text()='Select Pockets']")
	WebElement SelectPockets;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement SaveButton;

	public void CLickOnUserTab() {

		WebElement scrollableContainer = driver.findElement(By.cssSelector(".overflow-y-auto"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 1200;", scrollableContainer);

		wait.until(ExpectedConditions.elementToBeClickable(User_tab));

		User_tab.click();

	}

	public void EnterFirstName() throws IOException {
		FirstName.sendKeys(UtilityClass.read("FirstName"));
	}

	public void EnterLasttName() throws IOException {
		LastName.sendKeys(UtilityClass.read("LastName"));
	}

	public void EnterEmail() throws IOException {
		Email.sendKeys(UtilityClass.read("Email"));
	}

	public void EnterUserName() throws IOException {
		UserName.sendKeys(UtilityClass.read("UserName"));
	}

	public void EnterPassword() throws IOException {
		Password.sendKeys(UtilityClass.read("Password"));
	}

	public void SelectAssignRole() throws IOException {
		String Assign_Role = UtilityClass.read("AssignRole");
		AssignRole.click();
		List<WebElement> roles = driver.findElements(By.xpath(""));
		for (WebElement role : roles) {
			if (role.getText().equalsIgnoreCase(Assign_Role)) {
				role.click();
				return;
			}
		}
	}

	public void SelectSelectPockets() throws IOException {
		String Select_Pocket = UtilityClass.read("AssignRole");
		SelectPockets.click();
		List<WebElement> pockets = driver.findElements(By.xpath(""));
		for (WebElement pocket : pockets) {
			if (pocket.getText().equalsIgnoreCase(Select_Pocket)) {
				pocket.click();
				return;
			}
		}
	}
	
	public void ClickOnSave() {
		SaveButton.click();
	}

}
