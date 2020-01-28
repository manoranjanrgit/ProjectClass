package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Question8 {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/");
			
			// locator
			WebElement txtUserName=driver.findElement(By.xpath("//input[@name='username']"));
			
			// insert
			txtUserName.sendKeys("manoranjan");
			
			
	}

}
