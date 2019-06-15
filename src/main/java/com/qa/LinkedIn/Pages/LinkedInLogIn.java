package com.qa.LinkedIn.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.LinkedIn.Base.LinkedInBase;

public class LinkedInLogIn extends LinkedInBase{
	
	
	//signup
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signInlnk;
	
	//UserName
	@FindBy(xpath="//input[@id='username']")
	WebElement userNameTxt;
	
	//Password
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordTxt;
	
	//SignIn Button
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signInBtn;
	
	public LinkedInLogIn(){
		PageFactory.initElements(driver, this);
	}
	
	//verify the homepageTitle
	public String verifyhomepageTitle(){
		 String LinkedInPageTittle= driver.getTitle();
		 return LinkedInPageTittle;
	}
	
	//click on Sin in Link
	public void clickonSignIn(){
		signInlnk.click();
	}
	
	//enter UserDeatils
	public void EnterUserDeatils(){
		userNameTxt.sendKeys(prop.getProperty("username"));
		passwordTxt.sendKeys(prop.getProperty("password"));
		signInBtn.click();
	}
	
}
