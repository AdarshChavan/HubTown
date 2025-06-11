package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.PocketMaster_Class;

public class PocketMaster_TestClass extends BaseTest {

	@Test(priority = 1)
	public void ClickOnThePocketTab() throws IOException, InterruptedException {
		pocketMaster_Class.ClickOnMasterTab();
	}

	@Test(priority = 2)
	public void ClickOnPocketTab() {
		pocketMaster_Class.ClickOnPocketTab();
	}

	@Test(priority = 3)
	public void ClickOnCreateNewPocketButton() throws InterruptedException {
		pocketMaster_Class.clickOnNewPocketButton();
	}

	@Test(priority = 4)
	public void SelectStartDate() throws IOException, InterruptedException {
		Thread.sleep(1000);
		pocketMaster_Class.selectStartDate();
	}

	@Test(priority = 5)
	public void SelectEndDate() throws IOException, InterruptedException {
		Thread.sleep(1000);
		pocketMaster_Class.SelectEndDAte();
	}

	@Test(priority = 6)
	public void ClickOnTheNextButton() {
		pocketMaster_Class.ClickOnNextButton();
	}

	@Test(priority = 7)
	public void EnterPocketName() throws IOException {
		pocketMaster_Class.EnterPocketName();
	}

	@Test(priority = 8)
	public void selectCompanyName() throws IOException {
		pocketMaster_Class.selectComanyName();
	}

	@Test(priority = 9)
	public void selectAreaTypeandEnterAreaValue() throws IOException, InterruptedException {
		pocketMaster_Class.selectAreaType();
		pocketMaster_Class.EnterUnit_area_value();
	}

	@Test(priority = 10)
	public void Invoice_cut_off_date() throws IOException, InterruptedException {
		pocketMaster_Class.Invoice_cut_off_date();
	}

	@Test(priority = 11)
	public void Enter_Location() throws IOException {
		pocketMaster_Class.Enter_Location();
	}

	@Test(priority = 12)
	public void Enter_Address() throws IOException {
		pocketMaster_Class.Enter_Address();
	}

	@Test(priority = 13)
	public void ClickOnNextButton() throws IOException {
		pocketMaster_Class.ClickOnNextButton();
	}

	@Test(priority = 14)
	public void enterNoofTemples() throws IOException {
		pocketMaster_Class.EnterNoofTemples();
	}

	@Test(priority = 15)
	public void enterNoofChurches() throws IOException {
		pocketMaster_Class.EnterNoofChurches();
	}

	@Test(priority = 16)
	public void enterNoofHospitals() throws IOException {
		pocketMaster_Class.EnterNoofHospitals();
	}

	@Test(priority = 17)
	public void enterNoofToilets() throws IOException {
		pocketMaster_Class.EnterNoofToilets();
	}

	@Test(priority = 18)
	public void enterFireBrigade() throws IOException {
		pocketMaster_Class.EnterFireBrigade();
	}

	@Test(priority = 19)
	public void enterWaterSupply() throws IOException {
		pocketMaster_Class.EnterWaterSupply();
	}

	@Test(priority = 20)
	public void enterNoofmosques() throws IOException {
		pocketMaster_Class.EnterNoofmosques();
	}

	@Test(priority = 21)
	public void enterNoofParks() throws IOException {
		pocketMaster_Class.EnterNoofParks();
	}

	@Test(priority = 22)
	public void enterNoofSchool() throws IOException {
		pocketMaster_Class.EnterNoofSchool();
	}

	@Test(priority = 23)
	public void enterNoofbank() throws IOException {
		pocketMaster_Class.EnterNoofbank();
	}

	@Test(priority = 24)
	public void enterRailwaystation() throws IOException {
		pocketMaster_Class.EnterRailwaystation();
	}

	@Test(priority = 25)
	public void enterPolicestation() throws IOException {
		pocketMaster_Class.EnterPolicestation();
	}

	@Test(priority = 26)
	public void enterNoofcollege() throws IOException {
		pocketMaster_Class.EnterNoofcollege();
	}

	@Test(priority = 27)
	public void enterBusDepot() throws IOException {
		pocketMaster_Class.EnterBusDepot();
	}

	@Test(priority = 28)
	public void enterNoofmarket() throws IOException {
		pocketMaster_Class.EnterNoofmarket();
	}

	@Test(priority = 29)
	public void enterElectricitySupply() throws IOException {
		pocketMaster_Class.EnterElectricitySupply();
	}

	@Test(priority = 30)
	public void ClickOnNextButton2() throws IOException {
		pocketMaster_Class.ClickOnNextButton();
	}
	
	
	@Test(priority = 31)
	public void selectUsageType() throws IOException {
		pocketMaster_Class.SelectUsageType();
	}
	
	
	@Test(priority = 32)
	public void selectProcessType() throws IOException {
		pocketMaster_Class.SelectProcessType();
	}
	
	@Test(priority = 33)
	public void enterFromAmountRange() throws IOException {
		pocketMaster_Class.EnterFromAmountRange();
	}
	
	@Test(priority = 34)
	public void enterToAmountRange() throws IOException {
		pocketMaster_Class.EnterToAmountRange();
	}
	
	@Test(priority = 35)
	public void selectRange1StartDate() throws IOException, InterruptedException {
		pocketMaster_Class.SelectRange1StartDate();
	}
	
	@Test(priority = 36)
	public void selectRange1EndDate() throws IOException, InterruptedException {
		pocketMaster_Class.SelectRange1EndDate();
	}
	
	@Test(priority = 37)
	public void ClickOnNextButton3() throws IOException {
		pocketMaster_Class.ClickOnNextButton();
	}
	
	@Test(priority = 38)
	public void clickOnTheSaveButton() throws IOException {
		pocketMaster_Class.ClickOnTheSaveButton();
	}
}
