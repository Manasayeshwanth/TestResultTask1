package com.resultActivity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tr.generic.Base;

@Listeners(com.tr.generic.ExtentReport.class)
public class TC_2 extends Base {
	
	@Test
	public void getResult2() throws Throwable
	{
		final long sec=System.currentTimeMillis();

		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 2, 1,TC_2.class.getSimpleName(),result);
		}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 2, 1,TC_2.class.getSimpleName(),result1);
		}
		
		try{
			int[] arr=new int[2];
			arr[3]=20;
		}
		catch(Exception e)
		{
			String st=e.toString();
			excel.setExcelData("Sheet1",2,2,st.substring(0,st.indexOf(":")));
		}
	}
}
