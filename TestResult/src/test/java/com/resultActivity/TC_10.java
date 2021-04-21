package com.resultActivity;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tr.generic.Base;

	@Listeners(com.tr.generic.ExtentReport.class)
	public class TC_10 extends Base {
		@Test
		public void getResult10() throws Throwable
		{
			final long sec=System.currentTimeMillis();

			if(sec%2==0)
			{
				String result="pass";
				excel.setExcelData("Sheet1", 10, 1,TC_10.class.getSimpleName(),result);
			}
			else
			{
				String result1="Fail";
				excel.setExcelData("Sheet1", 10, 1,TC_10.class.getSimpleName(),result1);
			}
		}
	}
