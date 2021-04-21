package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample4 extends Base {
	@Test
	public void getUnsupportedOperationException() throws Throwable
	{
		try{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("day"));
		Select s=new Select(ele);
		s.deselectByIndex(2);
		}
		catch(Exception e){

			String st=e.toString();
			excel.setExcelData("Sheet2",4,1,Sample4.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}
