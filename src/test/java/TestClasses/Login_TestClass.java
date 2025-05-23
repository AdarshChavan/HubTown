package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

import Library.LoginPage;

public class Login_TestClass extends BaseTest{

	@Test(priority = 1)
	public void enterInValidCredentials() throws IOException, InterruptedException {
		loginpage.enterInValidUserName();
		loginpage.enterInValidPassWord();
		loginpage.CLickOnSubmitButton();
		
	}
	
	@Test(priority = 2)
	public void enterValidCredentials() throws IOException, InterruptedException {
		
		loginpage.ClearUserNameField();
		loginpage.enterValidUserName();
		loginpage.ClearPassWordField();
		loginpage.enterValidPassWord();
		loginpage.CLickOnSubmitButton();
	}
}
