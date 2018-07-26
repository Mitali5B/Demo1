package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.support.FindBy;

import pages.Registration;

public class Excelutility {
	public void getTestdata() throws IOException{
		int i ;
		FileInputStream fin= new FileInputStream("C:\\Users\\PDC4-Training.PDC4\\Desktop\\Selenium Training\\Data.xls");
		HSSFWorkbook X= new HSSFWorkbook(fin);
		HSSFSheet s= X.getSheet("Data");
		int noOfRows = s.getLastRowNum();
		int noOfCols= s.getRow(0).getLastCellNum();
		
		for(i=1; i<=noOfRows;i++)
			
		{
			String FirstName= s.getRow(i).getCell(0).getStringCellValue();
			
			String LastName= s.getRow(i).getCell(1).getStringCellValue();
			String Email= s.getRow(i).getCell(2).getStringCellValue();
			String Password= s.getRow(i).getCell(3).getStringCellValue();
			String ConfirmPassword= s.getRow(i).getCell(4).getStringCellValue();
			//@FindBy(linkText="Logout");
			
			//System.out.println(noOfCols);
			//System.out.println(FirstName);
			Registration.regis(FirstName, LastName, Email, Password, ConfirmPassword);
			
		}
		String data= s.getRow(1).getCell(0).getStringCellValue();
		
		
			
	}

	public static void main(String args[]) throws IOException
	{
		Excelutility e= new Excelutility();
		e.getTestdata();
	}
}
