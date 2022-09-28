package com.rc.pages;

import org.openqa.selenium.By;

import com.rc.enums.WaitStrategy;

public class TasksPage extends BasePage {
	
	private final By Listdots = By.xpath("(//img)[8]");
	private final By ViewDetailsbtn = By.xpath("(//a[@class='link tooltipstered'][normalize-space()='View Details'])[1]");
	private final By ClickonAddtextbox = By.xpath("(//div[@class='comment-holder'])[1]");
	private final By Commenttextbox = By.xpath("(//trix-editor[@id='appbundle_taskcomment_comment'])[1]");
	private final By Addcommentbtn = By.xpath("(//button[normalize-space()='Add Comment'])[1]");
	
	public TasksPage ClickonListDotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "Click on List Dots Button");
		return this;
	}
	
	public TasksPage ClickonViewMoreButton()
	{
		click(ViewDetailsbtn, WaitStrategy.CLICKABLE, "Click on ViewMore Button");
		return this;
	}
	
	public TasksPage ClickonAddTextbox()
	{
		click(ClickonAddtextbox, WaitStrategy.CLICKABLE, "Click on ClickonAddtextbox Button");
		return this;
	}
	
	public TasksPage enterNewComment(String comment)
	{
		
		sendKeys(Commenttextbox, comment, WaitStrategy.PRESENSE, "Commenttextbox Field");
		return this;
	}
	
	public TasksPage ClickonAddCommentBtn()
	{
		click(Addcommentbtn, WaitStrategy.CLICKABLE, "Click on Addcommentbtn Button");
		return this;
	}
}
