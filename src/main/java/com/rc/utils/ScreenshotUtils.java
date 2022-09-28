package com.rc.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rc.driver.DriverManager;

public final class ScreenshotUtils {
	
	private ScreenshotUtils()
	{
		
	}
	
	public static String getBase64Image()
	{
		return ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

}
