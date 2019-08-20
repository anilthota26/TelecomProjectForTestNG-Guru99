package Guru.Project.TelecomProjectForTestNG.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru.Project.TelecomProjectForTestNG.TelecomBase;

public class addTarifftoCustomerPage extends TelecomBase {
public WebDriver driver;
public addTarifftoCustomerPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="customer_id")
public WebElement txt_CustomerID;
@FindBy(name="submit")
public WebElement txt_Submit;


//customer_id
}
