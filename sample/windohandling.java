package org.sample;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class windohandling {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sriidev\\\\eclipse-workspace\\\\SELENIUM\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement f3= driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		f3.click();
		WebElement f1= driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		f1.sendKeys("iphonex");
		WebElement f2= driver.findElement(By.xpath("//button[@type='submit']"));
				f2.click();
				Thread.sleep(5000);
		WebElement f4= driver.findElement(By.xpath("//img[@class='_1Nyybr _30XEf0'][1]"));
		f4.click();
		String parentId = driver.getWindowHandle();
	 Set<String> allid = driver.getWindowHandles();
	 for (String x : allid) {
		if(!parentId.equals(x))
		{
			driver.switchTo().window(x);
		}
	}
	 
		WebElement f5= driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		f5.click();
		
		
		
	}

}
