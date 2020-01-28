package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question5 {
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch
		driver.get("https://netbanking.hdfcbank.com/");
		//locators
		WebElement userName = driver.findElement(By.name("fldLoginUserId"));
		//insert
		userName.sendKeys("6785766");
	}

}
