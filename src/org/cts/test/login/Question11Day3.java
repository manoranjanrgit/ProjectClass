package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question11Day3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement first = driver.findElement(By.id("firstName"));
		first.sendKeys("mano");
		
		WebElement last = driver.findElement(By.id("lastName"));
		last.sendKeys("r");
		
		WebElement emil = driver.findElement(By.id("username"));
		emil.sendKeys("manor4731");
		
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("manoj234@#$j");
		
		WebElement confm = driver.findElement(By.name("ConfirmPasswd"));
		confm.sendKeys("manoj234@#$j");
		
		
		WebElement icon = driver.findElement(By.xpath("//span[@class='JIzqne IMVfif']"));
		icon.click();
		
		WebElement nxt = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt.click();
		
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
		mob.sendKeys("8681809439");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
