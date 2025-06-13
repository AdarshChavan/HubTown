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
	
	@Test(priority = 15)
	public void enter_censedNameFirst() throws IOException {
		unitMaster_Class.Enter_censedNameFirst();
	}
	
	@Test(priority = 16)
	public void enter_censedNameMiddle() throws IOException {
		unitMaster_Class.Enter_censedNameMiddle();
	}
	
	@Test(priority = 17)
	public void enter_censedNameLast() throws IOException {
		unitMaster_Class.Enter_censedNameLast();
	}
	
	@Test(priority = 18)
	public void enter_occupierFirstName() throws IOException {
		unitMaster_Class.Enter_occupierFirstName();
	}
	
	@Test(priority = 19)
	public void enter_occupierMiddleName() throws IOException {
		unitMaster_Class.Enter_occupierMiddleName();
	}
	
	@Test(priority = 20)
	public void enter_occupierLastName() throws IOException {
		unitMaster_Class.Enter_occupierLastName();
	}
	
	@Test(priority = 21)
	public void enter_originalSocietyName() throws IOException {
		unitMaster_Class.Enter_originalSocietyName();
	}
	
	@Test(priority = 22)
	public void Enter_originalSurveyNo() throws IOException {
		unitMaster_Class.Enter_originalSurveyNo();
	}
	
	@Test(priority = 23)
	public void ClickOnNext_button() throws IOException {
		unitMaster_Class.ClickOnNext_button();
	}
}
