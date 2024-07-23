/*package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datareader {

	public static void main(String[] args) throws IOException {
		
	XSSFWorkbook ExelWorkBook =null;
		XSSFSheet ExelWSheet;
		
		
		File excelfile=new File("C:\\Users\\Shahe alam\\eclipse-workspace\\SeleniumAutomationFramework\\TestAutomationFramework\\src\\test\\resources\\testdata\\testdata.xlsx");
		
		FileInputStream inputStream;
		
		inputStream=new FileInputStream(excelfile);
		ExelWorkBook =new XSSFWorkbook(inputStream);
		ExelWSheet= ExelWorkBook.getSheetAt(0);
		int ttlRows=ExelWSheet.getLastRowNum()+1;
		int ttlCells=ExelWSheet.getRow(0).getLastCellNum();
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		XSSFWorkbook ExelBook=null;
		XSSFSheet exelWSheet; 
		
		
		
		File Exelfile=new File("C:\\Users\\Shahe alam\\eclipse-workspace\\SeleniumAutomationFramework\\TestAutomationFramework\\src\\test\\resources\\testdata\\testdata.xlsx");
		
		FileInputStream inputStream;
		
		
		inputStream=new FileInputStream(Exelfile);
		ExelBook=new XSSFWorkbook(inputStream);
		exelWSheet=ExelBook.getSheetAt(0);
		
		int ttlRows=exelWSheet.getLastRowNum()+1;
		
		int ttlCells=exelWSheet.getRow(0).getLastCellNum();

		for(int currentRow=0;currentRow<ttlRows;currentRow++) {
			
			for(int currentCell=0;currentCell<ttlCells;currentCell++)
				
			{
				System.out.print(exelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
			System.out.println();
			
		}
		//ExelBook.close();
		
		
		
		*//*

	}

}
    */