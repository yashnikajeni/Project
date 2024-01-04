package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\annie\\eclipse-workspace\\Google\\drivers\\chromedriver.exe");
		
		WebDriver web = new ChromeDriver();
		
		web.manage().window().maximize();
		
		web.get("https://www.google.com/");
		
		WebElement a = web.findElement(By.id("APjFqb"));
		a.sendKeys("inmakes learning hub");
		
		Thread.sleep(3000);
		
		WebElement b = web.findElement(By.xpath("(//input[@role='button'])[1]"));
		b.click();
		
		Thread.sleep(3000);
		
		WebElement c = web.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		c.click();
	}

}
