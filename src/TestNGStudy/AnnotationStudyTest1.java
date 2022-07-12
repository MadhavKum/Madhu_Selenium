package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudyTest1 {
  @Test
  public void rechargeMobile() 
  {
	  Reporter.log("Recharge done",true);
  }
  
  @BeforeMethod
  public void loginToRechargePortal()
  {
	  Reporter.log("login sucess",true);
  }
  
  @AfterMethod
  public void logoutFromRechargePortal()
  {
	  Reporter.log("logout done",true);
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("browser Launch",true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("browser closed",true);
  }
}
