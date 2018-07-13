package HybridNew;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getdatainput {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	XSSFRow row;
    public static String input(String path,int sheetnum,int rownum,int cellnum) throws IOException {
		File testscript=new File(path);
		FileInputStream fis = new FileInputStream(testscript);
		wb= new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(sheetnum);
		String data=sheet.getRow(rownum).getCell(cellnum).toString();
		return data;
	}
    
    public static String objectrepo(int sheetno,int rnum,int cnum) throws IOException {
    	String path1="D:\\Auto input\\SecondHybridInput\\OR.xlsx";
    	File repo=new File(path1);
		FileInputStream fis1 = new FileInputStream(repo);
		wb=new XSSFWorkbook(fis1);
		sheet=wb.getSheetAt(sheetno);
		String data1=sheet.getRow(rnum).getCell(cnum).getStringCellValue();
		return data1;
	}
    
    public static String testplan(int sheetnumber,int rownumber,int cellnumber) throws IOException {
    	String path2="D:\\Auto input\\SecondHybridInput\\TestPlan.xlsx";
    	File plan = new File(path2);
    	FileInputStream fis2=new FileInputStream(plan);
    	wb=new XSSFWorkbook(fis2);
    	sheet=wb.getSheetAt(sheetnumber);
    	String data2=sheet.getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return data2;
    }

}
