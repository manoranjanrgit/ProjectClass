package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question15Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	   driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
	   
	    WebElement name =driver.findElement(By.id("navbar_username"));
		name.sendKeys("manoranjan");
		
	    WebElement pass =driver.findElement(By.id("navbar_password"));
		pass.sendKeys("ranjan12!@");
		
		WebElement radio =driver.findElement(By.id("cb_cookieuser_navbar"));
		radio.click();
		
		WebElement login =driver.findElement(By.className("button"));
		login.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
