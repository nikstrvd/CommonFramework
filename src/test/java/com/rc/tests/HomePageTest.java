package com.rc.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rc.pages.BasePage;
import com.rc.pages.HomePage;
import com.rc.pages.LoginPage;


public final class HomePageTest extends BaseTest{
	
	private HomePageTest()
	{
		
	}
	
	BasePage bp = new BasePage();
	LoginPage lp = new LoginPage();

	@Test
	public void DashboardMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonDashboardSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void DiscussionsMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonDiscussionsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void ProjectDetailsMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonProjectDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void TasksMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonTasksSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void FilesMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonFilesSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void BillingInvoicesMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonBillingDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void UsersMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonUsersDetailsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void NotificationsMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonNotificationsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
	@Test
	public void LogoutMenutest(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		new HomePage().ClickonLogoutSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");	
	}
	
}
