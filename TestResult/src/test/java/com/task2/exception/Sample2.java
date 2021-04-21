package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample2  extends Base{

	@Test
	public void getNoSuchElement() throws Throwable
	{
		try
		{		
			WebDriver driver=new ChromeDriver();	
			driver.get("http://www.google.com");
			driver.findElement(By.xpath("//input[@type='txt']"));
		}
		catch(Exception e){

			String st=e.toString();
			excel.setExcelData("Sheet2",2,1,Sample2.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	

}




