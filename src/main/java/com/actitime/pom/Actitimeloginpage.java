package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BaseTest;


public class Actitimeloginpage extends BaseTest implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;

	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;

	@FindBy(id="keepLoggedInLabel")
	private WebElement keepmeloggedInCheckbox;

	@FindBy(id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;

	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeinclink;


	 public Actitimeloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
	 public void loginMethod() throws InterruptedException
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedInCheckbox.click();
		loginButton.click();
		Thread.sleep(5000);
	}
	 public void forgotyourpasswordMethod()
	{
		forgotyourpasswordLink.click();
	}

	 public void actitimeincMethod()
	{
		actitimeinclink.click();
	}
	}
		


