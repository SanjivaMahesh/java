package qspiders;

import org.openqa.selenium.By;

public class Mypro extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("https://www.istqb.org/");
		driver.findElement(By.name("btnK")).click();

	}

}
