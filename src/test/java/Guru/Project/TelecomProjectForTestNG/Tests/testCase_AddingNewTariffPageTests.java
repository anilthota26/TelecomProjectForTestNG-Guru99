package Guru.Project.TelecomProjectForTestNG.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;
import Guru.Project.TelecomProjectForTestNG.Listener.listenerForTests;
import Guru.Project.TelecomProjectForTestNG.PageFactory.addTariffPlansPage;
import Guru.Project.TelecomProjectForTestNG.PageFactory.homePage;
@Listeners(listenerForTests.class)
public class testCase_AddingNewTariffPageTests extends TelecomBase {
	@BeforeMethod
	public void initilize() throws IOException {
		initializeBrowser();
		
	}
	@AfterMethod
	public void TearDown() {
		tearDown();
	}
	@Test(priority=4,groups="addNewTariff")
	public void addingNewTariff() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddTariff.click();
		addTariffPlansPage addTariff=new addTariffPlansPage(driver);
		addTariff.txt_monthlyRental.sendKeys("1000");
		addTariff.txt_FreeLocalMin.sendKeys("1000");
		addTariff.txt_FreeInterMin.sendKeys("500");
		addTariff.txt_FreeSMSPack.sendKeys("300");
		addTariff.txt_ChargePerLocal.sendKeys("1");
		addTariff.txt_ChargePerInter.sendKeys("3");
		addTariff.txt_ChargePerSMS.sendKeys("1");
		addTariff.btn_Submit.click();
		
		 Thread.sleep(10000);
		 String congrtsmsg=addTariff.Congrts_message.getText();
		 System.out.println(congrtsmsg);
		 boolean checker= congrtsmsg.isEmpty();
		 System.out.println(checker);

		 Assert.assertEquals(false, checker);
	
	}
	@Test(priority=6,groups="addNewTariff")
	public void validating_NumbersAndMustNotEmpty_TST009() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddTariff.click();
		addTariffPlansPage addTariff=new addTariffPlansPage(driver);
		addTariff.txt_monthlyRental.click();
		addTariff.txt_FreeLocalMin.click();
		addTariff.txt_FreeInterMin.click();
		addTariff.txt_FreeSMSPack.click();
		addTariff.txt_ChargePerLocal.click();
		addTariff.txt_ChargePerInter.click();
		addTariff.txt_ChargePerSMS.click();
		addTariff.btn_Reset.click();
		Thread.sleep(10000);
		// While not entering in to the textboxs,, warning message will displayed and tastcase will pass 
		// if the all assertions will true then only the test case will passed 
		// with following Assertions we are validating all text boxes in the addtraiff page....
		
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_MonthlyRental.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeLocal.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeInter.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeSMS.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_ChargeLocal.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_ChargeInter.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_SMSPerCharges.isDisplayed());
		Thread.sleep(10000);
		
		
	
	}
	@Test(priority=7,groups="addNewTariff")
	public void validating_CharacterNotAllowed_TST008() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddTariff.click();
		addTariffPlansPage addTariff=new addTariffPlansPage(driver);
		addTariff.txt_monthlyRental.sendKeys("As");
		addTariff.txt_FreeLocalMin.sendKeys("bh");
		addTariff.txt_FreeInterMin.sendKeys("mkj");
		addTariff.txt_FreeSMSPack.sendKeys("nmj");
		addTariff.txt_ChargePerLocal.sendKeys("ure");
		addTariff.txt_ChargePerInter.sendKeys("ns");
		addTariff.txt_ChargePerSMS.sendKeys("mk");
		
		Thread.sleep(10000);
		// While entering the Characters to the textbox warning message will displayed so tastcase will pass 
		// if the all assertions will true then only the test case will passed 
		// with following Assertions we are validating all text boxes in the addtraiff page....
		
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_MonthlyRental.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeLocal.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeInter.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeSMS.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_ChargeLocal.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_ChargeInter.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_SMSPerCharges.isDisplayed());
		Thread.sleep(10000);
		
		
	
	}
	@Test(priority=5,groups="addNewTariff")
	public void validating_SpecialChar_TST007() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddTariff.click();
		addTariffPlansPage addTariff=new addTariffPlansPage(driver);
		addTariff.txt_monthlyRental.sendKeys("@&^%%$$");
		addTariff.txt_FreeLocalMin.sendKeys("@#@2");
		addTariff.txt_FreeInterMin.sendKeys("3488@");
		addTariff.txt_FreeSMSPack.sendKeys("^%$#@");
		addTariff.txt_ChargePerLocal.sendKeys("<(*@");
		addTariff.txt_ChargePerInter.sendKeys("()@");
		addTariff.txt_ChargePerSMS.sendKeys("@#$@");
		
		
		// While entering the special character to the text box message will displayed so tastcase will pass 
		// if the all assertions will true then only the test case will passed 
		// with following Assertions we are validating all text boxes in the addtraiff page....
		
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_MonthlyRental.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeLocal.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeInter.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_FreeSMS.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_ChargeLocal.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_ChargeInter.isDisplayed());
		Assert.assertEquals(true, addTariff.lbl_WarnMessage_SMSPerCharges.isDisplayed());
		Thread.sleep(10000);
		
		
	
	}
	@Test(priority=8,dependsOnMethods="validating_CharacterNotAllowed_TST008",groups="addNewTariff")
	public void validating_SMSPerCharges() throws InterruptedException {
		homePage hm=new homePage(driver);
		hm.btn_AddTariff.click();
		addTariffPlansPage addTariff=new addTariffPlansPage(driver);
		
		addTariff.txt_ChargePerSMS.sendKeys("0.5");
		
		
		Thread.sleep(5000);
		
		boolean checker=addTariff.lbl_WarnMessage_SMSPerCharges.isDisplayed();
		
		System.out.println(checker);
		Assert.assertEquals(true, checker);
		 
		 
		addTariff.btn_Submit.click();
		
	
	}

}
