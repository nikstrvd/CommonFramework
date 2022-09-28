package com.rc.pages;

import org.openqa.selenium.By;

import com.rc.enums.WaitStrategy;

public final class DiscussionPage extends BasePage{
	
	private final By Listdots = By.xpath("(//a[@data-toggle='dropdown'])[3]");
	private final By ViewMorebtn = By.xpath("(//a[@class='link'][normalize-space()='View More'])[1]");
	private final By ClickonAddtextbox = By.xpath("(//div[@class='comment-holder'])[1]");
	private final By Commenttextbox = By.xpath("(//trix-editor[@id='appbundle_discussion_comment'])[1]");
	private final By Addcommentbtn = By.xpath("//button[normalize-space()='Add This Comment']");
	
	public DiscussionPage ClickonListDotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "Click on List Dots Button");
		return this;
	}
	
	public DiscussionPage ClickonViewMoreButton()
	{
		click(ViewMorebtn, WaitStrategy.CLICKABLE, "Click on ViewMore Button");
		return this;
	}
	
	public DiscussionPage ClickonAddTextbox()
	{
		click(ClickonAddtextbox, WaitStrategy.CLICKABLE, "Click on ClickonAddtextbox Button");
		return this;
	}
	
	public DiscussionPage enterNewComment(String comment)
	{
		
		sendKeys(Commenttextbox, comment, WaitStrategy.PRESENSE, "Commenttextbox Field");
		return this;
	}
	
	public DiscussionPage ClickonAddCommentBtn()
	{
		click(Addcommentbtn, WaitStrategy.CLICKABLE, "Click on Addcommentbtn Button");
		return this;
	}

}
