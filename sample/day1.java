package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sriidev\\eclipse-workspace\\SELENIUM\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String ti = driver.getTitle();
		 System.out.println(ti);
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 driver.quit();
		
	}

}
