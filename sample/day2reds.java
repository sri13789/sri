package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class day2reds {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sriidev\\\\eclipse-workspace\\\\SELENIUM\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtFrom=driver.findElement(By.id("src"));
		txtFrom.sendKeys("chenai");
		WebElement txtTo=driver.findElement(By.id("dest"));
		txtTo.sendKeys("bangalore");
	}

}
