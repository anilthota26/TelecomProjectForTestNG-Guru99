package Guru.Project.TelecomProjectForTestNG.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;

public class selectTariffPage extends TelecomBase {
	public WebDriver Driver;
	public selectTariffPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="sele")
	public WebElement txt_SelectTariff;
	@FindBy(name="submit")
	public WebElement txt_Submit;
}
