package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.SocietyMaster_Class;

public class SocietyMaster_TestClass extends BaseTest {

	@Test(priority = 1)
	public void clickOnSocietyTab() throws IOException, InterruptedException {
		societyMaster_Class.ClickOnMasterTab();
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
	public void enterSocietyName() throws IOException {
		societyMaster_Class.EnterSocietyName();
	}

	@Test(priority = 6)
	public void enterVillageName() throws IOException {
		societyMaster_Class.EnterVillageName();
	}

	@Test(priority = 7)
	public void enterTalukaName() throws IOException {
		societyMaster_Class.EnterTalukaName();
	}

	@Test(priority = 8)
	public void enterOwnerName() throws IOException {
		societyMaster_Class.EnterOwnerName();
	}

	@Test(priority = 9)
	public void enterNoOfUnits() throws IOException {
		societyMaster_Class.EnterNoOfUnits();
	}

	@Test(priority = 10)
	public void enterArea() throws IOException {
		societyMaster_Class.EnterArea();
	}

	@Test(priority = 11)
	public void enterDataVerifiedBy() throws IOException {
		societyMaster_Class.EnterDataVerifiedBy();
	}

	@Test(priority = 12)
	public void enterCTSNo() throws IOException {
		societyMaster_Class.EnterCTSNo();
	}

	@Test(priority = 13)
	public void clickOntheSaveButton() throws IOException {
		societyMaster_Class.ClickOntheSaveButton();
	}

}
