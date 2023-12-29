package infyniTestAutomation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	// driver should be visible for all the classes in the project
	public static WebDriver driver;

	// reusable method to launch browser
	public static void launchBrowser(String browser) {
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	// reusable method to launch application
	public static void launchApp(String url) {
		driver.get(url);
	}

	// reusable method for implicit wait
	public static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	// reusable method to close application
	public static void closeApp() {
	//	driver.close();
		 driver.quit();
	}
}
