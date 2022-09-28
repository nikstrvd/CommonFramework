package com.rc.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rc.pages.BasePage;
import com.rc.pages.DiscussionPage;
import com.rc.pages.HomePage;
import com.rc.pages.LoginPage;

public class DiscussionPageTest extends BaseTest {

	private DiscussionPageTest() {}
	
	BasePage bp = new BasePage();
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	DiscussionPage dp = new DiscussionPage();
	
	@Test
	public void DiscussionsAddNewComment(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		hp.ClickonDiscussionsSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");
		dp.ClickonListDotsButton().ClickonViewMoreButton().ClickonAddTextbox();
		bp.scroll();
		dp.enterNewComment(data.get("comment"))
		.ClickonAddCommentBtn();
	}
}
