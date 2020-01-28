package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question16Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		//locator
		
		WebElement sig=driver.findElement(By.xpath("//a[@class='r2iyh']"));
		
		sig.click();
		
		WebElement mob=driver.findElement(By.id("mobile"));
		
		mob.sendKeys("8681789867");
		
		WebElement name=driver.findElement(By.id("name"));
		
		name.sendKeys("manoranjan");
		
		WebElement eid=driver.findElement(By.id("email"));
		
		eid.sendKeys("mano23595@gmail.com");
		
		WebElement pass=driver.findElement(By.id("password"));
		
		pass.sendKeys("manora");
		
		
		WebElement sub=driver.findElement(By.xpath("//a[@class='a-ayg']"));
		
		sub.click();
		
	}

}
