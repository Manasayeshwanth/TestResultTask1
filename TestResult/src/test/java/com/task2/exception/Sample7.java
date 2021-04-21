package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample7 extends Base {
	@Test
	public void getStaleReferenceException() throws Throwable
	{
		try{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.click();
		
		
	}
		catch(Exception e){
			String st=e.toString();
			excel.setExcelData("Sheet2",7,1,Sample7.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}