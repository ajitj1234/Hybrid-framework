package HybridNew;

import java.io.IOException;

public class ExecutionEngine {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String path="D:\\Auto input\\SecondHybridInput\\OR.xlsx";
		for(int i=0;i<=15;i++) {
		Getdatainput.input(path,1,i,0);
		String keyword=Getdatainput.input(path,1,i, 0);
		if(keyword.equals("invokebrowser")) {
			MyMethods.invokebrowser();
		}
		else if (keyword.equals("open")) {
			MyMethods.open();			
		}
		else if (keyword.equals("type")) {
			MyMethods.type();			
		}
		else if (keyword.equals("type1")) {
			MyMethods.type1();			
		}
		else if (keyword.equals("click")) {
			MyMethods.click();			
		}
		else if (keyword.equals("click1")) {
			MyMethods.click1();			
		}
		else if (keyword.equals("type2")) {
			MyMethods.type2();			
		}
		else if (keyword.equals("click2")) {
			MyMethods.click2();			
		}
		else if (keyword.equals("waitfor")) {
			MyMethods.waitfor();			
		}
		else if (keyword.equals("select")) {
			MyMethods.select();			
		}
	}
	}
}
