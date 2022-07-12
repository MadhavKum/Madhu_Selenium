package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoTationStudy {
  @Test
  public void validateUserID()
  {
	  Reporter.log("User ID Validated",true);
	  }
  
  @Test
  public void validateDashboard()
  {
	  Reporter.log("DashBoard Validated",true);
  }
  
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("Login success",true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("browser Launch",true);
  }
  
  @AfterMethod
  public void logoutFromKiteApp()
  {
	  Reporter.log("logging.out....",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("browser closed",true);
  }
}
