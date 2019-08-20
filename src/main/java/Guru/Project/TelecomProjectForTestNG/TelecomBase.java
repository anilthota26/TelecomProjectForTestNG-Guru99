package Guru.Project.TelecomProjectForTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TelecomBase {
	public  WebDriver driver;
	public Properties prop;
//	public static Logger logger;
	public static Logger log= Logger.getLogger(TelecomBase.class);
	public WebDriver initializeBrowser() throws IOException {
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("Y:\\New Work Space\\TelecomProject\\config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
//		String url=prop.getProperty("url");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			log.info("***************************Chrome Browser Started*************************");
			
			System.setProperty("webdriver.chrome.driver","Y:\\Selenium Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			log.info("***************************FireFox Browser Started*************************");
			System.setProperty("webdriver.firefox.driver","Y:\\Selenium Softwares\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else if(browserName.equalsIgnoreCase("edge")){
			log.info("***************************Edge Browser Started*************************");
			
			System.setProperty("webdriver.edge.driver","Y:\\Selenium Softwares\\edgedriver.exe");
			driver=new EdgeDriver();	
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
		
		
		
		
	}
	public void FailedTestcases(String TestcaseName)
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des= new File("Y:\\New Work Space\\TelecomProject\\Screenshots"+TestcaseName+".jpg");
		
		try {
			FileUtils.copyFile(src,des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tearDown()
	{
		log.info("*************************** Browser Closed *************************");
		driver.quit();
	}
}
