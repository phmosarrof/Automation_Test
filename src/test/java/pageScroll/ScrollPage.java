package pageScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollPage {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
	}

}
