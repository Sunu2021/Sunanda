package com.actitime.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.Actitimeloginpage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest implements AutoConstant
{
public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	@BeforeMethod
	public void loginapp() throws InterruptedException
	{
		Actitimeloginpage log=new Actitimeloginpage(driver);
		log.loginMethod();
		Thread.sleep(6000);
	}
	@AfterMethod
	public void logoutfromapp() throws InterruptedException 
	{
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}

	}


