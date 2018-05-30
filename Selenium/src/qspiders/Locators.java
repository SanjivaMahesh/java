package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement unTB = driver.findElement(By.id("email"));
		unTB.clear();
		unTB.sendKeys("mahesh.bunny1");
		WebElement passTB = driver.findElement(By.name("pass"));
		passTB.clear();
		passTB.sendKeys("mahesh1234");
		WebElement fnTB = driver.findElement(By.name("firstname"));
		fnTB.clear();
		fnTB.sendKeys("Mahesh");
		WebElement lnTB = driver.findElement(By.name("lastname"));
		lnTB.clear();
		lnTB.sendKeys("Kuruva");
		WebElement mNO = driver.findElement(By.name("reg_email__"));
		mNO.clear();
		mNO.sendKeys("9182640862");
		WebElement nPWD = driver.findElement(By.name("reg_passwd__"));
		nPWD.clear();
		nPWD.sendKeys("mahesh");
		String title = driver.getTitle();
		System.out.println("the title page is: " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the current url is: " + currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is: " + pageSource);

	}

}
