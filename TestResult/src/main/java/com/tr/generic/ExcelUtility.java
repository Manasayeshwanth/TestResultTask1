package com.tr.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public void setExcelData(String SheetName,int rowNum,int colNum,String tcName,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(PathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		sh.createRow(rowNum).createCell(0).setCellValue(tcName);
		Row row = sh.getRow(rowNum);
		Cell col = row.createCell(colNum);
		col.setCellValue(data);
		FileOutputStream fout=new FileOutputStream(PathConstant.excelPath);
		wb.write(fout);
		wb.close();
	}
	
	public void setExcelData(String SheetName,int rowNum,int colNum,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(PathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(rowNum);
		Cell col = row.createCell(colNum);
		col.setCellValue(data);
		FileOutputStream fout=new FileOutputStream(PathConstant.excelPath);
		wb.write(fout);
		wb.close();
	}
	

	

}
