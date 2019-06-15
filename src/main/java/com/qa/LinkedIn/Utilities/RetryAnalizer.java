package com.qa.LinkedIn.Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer implements IRetryAnalyzer {
	
	int counter= 0;
	int retryLimit= 2;
	
	public boolean retry(ITestResult results){
		if(counter < retryLimit){
			counter++;
			return true;
		}
		return false;
		
	}

}
