package org.newclass2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateAndCreatExcell {

	public static void main(String[] args) throws  IOException {
		
		
		
		
		
		File f=new File("C:\\Users\\Asus\\eclipse-workspace\\"
				+ "MavenClassFeb2024\\excell file\\Book3.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s = w.createSheet("data");
		Row r = s.createRow(3);
		Cell c = r.createCell(3);
		c.setCellValue("ashok");
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		File fi=new File("C:\\Users\\Asus\\eclipse-workspace\\"
				+ "MavenClassFeb2024\\excell file\\Book2.xlsx");
		FileInputStream st= new FileInputStream(fi);
		Workbook w1= new XSSFWorkbook(st);
		Sheet sheet = w1.getSheet("sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		String scv = cell.getStringCellValue();
		
		if (scv.equals("police")) {
			cell.setCellValue("ashok");
			
		}
		FileOutputStream fo= new FileOutputStream(fi);
		w1.write(fo);
	}
}
