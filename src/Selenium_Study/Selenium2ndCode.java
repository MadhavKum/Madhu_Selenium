package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2ndCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Madhu@123");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("madhu@123gmail.com");
		driver.findElement(By.xpath("//h2[contains(@class,'_8e')]")).click();
		driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]")).click();
	}

}
