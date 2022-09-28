package com.rc.pages;

import org.openqa.selenium.By;

import com.rc.enums.WaitStrategy;

public class ProjectDetailsPage extends BasePage {

	private final By ProjectDetailsTab = By.xpath("//span[@class='hidden-xs'][normalize-space()='Project Details']"); 
	private final By ProjectNametxt = By.xpath("(//input[@id='appbundle_project_projectName'])[1]");
	private final By ProjectWebsitetxt = By.xpath("(//input[@id='appbundle_project_projectUrl'])[1]");
	private final By Nametxt = By.xpath("(//input[@id='appbundle_project_representativeName'])[1]");
	
	private final By GeneralInfoTab = By.xpath("(//span[normalize-space()='General Information'])[1]"); 
	private final By Industrytxt = By.xpath("(//input[@id='appbundle_project_businessIndustry'])[1]"); 
	private final By Servicetxt = By.xpath("(//input[@id='appbundle_project_servicesOffer'])[1]"); 
	private final By Headquartertxt = By.xpath("(//input[@id='appbundle_project_businessHeadquarter'])[1]"); 
	private final By AboutBusinesstxt = By.xpath("(//textarea[@id='appbundle_project_aboutBusiness'])[1]"); 
	
	
	private final By SeoInfoTab = By.xpath("(//span[normalize-space()='SEO Information'])[1]"); 
	private final By Website1 = By.xpath("(//input[@placeholder='Type website here'])[1]");
	private final By Website2 = By.xpath("(//input[@placeholder='Type website here'])[2]");
	private final By Website3 = By.xpath("(//input[@placeholder='Type website here'])[3]");
	private final By Keywords = By.xpath("(//input[@id='appbundle_project_optimizeKeywords'])[1]");
	private final By Share = By.xpath("(//input[@id='appbundle_project_anythingShare'])[1]");
	
	
	private final By TrackingTab = By.xpath("(//span[normalize-space()='Tracking'])[1]");
	private final By Analytics = By.xpath("(//label[@for='appbundle_project_googleAnalyticsAccess_0'])[1]"); 
	private final By Console = By.xpath("(//label[@for='appbundle_project_googleSearchConsole_1'])[1]"); 
	private final By Manager = By.xpath("(//label[@for='appbundle_project_googleMyBusiness_0'])[1]"); 
	
	private final By Update = By.xpath("(//button[normalize-space()='Update'])[1]");
	
	public ProjectDetailsPage ClickonUpdate()
	{
		click(Update, WaitStrategy.CLICKABLE, "Click on Update button");
		return this;
	}
	
	public ProjectDetailsPage ClickonProjectDetailsTab()
	{
		click(ProjectDetailsTab, WaitStrategy.CLICKABLE, "Click on ProjectDetailsTab");
		return this;
	}
	
	public ProjectDetailsPage enterProjectName(String projectname)
	{
		clear(ProjectNametxt, projectname, WaitStrategy.PRESENSE, "ProjectNametxt Field");
		sendKeys(ProjectNametxt, projectname, WaitStrategy.PRESENSE, "ProjectNametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterProjectWebsite(String projectwebsite)
	{
		clear(ProjectWebsitetxt, projectwebsite, WaitStrategy.PRESENSE, "ProjectWebsitetxt Field");
		sendKeys(ProjectWebsitetxt, projectwebsite, WaitStrategy.PRESENSE, "ProjectWebsitetxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterName(String name)
	{
		clear(Nametxt, name, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Nametxt, name, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	
	public ProjectDetailsPage ClickonGeneralInfoTab()
	{
		click(GeneralInfoTab, WaitStrategy.CLICKABLE, "Click on GeneralInfoTab");
		return this;
	}
	
	public ProjectDetailsPage enterIndustry(String industry)
	{
		clear(Industrytxt, industry, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Industrytxt, industry, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterService(String service)
	{
		clear(Servicetxt, service, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Servicetxt, service, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterHeadquarter(String headquarter)
	{
		clear(Headquartertxt, headquarter, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Headquartertxt, headquarter, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterAboutBusiness(String aboutbusiness)
	{
		clear(AboutBusinesstxt, aboutbusiness, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(AboutBusinesstxt, aboutbusiness, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage ClickonSEOInfoTab()
	{
		click(SeoInfoTab, WaitStrategy.CLICKABLE, "Click on SeoInfoTab");
		return this;
	}
	
	public ProjectDetailsPage enterWebsite1(String website1)
	{
		clear(Website1, website1, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Website1, website1, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterWebsite2(String website2)
	{
		clear(Website2, website2, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Website2, website2, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterWebsite3(String website3)
	{
		clear(Website3, website3, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Website3, website3, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterKeywords(String keywords)
	{
		clear(Keywords, keywords, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Keywords, keywords, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	public ProjectDetailsPage enterShare(String share)
	{
		clear(Share, share, WaitStrategy.PRESENSE, "Nametxt Field");
		sendKeys(Share, share, WaitStrategy.PRESENSE, "Nametxt Field");
		return this;
	}
	
	
	
	public ProjectDetailsPage ClickonTrackingTab()
	{
		click(TrackingTab, WaitStrategy.CLICKABLE, "Click on TrackingTab");
		return this;
	}
	
	public ProjectDetailsPage ClickAnalytics()
	{
		click(Analytics, WaitStrategy.CLICKABLE, "Click on Analytics");
		return this;
	}
	
	public ProjectDetailsPage ClickonConsole()
	{
		click(Console, WaitStrategy.CLICKABLE, "Click on Console");
		return this;
	}
	
	public ProjectDetailsPage ClickonManager()
	{
		click(Manager, WaitStrategy.CLICKABLE, "Click on Manager");
		return this;
	}
	
}
