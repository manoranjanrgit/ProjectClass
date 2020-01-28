package org.cts.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question12Day3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Eclipse_64 bit\\eclipse\\Manoj\\SeleniumDay2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	   driver.get("https://www.irctc.co.in/nget/train-search");

		WebElement reg = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		reg.click();
		
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys("mano");
	   
		WebElement pass = driver.findElement(By.id("usrPwd"));
		pass.sendKeys("ranjan");
		
		WebElement conf = driver.findElement(By.id("cnfUsrPwd"));
		conf.sendKeys("ranjan");
		
		WebElement ans = driver.findElement(By.xpath("//input[@placeholder='Security Answer']"));
		ans.sendKeys("mano");
	   
		WebElement first = driver.findElement(By.id("firstName"));
		first.sendKeys("mano");
		
		WebElement mid = driver.findElement(By.id("middleName"));
		mid.sendKeys("ranjan");
		
		WebElement last = driver.findElement(By.id("lastname"));
		last.sendKeys("r");
	   
		WebElement radio = driver.findElement(By.id("M"));
		radio.click();
		
		WebElement dob = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		dob.sendKeys("23-05-1995");

		WebElement rd = driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
		rd.click();
	   
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mano3595@gmail.com");
		
		WebElement mob = driver.findElement(By.id("mobile"));
		mob.sendKeys("8681809439");
		
		WebElement res = driver.findElement(By.id("resAddress1"));
		res.sendKeys("92-1,asad street"+"\n"+"mohammed pura"+"\n"+"salem-636001");
	   
		WebElement add2 = driver.findElement(By.id("resAddress2"));
		add2.sendKeys("92-1,asad street"+"\n"+"mohammed pura"+"\n"+"salem-636001");
	   
		WebElement add3 = driver.findElement(By.id("resAddress3"));
		add3.sendKeys("92-1,asad street"+"\n"+"mohammed pura"+"\n"+"salem-636001");
	   
		WebElement pin = driver.findElement(By.name("resPinCode"));
		pin.sendKeys("636001");
		
		WebElement sta = driver.findElement(By.name("resState"));
		sta.sendKeys("TAMIL NADU");
		
		WebElement PHO = driver.findElement(By.xpath("(//input[@name='resPinCode'])[2]"));
		PHO.sendKeys("04272260300");
		
		WebElement RDI = driver.findElement(By.xpath("(//input[@type='radio'])[6]"));
		RDI.click();
	   
		WebElement cl = driver.findElement(By.xpath("//input[@class='ng-valid ng-dirty ng-touched']"));
		cl.click();
	   
		WebElement cap = driver.findElement(By.xpath("(//input[@type='text'])[15]"));
		cap.sendKeys("LUZE123");
		
		
		WebElement icon = driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")); 
		icon.click();
		
		
		WebElement register = driver.findElement(By.xpath("//b[text()='REGISTER']")); 
		register.click();
		
		
	   
	
	}
}
