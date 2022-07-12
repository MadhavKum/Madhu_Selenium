package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Madhusudan");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Chawat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("('//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("madhusudanchawat@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("madhusudanchawat@gmail.com");
		Thread.sleep(2000);
		
		
		
	}

}
