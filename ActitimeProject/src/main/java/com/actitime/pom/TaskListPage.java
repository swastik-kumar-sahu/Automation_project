package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
   

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOption;
	
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description' ] ")
	private WebElement enterCustDescr;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement selectDropDown; 	
	
	
    @FindBy(xpath="//div[@class='itemRow selected']")
    private WebElement oCompany;
    
    @FindBy(xpath="//div[text()='Create Customer']")
    private WebElement createCustBtn;
    
    @FindBy(xpath="//div[@title='HDFC-001']")
    private WebElement actualCustCreated;

    
    public WebElement getActualCustCreated() {
		return actualCustCreated;
	}

	public TaskListPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustOption() {
		return newCustOption;
	}

	public WebElement getEnterCustTbx() {
		return enterCustTbx;
	}

	public WebElement getEnterCustDescr() {
		return enterCustDescr;
	}

	public WebElement getSelectDropDown() {
		return selectDropDown;
	}

	public WebElement getoCompany() {
		return oCompany;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
    
}
