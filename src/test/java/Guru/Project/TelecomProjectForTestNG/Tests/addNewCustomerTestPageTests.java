package Guru.Project.TelecomProjectForTestNG.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;
import Guru.Project.TelecomProjectForTestNG.PageFactory.addCustomerPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.homePage;
import Guru.Project.TelecomProjectForTestNG.Listener.listenerForTests;
@Listeners(listenerForTests.class)
public class addNewCustomerTestPageTests extends TelecomBase {
	
	@BeforeMethod
	public void initilize() throws IOException {
		initializeBrowser();
		
	}
	@AfterMethod
	public void TearDown() {
		tearDown();
	}
	
	
	@Test(priority=0,groups="addCustomer")
	
	public void addingNewCustomerTest() throws InterruptedException {
		
	homePage hm=new homePage(driver);

	hm.btn_AddCustomer.click();
	addCustomerPage addCustomer=new addCustomerPage(driver);
//	addCustomer.BackGroundCheck.click();
	addCustomer.txt_FirstName.sendKeys(prop.getProperty("firstname"));
	addCustomer.txt_LastName.sendKeys(prop.getProperty("lastname"));
	addCustomer.txt_Email.sendKeys(prop.getProperty("email"));
	addCustomer.txt_Address.sendKeys(prop.getProperty("address"));
	addCustomer.txt_PhNO.sendKeys(prop.getProperty("mobile"));
	addCustomer.btn_Submit.click();
	Thread.sleep(10000);
	}
	@Test(priority=3,groups="addCustomer")
	public void testCaseForAddCuustTextFields() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddCustomer.click();
		addCustomerPage addCustomer=new addCustomerPage(driver);
		addCustomer.txt_FirstName.sendKeys("@nil");
		String WarnMessage=addCustomer.lbl_FirstNameWarnMessage.getText();
		System.out.println(WarnMessage);
//		Special characters are not allowed
		addCustomer.txt_LastName.sendKeys("@kumar");
		addCustomer.txt_Email.sendKeys("anil123@gmail.com");
		addCustomer.txt_Address.sendKeys("Gntur@#");
		addCustomer.txt_PhNO.click();
		addCustomer.txt_PhNO.sendKeys("@999");
		
		
			Assert.assertEquals(true, addCustomer.lbl_FirstNameWarnMessage.isDisplayed());
			Assert.assertEquals(true, addCustomer.lbl_WarnMessageForLastname.isDisplayed());
			Assert.assertEquals(true, addCustomer.lbl_WarnMessage.isDisplayed());
			Assert.assertEquals(true, addCustomer.lbl_WarnMessageForMobile.isDisplayed());
		
			
			Thread.sleep(5000);
		
	
		
		
	}
	@Test(priority=2,groups="addCustomer")
	public void testCaseForAddress() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddCustomer.click();
		addCustomerPage addCustomer=new addCustomerPage(driver);
		addCustomer.txt_Address.click();
		addCustomer.txt_Address.sendKeys("anil");
		
		
		addCustomer.txt_Address.clear();
		Thread.sleep(5000);
		boolean checker=addCustomer.lbl_WarnMessage.isDisplayed();
		Assert.assertEquals(true, checker);
		
		
		addCustomer.btn_Submit.click();
	
		Thread.sleep(5000);
		
	}
	@Test(priority=1,groups="addCustomer")
	public void testCaseForMobileField() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddCustomer.click();
		addCustomerPage addCustomer=new addCustomerPage(driver);
		addCustomer.txt_PhNO.click();
		addCustomer.txt_PhNO.sendKeys("9951186498");
		
		Thread.sleep(5000);
		addCustomer.txt_PhNO.clear();
		Thread.sleep(5000);
		boolean checker=addCustomer.lbl_WarnMessageForMobile.isDisplayed();
		System.out.println(checker);
		
		Assert.assertEquals(true, checker);
		
		
		addCustomer.btn_Submit.click();
	
		Thread.sleep(5000);
		
	}
	

}
