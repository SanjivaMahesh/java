package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingToWebDriver_LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("the title of the page is" + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current page is" + currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is:" + pageSource);
		Thread.sleep(2000);
		driver.close();
	}

}
