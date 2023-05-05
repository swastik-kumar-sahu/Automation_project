package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./data/p.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
{
FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
return data;

}
}
