package TestClasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Library.BaseClass;
import Library.LoginPage;
import PageObjects.DebitNote_Class;
import PageObjects.PocketMaster_Class;
import PageObjects.SocietyMaster_Class;
import PageObjects.UnitMaster_Class;

public class BaseTest extends BaseClass {

	@BeforeSuite
	public void Browser() throws IOException {
		InitializeBrowser();
	}

	public LoginPage loginpage;
	public PocketMaster_Class pocketMaster_Class;
	public SocietyMaster_Class societyMaster_Class;
	public UnitMaster_Class unitMaster_Class;
	public DebitNote_Class debitNote_Class;

	@BeforeClass
	public void pageObjects() {
		loginpage = new LoginPage(driver);
		pocketMaster_Class = new PocketMaster_Class(driver);
		societyMaster_Class = new SocietyMaster_Class(driver);
		unitMaster_Class = new UnitMaster_Class(driver);
		debitNote_Class = new DebitNote_Class(driver);
	}
}
