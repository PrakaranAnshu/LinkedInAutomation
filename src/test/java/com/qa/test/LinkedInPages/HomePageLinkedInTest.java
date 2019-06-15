package com.qa.test.LinkedInPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.LinkedIn.Base.LinkedInBase;
import com.qa.LinkedIn.Pages.LinkedInHomePage;
import com.qa.LinkedIn.Pages.LinkedInLogIn;

public class HomePageLinkedInTest extends LinkedInBase {
	
	LinkedInLogIn login;
	LinkedInHomePage homepage;
	
	public HomePageLinkedInTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
		Initilize();
		login= new LinkedInLogIn();
		login.clickonSignIn();
		login.EnterUserDeatils();
		homepage= new LinkedInHomePage();
		
	}
	
	@Test
	public void NumberofSearchResultsTest(){
		homepage.SearchAPerson();
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
