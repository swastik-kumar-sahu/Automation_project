package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgOut;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskTab;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void setLogOut()
    {
    	lgOut.click();
    }
    public void setTaskList() 
    {
        taskTab.click();	
    }
  

}
