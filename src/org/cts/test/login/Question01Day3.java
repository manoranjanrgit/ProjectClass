package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question01Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.greenstechnologys.com/");
		
		WebElement txtTyping = driver.findElement(By.xpath("//a[@href='contact.php\']"));
		txtTyping.click();
		
		WebElement name=driver.findElement(By.id("InputName"));
		name.sendKeys("Manoranjan");
		
		WebElement email = driver.findElement(By.id("InputEmail1"));
		email.sendKeys("mano23595@gmail.com");
		
		WebElement mobile = driver.findElement(By.id("InputSubject"));
		mobile.sendKeys("8681809439");
		
		WebElement course = driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
		course.sendKeys("selenium");
		
		WebElement branch =driver.findElement(By.name("branch"));
		branch.sendKeys("omr");
		
		WebElement time =driver.findElement(By.name("time"));
		time.sendKeys("immediately");
		
		WebElement comment =driver.findElement(By.name("comments"));
		comment.sendKeys("I like to join");
		
		WebElement subt = driver.findElement(By.id("submit"));
		subt.click();
		
		
		
		
		
		
	
	}
}
