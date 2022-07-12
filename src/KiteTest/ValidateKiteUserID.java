package KiteTest;

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

public class ValidateKiteUserID extends Base
{

	KiteHomePage2 home;
	KiteLoginPage2 login;
	KitePinPage2 pin;
	
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
		login.sendUserName(Utility.readDataFromExcel(8,0));
		login.sendPassword(Utility.readDataFromExcel(8,1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(8,2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Test
	
	public void validateUserID() throws EncryptedDocumentException, IOException
		{
			Assert.assertEquals(home.getActualUserName(),Utility.readDataFromExcel(8,0),"Actual and Expected are not matching TC is failed");
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

