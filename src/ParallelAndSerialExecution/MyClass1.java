package ParallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void myMethods()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
  }
}
