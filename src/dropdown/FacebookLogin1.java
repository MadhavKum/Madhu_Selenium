package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement createAc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAc.click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Madhusudan");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Chawat");
		Thread.sleep(2000);
		
		WebElement reg_mail = driver.findElement(By.name("reg_email__"));
		reg_mail.sendKeys("madhusudanchawat@gmail.com");
		Thread.sleep(2000);
		
		WebElement mailconfirm = driver.findElement(By.name("reg_email_confirmation__"));
		mailconfirm.sendKeys("madhusudanchawat@gmail.com");
		Thread.sleep(2000);
		
		WebElement passward = driver.findElement(By.id("password_step_input"));
		passward.sendKeys("Madhu@1234");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByVisibleText("15");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select m=new Select(month);
		m.selectByIndex(7);
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("1995");
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		Thread.sleep(2000);

	}

}
