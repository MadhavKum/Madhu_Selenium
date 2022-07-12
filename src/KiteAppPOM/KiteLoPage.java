package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoPage 
{
	//1.data members
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//2. constructor
	
	public KiteLoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3. methods
	
	public void sendUserName()
	{
		userName.sendKeys("ELR321");
	}
	
	public void sendPassword()
	{
		password.sendKeys("Dhana1111");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}

	
	}

	

