package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		//locator
		WebElement from=driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]"));
		//insert
		from.sendKeys("chennai");
		WebElement to=driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[2]"));
		to.sendKeys("salem");
	}

}
