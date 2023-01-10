package com.actitime.test;

import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.Actitimeloginpage;
public class Actitimeloginlogout extends BaseTest
{
	@Test
	public void loginlogout() throws InterruptedException
	{
		Actitimeloginpage login=new Actitimeloginpage(driver);
		login.loginMethod();
		
		ActitimeHomePage logout=new ActitimeHomePage(driver);
		logout.logoutMethod();
	}
	}


