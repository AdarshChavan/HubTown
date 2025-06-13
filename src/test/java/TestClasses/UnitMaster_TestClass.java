package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

public class UnitMaster_TestClass extends BaseTest{
	
	@Test(priority = 1)
	public void clickOnSurveyTab() throws InterruptedException {
		unitMaster_Class.ClickOnSurveyTab();
	}
  
	@Test(priority = 2)
	public void ClickOnUnitTab() {
		unitMaster_Class.clickOnUnitTab();
	}
	
	@Test(priority = 3)
	public void ClickOnNewUnitButton() {
		unitMaster_Class.ClickOnNewUnitButton();
	}
	
	@Test(priority = 4)
	public void clickManualOption() throws IOException {
		unitMaster_Class.ClickManualOption();
	}
	
	@Test(priority = 5)
	public void select_Pocket() throws IOException {
		unitMaster_Class.Select_Pocket();
	}
	
	@Test(priority = 6)
	public void select_Society() throws IOException {
		unitMaster_Class.Select_Society();
	}
	
	@Test(priority = 7)
	public void unit_No() throws IOException {
		unitMaster_Class.Unit_No();
	}
	
	@Test(priority = 8)
	public void owner_Name() throws IOException {
		unitMaster_Class.Owner_Name();
	}
	
	@Test(priority = 9)
	public void select_UsageType() throws IOException {
		unitMaster_Class.Select_UsageType();
	}
	
	@Test(priority = 10)
	public void select_Occupancy_Status() throws IOException {
		unitMaster_Class.Select_Occupancy_Status();
	}
	
	@Test(priority = 11)
	public void select_Residence() throws IOException {
		unitMaster_Class.Select_Residence();
	}
	
	@Test(priority = 12)
	public void select_Structure_Details() throws IOException {
		unitMaster_Class.Select_Structure_Details();
	}
	
	@Test(priority = 13)
	public void enter_Area() throws IOException {
		unitMaster_Class.Enter_Area();
	}
	
	@Test(priority = 14)
	public void select_Facing_Types() throws IOException {
		unitMaster_Class.Select_Facing_Types();
	}
	
}
