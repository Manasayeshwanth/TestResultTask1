package com.resultActivity;



import org.testng.annotations.Test;

import com.tr.generic.Base;

public class TC_7 extends Base {
	@Test
	public void getResult7() throws Throwable

	{
		final long sec=System.currentTimeMillis();
	
		if(sec%2==0)
		{
			String result="pass";
			excel.setExcelData("Sheet1", 7, 1,TC_7.class.getSimpleName(),result);
		}
		else
		{
			String result1="Fail";
			excel.setExcelData("Sheet1", 7, 1,TC_7.class.getSimpleName(),result1);
		}

	}	
}