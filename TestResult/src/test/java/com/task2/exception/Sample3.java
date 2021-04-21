package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample3 extends Base{
	@Test
	public void getElementNotInteractable() throws Throwable
	{
		try{
		WebDriver driver=new ChromeDriver();	
		driver.get("file:///C:/Users/ADMIN/Desktop/Disable.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
	}
		catch(Exception e){

			String st=e.toString();
			excel.setExcelData("Sheet2",3,1,Sample3.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}







