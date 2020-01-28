package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Question06Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.redbus.in/");
		
		WebElement sig =  driver.findElement(By.id("i-icon-profile"));
		sig.click();
		
		WebElement sigin = driver.findElement(By.id("signInLink"));
		sigin.click();
		WebElement mob = driver.findElement(By.xpath("(//input[@class='IP'])[1]"));
		mob.sendKeys("8681809439");
		
		
		
		
		
		
		
		
	}

}
