package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Maddy\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//500
		
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(90,800)");

	}

}
