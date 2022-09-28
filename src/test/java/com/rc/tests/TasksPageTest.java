package com.rc.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rc.pages.BasePage;
import com.rc.pages.HomePage;
import com.rc.pages.LoginPage;
import com.rc.pages.TasksPage;

public class TasksPageTest extends BaseTest {
	
	private TasksPageTest() {}
	
	BasePage bp = new BasePage();
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TasksPage tp = new TasksPage();
	
	@Test
	public void TasksAddNewComment(Map<String, String> data)
	{
		HomePage title = lp.enterUsername(data.get("username")).enterPassword(data.get("password")).ClickLogin();
		hp.ClickonTasksSideMenu();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "RankChutney - Project Management");
		tp.ClickonListDotsButton().ClickonViewMoreButton().ClickonAddTextbox();
		bp.scroll();
		tp.enterNewComment(data.get("comment"))
		.ClickonAddCommentBtn();
	}

}
