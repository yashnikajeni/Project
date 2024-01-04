package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	
	public AmazonPojo() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	public WebElement hello;
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(id = "continue")
	public WebElement click;

	public WebElement getHello() {
		return hello;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getClick() {
		return click;
	}
	
	

	}
	
	


