package com.resultActivity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tr.generic.Base;


@Listeners(com.tr.generic.ExtentReport.class)
public class TC_6 extends Base {
	
	@Test
	public void getResult6() throws Throwable
	{
		final long sec=System.currentTimeMillis();

		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 6, 1,TC_6.class.getSimpleName(),result);
		}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 6, 1,TC_6.class.getSimpleName(),result1);
		}
		
		try{
			Thread t = new Thread();
	        Thread t1 = new Thread();
	        t.setPriority(7); // Correct
	        t1.setPriority(18); // Exception
			}
			catch(Exception e)
			{
				String st=e.toString();
				excel.setExcelData("Sheet1",6,2,st);
			}

	}
}
