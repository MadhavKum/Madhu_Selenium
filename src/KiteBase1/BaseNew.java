package KiteBase1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class BaseNew 
{
	protected WebDriver driver;
	public void openBrowser() throws IOException 
	{
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("disable notifications");
	//opt.addArguments("incognito");
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get(UtilityProp.getDataFromPropertyFile("URL"));
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
	
}
