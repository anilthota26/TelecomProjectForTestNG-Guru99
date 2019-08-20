package Guru.Project.TelecomProjectForTestNG.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;
import Guru.Project.TelecomProjectForTestNG.Listener.listenerForTests;
import Guru.Project.TelecomProjectForTestNG.PageFactory.addCustomerPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.addTarifftoCustomerPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.homePage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.selectTariffPage;
@Listeners(listenerForTests.class)
public class testCase_TST010_AddTariffPlanToCust extends TelecomBase{
	@BeforeClass
	public void initilize() throws IOException {
		initializeBrowser();
		
	}
	@Test(priority=9,groups="addTariffToCust")
	public void addTariffToCustomer() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddCustomer.click();
		addCustomerPage addCustomer=new addCustomerPage(driver);
//		addCustomer.BackGroundCheck.click();
		addCustomer.txt_FirstName.sendKeys(prop.getProperty("firstname"));
		addCustomer.txt_LastName.sendKeys(prop.getProperty("lastname"));
		addCustomer.txt_Email.sendKeys(prop.getProperty("email"));
		addCustomer.txt_Address.sendKeys(prop.getProperty("address"));
		addCustomer.txt_PhNO.sendKeys(prop.getProperty("mobile"));
		addCustomer.btn_Submit.click();
		Thread.sleep(10000);
		String customerId=addCustomer.customerID.getText();
		addCustomer.btn_Home.click();
		System.out.println(customerId);
		hm.btn_AddTariffToCust.click();
		addTarifftoCustomerPage addTariffToCust=new addTarifftoCustomerPage(driver);
		addTariffToCust.txt_CustomerID.sendKeys(customerId);
		addTariffToCust.txt_Submit.click();
		Thread.sleep(5000);
		selectTariffPage selectTariff=new selectTariffPage(driver);
//		selectTariff.txt_SelectTariff.click();
		selectTariff.txt_Submit.click();
		
		addCustomer.btn_Home.click();
		
		
		
		Thread.sleep(5000);
		
	}
	@AfterClass
	public void TearDown() {
		tearDown();
	}
}
