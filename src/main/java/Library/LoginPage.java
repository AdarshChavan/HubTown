package Library;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath= "//input[@placeholder='Enter username']")
	WebElement Username;

	@FindBy(xpath= "//input[@placeholder='Enter password']")
	WebElement Password;
	
	@FindBy(xpath= "//div[text()='Login']")
	WebElement submitButton;
	
	public void enterValidUserName() throws IOException {
		Username.sendKeys(UtilityClass.read("UserName"));
	}
	
	public void enterValidPassWord() throws IOException {
		Password.sendKeys(UtilityClass.read("Password"));
	}
	
	public void enterInValidUserName() throws IOException {
		Username.sendKeys("abc");
	}
	
	public void enterInValidPassWord() throws IOException {
		Password.sendKeys("pass@123");
	}
	
	public void ClearUserNameField() throws IOException {
		Username.clear();
	}
	
	public void ClearPassWordField() throws IOException {
		Password.clear();
	}
	public void CLickOnSubmitButton() throws InterruptedException {
		submitButton.click();
		Thread.sleep(1000);
		
		
	}
}
