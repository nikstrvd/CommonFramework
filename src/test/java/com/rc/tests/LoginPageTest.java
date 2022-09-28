package com.rc.tests;

import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rc.pages.HomePage;
import com.rc.pages.LoginPage;

public final class LoginPageTest extends BaseTest {
	
	private LoginPageTest()
	{
		
	}
	
	@Test
	public void LoginLogoutTest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
	}

	@DataProvider(name="LoginTestDataProvider", parallel=true)
	public Object [][] getData()
	{	
		return new Object[][]
		{
			{"nikhil@2stallions.com", ""},
			{"nikhil@2stallions.com", "      "},
			{"nikhil@2stallions.com", "12345632"},
			{"", "123456"},
			{"      ", "123456"},
			{"test@test.com", "123456"},
			{"nikhil@2stallions.com", "2St@llions"}
		};

}
}
