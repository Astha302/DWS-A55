package org.automation.generic_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderClass
{
	@org.testng.annotations.DataProvider(name = "register data Provider")
	public String[][] registerDataProvider()
	{
		File  f = new File("./Test Data/DWS.xlsx");
		FileInputStream fis  = null;
		try
		{
			fis = new FileInputStream(f);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Workbook wb = null;
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Sheet sheet = wb.getSheet("Sheet1");
				int rowCount = sheet.getPhysicalNumberOfRows();
				int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
				String [][] arr = new String[rowCount-1][cellCount];
				
				for(int i  = 0 ; i<rowCount; i++)
				{
					for(int j = 0; j <cellCount ;j++)
					{
						arr[i-j][j] = sheet.getRow(i).getCell(j).toString();
					}
				}
				
				for(int i = 0 ; i <arr.length ; i++)
				{
					System.out.println(Arrays.toString(arr[i]));
				}
				
				return arr;
	}

}
