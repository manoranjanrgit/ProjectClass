package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		//arrow id 
		WebElement txtUser=driver.findElement(By.id("user-id-goahead"));
		txtUser.click();
		
		// locator
		WebElement txtUser1=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		// insert
		txtUser1.sendKeys("manoranjan");
		
		//locator
		WebElement txtpasord=driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		//insert
		txtpasord.sendKeys("8681809439");
		
		
	}

}