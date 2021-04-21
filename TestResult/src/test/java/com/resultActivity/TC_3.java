package com.resultActivity;

import java.io.File;
import java.io.FileReader;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tr.generic.Base;

@Listeners(com.tr.generic.ExtentReport.class)
public class TC_3 extends Base {
	@Test
	public void getResult3() throws Throwable
	{
		final long sec=System.currentTimeMillis();

		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 3, 1,TC_3.class.getSimpleName(),result);
		}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 3, 1,TC_3.class.getSimpleName(),result1);
		}
		
		try{
			File f=new File("C://abc.txt");
			FileReader fr=new FileReader(f);
		}
		catch(Exception e)
		{
			String st=e.toString();
			excel.setExcelData("Sheet1",3,2,st.substring(0,st.indexOf(":")));
		}
	}
	
}
