package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question13Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		WebElement sig = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		sig.click();
		
		WebElement reg = driver.findElement(By.className("newUserRegister"));
		reg.click();
		
		WebElement mob = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']"));
		mob.sendKeys("8687809678");
		
		
		
		
		
		
		
		
		
		
	}

}
