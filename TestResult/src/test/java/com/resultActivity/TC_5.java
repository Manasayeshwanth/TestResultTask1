package com.resultActivity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tr.generic.Base;

@Listeners(com.tr.generic.ExtentReport.class)
public class TC_5 extends Base  {
	
@Test
	public void getResult5() throws Throwable
	{
		final long sec=System.currentTimeMillis();

		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 5, 1,TC_5.class.getSimpleName(),result);
		}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 5, 1,TC_5.class.getSimpleName(),result1);
		}
		
		try{
			int num = Integer.parseInt("Java");
			  
            System.out.println(num);
			}
			catch(Exception e)
			{
				String st=e.toString();
				excel.setExcelData("Sheet1",5,2,st.substring(0,st.indexOf(":")));}

	}
}



