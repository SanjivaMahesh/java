package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test extends BaseClass {
	public static void main(String[] args) {
		driver.get("http://localhost/login.do;jsessionid=5r2t04eaeroc");
		WebElement unobj = driver.findElement(By.name("username"));
		unobj.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}

}
