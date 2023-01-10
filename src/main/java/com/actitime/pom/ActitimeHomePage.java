package com.actitime.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseTest;

public class ActitimeHomePage extends BaseTest
{
	public WebDriver driver;
	@FindBy(xpath="(//div[.='Switch to actiPLANS'])[2]")
	private WebElement SwitchtoactiPLANSTextfield;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement TimeTrackTextfield;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement TasksTextfield;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement ReportsTextfield;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement UsersTextfield;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement CalendersTextfield;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement SettingsTextfield;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement IntegrationsTextfield;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement HelpandsupportTextfield;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement LogoutLink;
	
	@FindBy(xpath="//div[@class='supportQuestionButton']")
	private WebElement tooltip;
	
	public ActitimeHomePage(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		Thread.sleep(4000);
	}
		
	public void settingsMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",SettingsTextfield);
	}
	public void logoutMethod()
	{
		LogoutLink.click();
	}
	public void taskMethod()
	{
		TasksTextfield.click();

		
	}
	
}
