package com.rc.pages;

import org.openqa.selenium.By;

import com.rc.enums.WaitStrategy;

public final class HomePage extends BasePage{
	
	private final By Click_profile = By.xpath("//img[@alt='user-img']");
	private final By logout_text = By.xpath("(//a[normalize-space()='Logout'])[1]");
	private final By Dashboard = By.xpath("//*[@id='sidebar-menu']//child::li[2]");
	private final By Discussions = By.xpath("//*[@id='sidebar-menu']//child::li[3]");
	private final By ProjectDetails= By.xpath("//*[@id='sidebar-menu']//child::li[4]");
	private final By Tasks = By.xpath("//*[@id='sidebar-menu']//child::li[5]");
	private final By Files = By.xpath("//*[@id='sidebar-menu']//child::li[6]");
	private final By BillingDetails = By.xpath("//*[@id='sidebar-menu']//child::li[8]");
	private final By Users = By.xpath("//*[@id='sidebar-menu']//child::li[9]");
	private final By Notifications = By.xpath("//*[@id='sidebar-menu']//child::li[10]");
	private final By Logout = By.xpath("//*[@id='sidebar-menu']//child::li[11]");
	
	
	public HomePage ClickonProfile()
	{		
		click(Click_profile, WaitStrategy.CLICKABLE, "Click on Profile Button");
		return this;
	}
	
	public LoginPage ClickonLogout()
	{
		click(logout_text, WaitStrategy.CLICKABLE, "Click on Logout Button");
		return new LoginPage();
	}
	
	public HomePage ClickonDashboardSideMenu()
	{
		click(Dashboard, WaitStrategy.CLICKABLE, "Click on Dashboard SideMenu Button");
		return this;
	}
	
	public DiscussionPage ClickonDiscussionsSideMenu()
	{
		click(Discussions, WaitStrategy.CLICKABLE, "Click on Discussion SideMenu Button");
		return new DiscussionPage();
	}
	
	public ProjectDetailsPage ClickonProjectDetailsSideMenu()
	{
		click(ProjectDetails, WaitStrategy.CLICKABLE, "Click on Project Details SideMenu Button");
		return new ProjectDetailsPage();
	}
	
	public TasksPage ClickonTasksSideMenu()
	{
		click(Tasks, WaitStrategy.CLICKABLE, "Click on Tasks SideMenu Button");
		return new TasksPage();
	}
	
	public FilesPage ClickonFilesSideMenu()
	{
		click(Files, WaitStrategy.CLICKABLE, "Click on Files SideMenu Button");
		return new FilesPage();
	}
	
	public BillingPage ClickonBillingDetailsSideMenu()
	{
		click(BillingDetails, WaitStrategy.CLICKABLE, "Click on Billing Details SideMenu Button");
		return new BillingPage();
	}
	
	public UsersPage ClickonUsersDetailsSideMenu()
	{
		click(Users, WaitStrategy.CLICKABLE, "Click on User Details SideMenu Button");
		return new UsersPage();
	}
	
	public NotificationsPage ClickonNotificationsSideMenu()
	{
		click(Notifications, WaitStrategy.CLICKABLE, "Click on Notification SideMenu Button");
		return new NotificationsPage();
	}
	
		public LoginPage ClickonLogoutSideMenu()
	{
		click(Logout, WaitStrategy.CLICKABLE, "Click on Logout SideMenu Button");
		return new LoginPage();
	}

}
