package Guru.Project.TelecomProjectForTestNG.Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;
import Guru.Project.TelecomProjectForTestNG.Listener.listenerForTests;
import Guru.Project.TelecomProjectForTestNG.PageFactory.addCustomerPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.addTarifftoCustomerPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.homePage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.payBillingPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.selectTariffPage;

@Listeners(listenerForTests.class)

public class testCase_TST011_CheckingCustBill extends TelecomBase{
	@BeforeMethod
	public void initilize() throws IOException {
		initializeBrowser();
		
	}
	@Test(priority=10,groups="checkBill")
	public void CheckingBillOfCustomer() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddCustomer.click();
		
		
		//adding customer
		
		
		addCustomerPage addCustomer=new addCustomerPage(driver);
//		addCustomer.BackGroundCheck.click();
		addCustomer.txt_FirstName.sendKeys(prop.getProperty("firstname"));
		addCustomer.txt_LastName.sendKeys(prop.getProperty("lastname"));
		addCustomer.txt_Email.sendKeys(prop.getProperty("email"));
		addCustomer.txt_Address.sendKeys(prop.getProperty("address"));
		addCustomer.txt_PhNO.sendKeys(prop.getProperty("mobile"));
		addCustomer.btn_Submit.click();
		Thread.sleep(3000);
		
		// Geting Customer Id 
		
		String customerId=addCustomer.customerID.getText();
		addCustomer.btn_Home.click();
		System.out.println(customerId);
		
		// Adding tariff plan to customer 
		
		hm.btn_AddTariffToCust.click();
		addTarifftoCustomerPage addTariffToCust=new addTarifftoCustomerPage(driver);
		addTariffToCust.txt_CustomerID.sendKeys(customerId);
		addTariffToCust.txt_Submit.click();
		Thread.sleep(5000);
		selectTariffPage selectTariff=new selectTariffPage(driver);
//		selectTariff.txt_SelectTariff.click();
		selectTariff.txt_Submit.click();
		
		addCustomer.btn_Home.click();
		
		// Checking Customer Bill details 
		
		payBillingPage checkBill= new payBillingPage(driver);
		hm.btn_PayBilling.click();
		checkBill.txt_CustomerID.sendKeys(customerId);
		checkBill.txt_Submit.click();
		
		
		
		
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void TearDown() {
		tearDown();
	}
}
