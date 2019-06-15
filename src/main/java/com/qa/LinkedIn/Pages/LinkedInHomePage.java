package com.qa.LinkedIn.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.LinkedIn.Base.LinkedInBase;

public class LinkedInHomePage extends LinkedInBase{
	
	//HomePage Links
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement HomeLink;
	
	//Search Text Box
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	WebElement searchTextBox;
	
	//inilize the page factory
	public LinkedInHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Search a person
	public void SearchAPerson(){
		searchTextBox.sendKeys("Ayan Kumar Sinha");
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",searchTextBox);
		List<WebElement> searchName= driver.findElements(By.xpath("//h3[@class='actor-name-with-distance search-result__title "
				+ "single-line-truncate ember-view']//descendant:: span[@class='name actor-name']"));
		System.out.println(searchName.size());
		for(int i=0; i<=searchName.size();i++){
			String NamesFound= searchName.get(i).getText();
			System.out.println(NamesFound);
			
		}
		
		
		
		
	}
	
	
	

}
