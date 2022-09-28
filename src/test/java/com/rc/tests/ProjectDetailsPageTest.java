package com.rc.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rc.pages.BasePage;
import com.rc.pages.HomePage;
import com.rc.pages.LoginPage;
import com.rc.pages.ProjectDetailsPage;

public class ProjectDetailsPageTest extends BaseTest {
	
	private ProjectDetailsPageTest() {}
	
	BasePage bp = new BasePage();
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	ProjectDetailsPage pd = new ProjectDetailsPage();
	
	@Test
	public void ProjectDetailsTabTest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		hp.ClickonProjectDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");
		pd.ClickonProjectDetailsTab().enterProjectName(data.get("projectname")).enterProjectWebsite(data.get("projectwebsite")).enterName(data.get("name"));
		bp.scroll();
		pd.ClickonUpdate();
	}
	
	@Test
	public void GeneralDetailsTabTest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		hp.ClickonProjectDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");
		pd.ClickonGeneralInfoTab().enterIndustry(data.get("industry")).enterService(data.get("service"));
		bp.scroll();
		pd.enterHeadquarter(data.get("headquarter")).enterAboutBusiness(data.get("aboutbusiness")).ClickonUpdate();
	}
	
	@Test
	public void SEODetailsTabTest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		hp.ClickonProjectDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");
		pd.ClickonSEOInfoTab().enterWebsite1(data.get("website1")).enterWebsite2(data.get("website2")).enterWebsite3("website3");
		bp.scroll();
		pd.enterShare(data.get("share")).ClickonUpdate();
	}
	
	@Test
	public void TrackingTabTest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		hp.ClickonProjectDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");
		pd.ClickonTrackingTab().ClickAnalytics().ClickonConsole().ClickonManager();
		bp.scroll();
		pd.ClickonUpdate();
	}

}
