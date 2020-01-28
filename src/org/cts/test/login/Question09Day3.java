package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question09Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement signin = driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		signin.click();
		
		
		WebElement reg = driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart')]"));
		reg.click();
		
		
		
		
		
	}

}
