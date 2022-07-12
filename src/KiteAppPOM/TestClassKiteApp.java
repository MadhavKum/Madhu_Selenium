package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassKiteApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();	
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLoPage login=new KiteLoPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(2000);
		
		KitePinPage pin=new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(2000);
		KiteHoPage home=new KiteHoPage(driver);
		home.validateUserName();
		home.logOut();
		
		driver.close();

	}

}
