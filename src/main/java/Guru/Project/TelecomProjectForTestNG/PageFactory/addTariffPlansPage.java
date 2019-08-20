package Guru.Project.TelecomProjectForTestNG.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;

public class addTariffPlansPage extends TelecomBase{
	public WebDriver driver;
	public addTariffPlansPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="rental1")
	public WebElement txt_monthlyRental;
	@FindBy(id="local_minutes")
	public WebElement txt_FreeLocalMin;
	@FindBy(id="inter_minutes")
	public WebElement txt_FreeInterMin;
	@FindBy(id="sms_pack")
	public WebElement txt_FreeSMSPack;	
	@FindBy(id="minutes_charges")
	public WebElement txt_ChargePerLocal;
	@FindBy(id="inter_charges")
	public WebElement txt_ChargePerInter;
	@FindBy(id="sms_charges")
	public WebElement txt_ChargePerSMS;
	@FindBy(name="submit")
	public WebElement btn_Submit;	
	@FindBy(xpath="//input[@class='alt']")
	public WebElement btn_Reset;
	
	@FindBy(xpath="//h2[contains(text(),'Congratulation you add Tariff Plan')]")
	public WebElement Congrts_message;	
	@FindBy(id="message2")
	public WebElement lbl_WarnMessage_MonthlyRental;
	@FindBy(id="message3")
	public WebElement lbl_WarnMessage_FreeLocal;
	@FindBy(id="message4")
	public WebElement lbl_WarnMessage_FreeInter;
	@FindBy(id="message5")
	public WebElement lbl_WarnMessage_FreeSMS;
	@FindBy(id="message6")
	public WebElement lbl_WarnMessage_ChargeLocal;
	@FindBy(id="message7")
	public WebElement lbl_WarnMessage_ChargeInter;
	@FindBy(id="message8")
	public WebElement lbl_WarnMessage_SMSPerCharges;
	
	
	
}