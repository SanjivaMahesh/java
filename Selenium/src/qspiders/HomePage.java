package qspiders;

import org.openqa.selenium.By;

public class HomePage extends BaseClass {
	public static void main(String[] args) {
		driver.get("http://localhost/login.do;jsessionid=2mfd03tf1c1ri");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		
	}

}
