package qspiders;

import org.openqa.selenium.By;

public class Spiders extends BaseClass{
	public static void main(String[] args) {
		driver.get(" https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("qspiders");
		driver.findElement(By.name("btnK")).click();
	}

}
