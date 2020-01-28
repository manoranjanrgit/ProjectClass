package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Questions10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		// locator
		WebElement txtUserName=driver.findElement(By.id("username"));
		// insert
		txtUserName.sendKeys("manoranjan");
		// locator
				WebElement txtPassword=driver.findElement(By.id("password"));
				// insert
				txtPassword.sendKeys("86756765");
	}

}
