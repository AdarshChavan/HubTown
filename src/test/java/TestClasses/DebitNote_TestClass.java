package TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.DebitNote_Class;

public class DebitNote_TestClass extends BaseTest{

	
	@Test()
	public void clickPaymentTab() {
		debitNote_Class.clickOnThePaymentTab();
	}
	
	public void ClickDebitNotTab() {
		debitNote_Class.clickOnTheDebitNote_LeftMenu();
	}
	
	public void CreateDebitNote() {
		debitNote_Class.clickOnTheCreateDebitNoteButton();
	}
	
	public void CreateInvoice() {
		debitNote_Class.SelectProcessType();
	}
	
	
	
	
	
}
