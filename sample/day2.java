package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sriidev\\\\eclipse-workspace\\\\SELENIUM\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser=driver.findElement(By.id("email"));
		txtUser.sendKeys("eliteseenu@gmailcom");
		WebElement txtPass=driver.findElement(By.name("pass"));
		txtPass.sendKeys("12345");
	}

}
