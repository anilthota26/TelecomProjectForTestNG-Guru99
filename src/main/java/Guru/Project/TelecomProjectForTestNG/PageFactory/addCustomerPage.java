package Guru.Project.TelecomProjectForTestNG.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;

public class addCustomerPage extends TelecomBase{
	public WebDriver driver;
	public addCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="done")
	public WebElement BackGroundCheck;
	@FindBy(id="fname")
	public WebElement txt_FirstName;
	@FindBy(id="lname")
	public WebElement txt_LastName;
	@FindBy(id="email")
	public WebElement txt_Email;
	@FindBy(xpath="//textarea[@id='message']")
	public WebElement txt_Address;
	
	@FindBy(id="telephoneno")
	public WebElement txt_PhNO;
	
	@FindBy(name="submit")
	public WebElement btn_Submit;
	@FindBy(xpath="//input[@class='alt']")
	public WebElement btn_Reset;
	
	@FindBy(xpath="//label[@id='message']")
	public WebElement lbl_FirstNameWarnMessage;
	@FindBy(xpath="//label[@id='message50']")
	public WebElement lbl_WarnMessageForLastname;
	
	@FindBy(xpath="//label[@id='message3']")
	public WebElement lbl_WarnMessage;
	@FindBy(xpath="//label[@id='message7']")
	public WebElement lbl_WarnMessageForMobile;
	

	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/h3[1]")
	public WebElement customerID;

	@FindBy(xpath="//a[@class='logo']")
	public WebElement btn_Home;
}
