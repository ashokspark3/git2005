package org.newclass2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellFileOperation2 {
public static void main(String[] args) throws IOException {
	
	File file= new File("C:\\Users\\Asus\\eclipse-workspace\\"
			+ "MavenClassFeb2024\\excell file\\Book2.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook work= new XSSFWorkbook(stream);
	Sheet sheet = work.getSheet("sheet1");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row2 = sheet.getRow(i);
		for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row2.getCell(j);
			System.out.println(cell2);
			CellType cellType = cell2.getCellType();
			System.out.println(cellType);
			
//				double numericCellValue = cell2.getNumericCellValue();
//				long l=(long) (numericCellValue);
//				String valueOf = String.valueOf(l);
//				System.out.println(valueOf);
			}
			
		}
		
	}
	
	
	
	
	
	
}
	
	

