package com.qa.test.LinkedInPages;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.LinkedIn.Base.LinkedInBase;
import com.qa.LinkedIn.Pages.LinkedInLogIn;

public class LinkedInLogInTest extends LinkedInBase {
	
	LinkedInLogIn login;
	
	public LinkedInLogInTest(){
		super();
	}
	
	@BeforeTest
	public void SetUp(){
		Initilize();
		login = new LinkedInLogIn();
		login.clickonSignIn();
		login.EnterUserDeatils();
		
	}
	
	@Test
	public void verifyLinkedInloginPageTitleTest(){
		String Title= login.verifyhomepageTitle();
		System.out.println(Title);
		
	}
	@Test
	public void clickonSignInLinkTest(){
		login.clickonSignIn();
		login.EnterUserDeatils();
			
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}

}
