package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base {
	
	public static DataFormatter formatter = new DataFormatter();

	public static  String[][] getData() {
		String[][] dataone = null;
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Excel.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(0);
			int roeNum = sheet.getPhysicalNumberOfRows();
			int Cellresult = row.getLastCellNum();
			 dataone = new String[roeNum-1][Cellresult];
			for (int i = 0; i < roeNum-1; i++) {
				Row row1 = sheet.getRow(i+1);	
				for (int j = 0; j < Cellresult; j++) {
					if (row1 == null) {
						dataone[i][j]="";
					}else {
						Cell cell = row1.getCell(j);
						if(cell==null) {
							dataone[i][j]="";
						}else {
							String value = formatter.formatCellValue(cell);
							dataone[i][j]=value;
						}	
					}			
					
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dataone;
		
		
	}
	

}
