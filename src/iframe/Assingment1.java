package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Frames')]"));
		System.out.println(text.getText());
		//selenium focus from main page to frame
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.tagName("input"));
		search.click();
		search.sendKeys("nested frame");
		//focus switch from frame to main page
		driver.switchTo().defaultContent();
		WebElement text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		System.out.println(text1.getText());
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		search.click();
		search.sendKeys(" practice");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Select animal = new Select(driver.findElement(By.id("animals")));
		animal.selectByIndex(2);
		
	
	}

}
