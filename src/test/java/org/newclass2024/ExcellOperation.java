package org.newclass2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellOperation {
public static void main(String[] args)throws IOException {
	

	
	File f = new File("C:\\Users\\Asus\\eclipse-workspace\\"
			+ "MavenClassFeb2024\\excell file\\Book2.xlsx");
	
	FileInputStream stream = new FileInputStream(f);
	Workbook work = new XSSFWorkbook(stream);
	Sheet sheet = work.getSheet("sheet1");
	Row row = sheet.getRow(3);
	Cell cell = row.getCell(3);
//	System.out.println(cell);
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	System.out.println(physicalNumberOfRows);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//	System.out.println(physicalNumberOfCells);
	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
		Cell cell2 = row.getCell(i);
	//	System.out.println(cell2);
		
	}
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row2 = sheet.getRow(i);
		for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row2.getCell(j);
			//System.out.println(cell2);
			
			CellType cellType = cell2.getCellType();
		//	System.out.println(cellType);
			switch (cellType) {
			case STRING:
				String stringCellValue = cell2.getStringCellValue();
				
		System.out.println(stringCellValue);
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell2)) {
					
				
				Date dateCellValue = cell2.getDateCellValue();
				SimpleDateFormat s=new SimpleDateFormat("dd-MMM-YY");
				String format = s.format(dateCellValue);
				System.out.println(format);
				
				}
				else {	
				double numericCellValue = cell2.getNumericCellValue();
				long round = Math.round(numericCellValue);
				String valueOf = String.valueOf(round);
				System.out.println(valueOf);
				}
				break;
				
			default:
				break;
			}}			
				
		}}}
