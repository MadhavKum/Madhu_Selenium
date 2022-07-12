package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClassTest2 {
	@Test(groups= {"sanity"})
	public void p()
	{
		//Assert.fail();
		Reporter.log("p is running",true);
	}
	
	@Test(groups= {"regression"})
	public void q()
	
	{
		Reporter.log("q is running regression",true);
	}
	
	@Test(groups=("sanity"))
	public void r()
	{
		Reporter.log("r is running sanity",true);
	}
	
	@Test(groups= {"regression"})
	public void s()
	{
		Reporter.log("s is running regression",true);
	}
}
