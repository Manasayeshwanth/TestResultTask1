package com.resultActivity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tr.generic.Base;

@Listeners(com.tr.generic.ExtentReport.class)
public class TC_4 extends Base {
	@Test
	public void getResult4() throws Throwable
	{
		final long sec=System.currentTimeMillis();

		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 4, 1,TC_4.class.getSimpleName(),result);
		}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 4, 1,TC_4.class.getSimpleName(),result1);
		}
		
		try{
		 String st=null;
		 System.out.println(st.charAt(0));
		}
		catch(Exception e)
		{
			String st=e.toString();
			excel.setExcelData("Sheet1",4,2,st);
		}
	}
}
