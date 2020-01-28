package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question07Day3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		WebElement from = driver.findElement(By.id("from_station"));
		from.sendKeys("chennai");
		WebElement to = driver.findElement(By.id("to_station"));
		to.sendKeys("salem");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
