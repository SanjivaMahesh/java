package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath extends BaseClass {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement emailobj = driver.findElement(By.id("email"));
		emailobj.sendKeys("mahesh.bunny1");
	}
}
