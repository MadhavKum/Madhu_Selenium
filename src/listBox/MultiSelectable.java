package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
	
		WebElement multiSelectElement = driver.findElement(By.name("cars"));
		
		Select s = new Select(multiSelectElement);
		
		System.out.println("Multi Select status is"+s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(100);
		s.selectByVisibleText("Saab");
		Thread.sleep(100);
		s.selectByIndex(2);
		Thread.sleep(100);
		s.selectByIndex(3);
		
		//s.deselectAll();
		Thread.sleep(100);
		s.deselectByIndex(3);
		Thread.sleep(100);
		s.deselectByIndex(2);
		Thread.sleep(100);
		s.deselectByValue("Saab");
		
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.getAllSelectedOptions();
		
	}

}
