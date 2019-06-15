package com.qa.LinkedIn.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkedInBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public LinkedInBase(){
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\PRAKARAN\\workspace\\LinkedInAutomation\\"
					+ "src\\main\\java\\com\\qa\\LinkedIn\\config\\config.properties");
			prop.load(ip);						
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public static void Initilize(){
		String browserName= prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//PRAKARAN//Downloads//chromedriver_win32//chromedriver.exe");
			driver= new ChromeDriver();		
		}else {
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
