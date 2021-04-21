package com.task2.exception;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample6 extends Base {
	@Test
	public void getNoAlertPresent() throws Throwable
	{
		try{
			WebDriver driver=new ChromeDriver();	
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			driver.findElement(By.name("cusid")).sendKeys("hello");
			driver.findElement(By.name("submit")).click();
			Alert a=driver.switchTo().alert();
			a.accept();
			a.dismiss();
		
		}

		catch(Exception e){
			String st=e.toString();
			excel.setExcelData("Sheet2",6,1,Sample6.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}
