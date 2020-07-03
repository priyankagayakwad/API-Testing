package Excel_Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {

	public static void main(String[] args) throws IOException
	{
		File src=new File("C:\\Users\\Administrator\\Desktop\\demo.xlsx");
		 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		   
		   sh1.getRow(0).createCell(2).setCellValue("Pass");
		   
		   sh1.getRow(1).createCell(2).setCellValue("Pass");
		   
		   sh1.getRow(2).createCell(2).setCellValue("Active");
		   
		// here we need to specify where you want to save file
		   FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\demo.xlsx"));
		   
		   
		  // finally write content 
		   
		   wb.write(fout);
		   
		  // close the file
		   
		   fout.close();
		   
		   
		  	}

}
