package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		// locator
		WebElement txtFrom=driver.findElement(By.id("src"));
		// insert
		txtFrom.sendKeys("chennai");
		//locator
		WebElement txtTo = driver.findElement(By.id("dest"));
		//insert
		txtTo.sendKeys("salem");
		//locator
		WebElement OnwardDate =driver.findElement(By.id("onward_cal"));
		//insert
		OnwardDate.sendKeys("31-Dec-2019");
		//locator
		WebElement ReturnDate =driver.findElement(By.id("return_cal"));
		//insert
		ReturnDate.sendKeys("02-Jan-2020");
		
		//current  Url
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		/// title
		String ed = driver.getTitle();
		System.out.println(ed);
		
		
		
		
		
		
		
		
	}

}
