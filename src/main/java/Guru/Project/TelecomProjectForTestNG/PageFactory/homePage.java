package Guru.Project.TelecomProjectForTestNG.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;

public class homePage extends TelecomBase{
public WebDriver driver;
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Add Customer')]")
	public WebElement btn_AddCustomer;
	@FindBy(xpath="//div[@class='flex-item right']//div//a[contains(text(),'Add Tariff Plan')]")
	public WebElement btn_AddTariff;
	@FindBy(xpath="//a[contains(text(),'Add Tariff Plan to Customer')]")
	public WebElement btn_AddTariffToCust;
	@FindBy(xpath="//a[contains(text(),'Pay Billing')]")
	public WebElement btn_PayBilling;
	
}
