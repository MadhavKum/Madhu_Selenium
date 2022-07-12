package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_X_Path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Madhu");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	}



}
