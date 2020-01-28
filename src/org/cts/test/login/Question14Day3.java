package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?");
		
		WebElement eml = driver.findElement(By.name("email"));
		eml.sendKeys("mano2345@yahoo.com");
		
		WebElement pas = driver.findElement(By.name("password"));
		pas.sendKeys("hel@Sidc23ll");
		
		WebElement mob = driver.findElement(By.name("mobile"));
		mob.sendKeys("8987868789");
		
		WebElement gen = driver.findElement(By.id("male"));
		gen.click();
		
		WebElement reg = driver.findElement(By.className("register-register-button"));
		reg.click();
		
		
		
		
		
	}

}
