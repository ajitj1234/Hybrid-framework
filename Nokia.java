package Keyword;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Nokia {

	public static void main(String[] args) throws InterruptedException {
		try {
			String path = "D:\\Auto input\\Flipkartinput.xlsx";
			Datainput.input(path, 1);
			for(int i=0;i<=6;i++) {
				String keyword=Datainput.getdata(i, 2);
				
				if(keyword.equals("invokebrowser")) {
					Perform.invokebrowser();
				}
				else if(keyword.equals("open")) {
					Perform.open();
				}
				else if(keyword.equals("type")) {
					Perform.type(3,3);
				}
				else if(keyword.equals("search")) {
					Perform.search(4,3);
				}
				else if(keyword.equals("click")) {
					Perform.click(5,3);
				}
				else if(keyword.equals("select")) {
					Perform.select(6,3);
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}		

	}

}
