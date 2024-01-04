package org.stepdefinition;

import org.base.AmazonPojo;
import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon extends BaseClass{
	AmazonPojo a;
	@Given("To launch the chrome browser and maximize the windows")
	public void toLaunchTheChromeBrowserAndMaximizeTheWindows() {
	    
	}

	@When("To launch the url of amazon application")
	public void toLaunchTheUrlOfAmazonApplication() {
		launchurl("https://www.amazon.in/");
	    
	}

	@When("To click on the sign in option")
	public void toClickOnTheSignInOption() throws InterruptedException {
		Thread.sleep(3000);
		a=new AmazonPojo();
		clikbtn(a.getHello());
	  
	}

	@When("To pass the email in email field")
	public void toPassTheEmailInEmailField() {
		a=new AmazonPojo();
		passtext("asdfghjk@gmail.com", a.getEmail());
		
	   
	}

	@When("To click on continue")
	public void toClickOnContinue() {
		a=new AmazonPojo();
		clikbtn(a.getClick());
	   
	}

	@When("To check whether it navigated to password page or not")
	public void toCheckWhetherItNavigatedToPasswordPageOrNot() {
		System.out.println("success");
	   
	}

	@Then("To close the browser")
	public void toCloseTheBrowser() {
	   
	}




}
