package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample5 extends Base {
	@Test
	public void getInvalidSelectorExp() throws Throwable
	{
		try{
			WebDriver driver=new ChromeDriver();	
			driver.get("https://login.yahoo.com/");
			driver.findElement(By.xpath("//label[contains(text(),'Stay signed in')")).click();
		}
		catch(Exception e){

			String st=e.toString();
			excel.setExcelData("Sheet2",5,1,Sample5.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}
