package exelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Create Excel sheet and pass the path along with name and extention in File objective
		File myfile= new File("C:\\Users\\Maddy\\Desktop\\Excelsheet1.xlsx");
		
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(name);
		
		//how to read numeric value
		double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		
		System.out.println(number);
		
		//how to read char value
		
		String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(mychar);
		
		//how to read boolean value
		
		boolean myValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		
		System.out.println(myValue);
		
	

	}

}
