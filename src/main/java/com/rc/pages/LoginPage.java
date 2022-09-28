package com.rc.pages;

import org.openqa.selenium.By;

import com.rc.enums.WaitStrategy;

public final class LoginPage extends BasePage{
	
	public final By textbox_username = By.id("username");
	public final By textbox_password = By.id("password");
	public final By btn_login = By.id("_submit");
	public final By Link_forgetpassword = By.xpath("//a[normalize-space()='Forgot Password']");
	public final By textbox_forgepassrod = By.name("username");

	
	public LoginPage enterUsername(String username)
	{
		
		sendKeys(textbox_username, username, WaitStrategy.PRESENSE, "Username Field");
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		sendKeys(textbox_password, password, WaitStrategy.PRESENSE, "Username Field");
		return this;
	}
	
	public LoginPage ClickonForgetPasswordLink()
	{
		click(Link_forgetpassword, WaitStrategy.CLICKABLE, "ForgetPassword Link");
		return this;
	}
	
	public LoginPage enterFrogetPassword(String username)
	{
		sendKeys(textbox_forgepassrod, username, WaitStrategy.PRESENSE, "ForgetPassword Textbox Field");
		return this;
	}
	
	public HomePage ClickLogin()
	{
		click(btn_login, WaitStrategy.CLICKABLE, "Reset button from Forgetpassword page");
		return new HomePage();
	}
	
	public String getTitle()
	{
		return getPageTitle();
	}
	
	
}
