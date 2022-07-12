package KiteTest1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePOMUsingTestNG.KiteHomePage2;
import KitePOMUsingTestNG.KiteLoginPage2;
import KitePOMUsingTestNG.KitePinPage2;
import KiteUtility.Utility;
import KiteUtility.UtilityProp;

public class ValidateKiteUserIDProperty extends Base
{
	KiteHomePage2 home;
	KiteLoginPage2 login;
	KitePinPage2 pin;
	String TCID="555";
	
	@BeforeClass
	public void launchBrowse()
	{
		openBrowser();
		login=new KiteLoginPage2(driver);
		pin=new KitePinPage2(driver);
		home=new KiteHomePage2(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		
	}
	
	@Test
	
	public void validateUserID() throws EncryptedDocumentException, IOException
		{
			Assert.assertEquals(home.getActualUserName(),UtilityProp.getDataFromPropertyFile("UN"));
		}
	
	
	@AfterMethod
	
	public void logOutFromKite() throws InterruptedException
	{
		home.logOut();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
