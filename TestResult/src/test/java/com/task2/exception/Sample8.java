package com.task2.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tr.generic.Base;

public class Sample8 extends Base {
	@Test
	public void getTimeOutException() throws Throwable
	{
		try{
		WebDriver driver=new ChromeDriver();	
		driver.get("http://localhost:8888/index.php");
	  driver.findElement(By.name("user_name")).sendKeys("admin");
	  driver.findElement(By.name("user_password")).sendKeys("admin");
	  driver.findElement(By.id("submitButton")).click();
	  WebDriverWait wait=new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.titleContains("signout"));
	  
	  }
		catch(Exception e){
			String st=e.toString();
			excel.setExcelData("Sheet2",8,1,Sample8.class.getSimpleName(),st.substring(0,st.indexOf(":")));
		}
	}	
}