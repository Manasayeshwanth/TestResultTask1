package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample9 extends Base {
	@Test
	public void getNoSuchAttributeException() throws Throwable
	{
		try{
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		String title=ele.getAttribute(" ");
		System.out.println(title);
	}
		catch(Exception e){

			String st=e.toString();
			excel.setExcelData("Sheet2",9,1,Sample9.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}


