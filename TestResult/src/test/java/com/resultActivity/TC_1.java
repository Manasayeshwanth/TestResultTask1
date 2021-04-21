package com.resultActivity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.tr.generic.Base;

@Listeners(com.tr.generic.ExtentReport.class)
public class TC_1 extends Base {
	@Test
	public void getResult() throws Throwable
	{
		final long sec=System.currentTimeMillis();

		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 1, 1,TC_1.class.getSimpleName(),result);
				}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 1, 1,TC_1.class.getSimpleName(),result1);
					
		}
		
		try{
			int i=1/0;
		}
		catch(Exception e)
		{


		}
	
		
	}
}