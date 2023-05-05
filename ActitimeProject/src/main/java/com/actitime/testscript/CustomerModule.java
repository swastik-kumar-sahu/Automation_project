package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import com.actitime.generics.*;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCutomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("createCustomer",true);
		FileLib f=new FileLib();
		 String custName = f.getExcelData("CreateCustomer", 1, 2);
		 String custDescription = f.getExcelData("createcustomer", 1, 3); 
	EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
	e.setTaskList();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustOption().click();
	Thread.sleep(3000);
	t.getEnterCustTbx().sendKeys(custName);
	t.getEnterCustDescr().sendKeys(custDescription);
	Thread.sleep(3000);
	t.getSelectDropDown().click();
	Thread.sleep(3000);
    t.getoCompany().click();
    Thread.sleep(3000);
	t.getCreateCustBtn().click();
	String actualCustomer = t.getActualCustCreated().getText(); 
    org.testng.Assert.assertEquals(actualCustomer,custName );
	
	}
	
}




