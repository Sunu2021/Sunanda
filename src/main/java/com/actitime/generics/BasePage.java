package com.actitime.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage 
{
	public void selectbyvisbletext(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel1=new Select(element);
		sel1.selectByValue(value);
	}
	public void selectbyindex(WebElement element,int index)
	{
		Select sel2=new Select(element);
		sel2.selectByIndex(index);
	}
	public void deselectbyvisbletext(WebElement element, String text)
	{
		Select desel=new Select(element);
		desel.selectByVisibleText(text);
	}
	public void deselectbyvalue(WebElement element,String value)
	{
		Select desel1=new Select(element);
		desel1.selectByValue(value);
	}
	public void deselectbyindex(WebElement element,int index)
	{
		Select desel2=new Select(element);
		desel2.selectByIndex(index);
	}
	public void deselectall(WebElement element)
	{
		Select all=new Select(element);
		all.deselectAll();
	}
	public boolean ismultiple(WebElement element)
	{
		return false;
	
	}
	public void movetoelement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		act.moveToElement(element).dragAndDrop(element,element);
		act.moveToElement(element).click();
		act.moveToElement(element).doubleClick();
		act.moveToElement(element).contextClick();
		act.moveToElement(element).moveToElement(element);
		act.moveToElement(element).clickAndHold();
		act.moveToElement(element).release();
	}
	public void robotenter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	
	public void alertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void javascriptclick(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void validatetext(WebElement element , String expectedtext)
	{
		String actualText=element.getText();
		String expectedText=expectedtext;
		Assert.assertEquals(actualText, expectedText);
	}	
	
	public void validatetitle(WebDriver driver,String expectedtitle)
	{
		String actualTitle=driver.getTitle();
		String expectedTitle=expectedtitle;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}


