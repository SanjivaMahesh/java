import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginIn {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");// set path
		WebDriver driver = new FirefoxDriver();// to launch browser
		driver.get("https://www.irctc.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
