package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Question10Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.amazon.in/");
	WebElement sign = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
	sign.click();
	
	WebElement eml =driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	eml.click();
	
	WebElement name =driver.findElement(By.id("ap_customer_name"));
	name.sendKeys("manoranjan");
	
	WebElement mob =driver.findElement(By.id("ap_phone_number"));
	mob.sendKeys("8681809439");
	
	WebElement emai =driver.findElement(By.id("ap_email"));
	emai.sendKeys("mano59532@gmail.com");
	
	WebElement pass =driver.findElement(By.id("ap_password"));
	pass.sendKeys("abcdefg@1");
	
	WebElement cont =driver.findElement(By.xpath("//input[@id='continue']"));
	cont.click();
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
