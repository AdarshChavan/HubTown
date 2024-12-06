package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.SocietyMaster_Class;

public class SocietyMaster_TestClass extends BaseTest{

	
	
	@Test(priority = 1)
	public void clickOnSocietyTab() {
		societyMaster_Class.ClickOnTheMasterTab();
	}
	
	@Test(priority = 2)
	public void ClickOntheScietyTab() {
		societyMaster_Class.clickOntheScietyTab();
	}
	
	@Test(priority = 3)
	public void ClickOntheNewSocietyButton() throws InterruptedException {
		societyMaster_Class.ClickOntheNewSocietyButton();
	}
	
	@Test(priority = 4)
	public void SelectPocketName() throws IOException {
		societyMaster_Class.SelectPocketName();
	}
	
	@Test(priority = 5)
	public void ClickOnNextButton() {
		societyMaster_Class.ClickOnNextButton();
	}
	
	
}
  
