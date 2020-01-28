package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		//locator
		WebElement userName= driver.findElement(By.id("userName"));
		
		//insert
		userName.sendKeys("manoranjan");
	}

}
