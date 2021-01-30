package pageScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUp {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,2500)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,-200)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,2500)");
		
		
	}

}
