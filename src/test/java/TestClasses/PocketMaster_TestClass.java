package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.PocketMaster_Class;


public class PocketMaster_TestClass extends BaseTest{
	
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
	
	
}
