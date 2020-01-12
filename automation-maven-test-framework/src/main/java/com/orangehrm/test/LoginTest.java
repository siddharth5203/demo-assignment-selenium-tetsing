package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.comman.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseSelenium{

	@Test
	public void verifyValidUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.login("admin", "admin").verifyWelComeText("Welcome Admin");
	
		//add commit 1
		//add commit 2
		//add commit 3
		//add commit 4
	}
}
