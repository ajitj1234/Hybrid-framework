package Keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datainput {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void input(String path, int sheetnum) throws IOException {
		
		File file1 = new File(path);
		FileInputStream inputStream1 = new FileInputStream(file1);
		workbook = new XSSFWorkbook(inputStream1);
		 
		sheet = workbook.getSheetAt(sheetnum);
				
	}
	
	public static String getdata(int rownum, int cellnum) throws IOException {
					
			String str = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
			System.out.println(str);
			
			return str;
	}
	
}
