package com.task2.exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample1 extends Base{

	@Test
	public void getInvalidArgument() throws Throwable
	{
		try
		{		
			WebDriver driver=new ChromeDriver();	
			driver.get("youtube.com");
		}

		catch(Exception e){
			
			String st=e.toString();
			excel.setExcelData("Sheet2",1,1,Sample1.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}

}
