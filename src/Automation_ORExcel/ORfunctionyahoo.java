package Automation_ORExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import com.read.ReadXlsx;

@SuppressWarnings("unused")
public class ORfunctionyahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ReadXlsx readXlsx = new ReadXlsx();
//		readXlsx.readXLSXFile("D:/automationXpath/Yahoo_xpath.xlsx");	
		
		readXLSXFile("D:/automationXpath/Yahoo_xpath.xlsx");
//getKey("username");
//getlocator("id");
//getlocatorvalue("mmm//");
	}
	
	static String key;
	static String locator;
	static String locatorvalue;
	static String sheetname;

	public static String getKey(String Key)
	{
		System.out.println(Key);
		return Key;
		
	}

	public static String getlocator(String loc)
	{
		System.out.println(loc);
		return loc;
		
	}

	public static String getlocatorvalue(String locvalue)
	{
		System.out.println(locvalue);
		return locvalue;
		
	}
	
	public static String getsheetkey(String Sheetname,String key)
	{
		System.out.println(Sheetname);
		return (Sheetname);
		
	}
	
	@SuppressWarnings({ "deprecation", "resource", "rawtypes" })
	public static String readXLSXFile(String fileName) {
		InputStream XlsxFileToRead = null;
		XSSFWorkbook workbook = null;
		try {
			XlsxFileToRead = new FileInputStream(fileName);
//	1		
			//Getting the workbook instance for xlsx file
			workbook = new XSSFWorkbook(XlsxFileToRead);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//getting the first sheet from the workbook using sheet name. 
		// We can also pass the index of the sheet which starts from '0'.
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println(sheet.getSheetName());
		
//		int sheetcount =0;
//		Iterator sheets = workbook.iterator();
//		while(sheets.hasNext())
//				{
//			sheetcount++;
//			
//			System.out.println(sheetcount);
//		}
//		
		
		XSSFRow row;
		XSSFCell cell;
		
		//Iterating all the rows in the sheet
		@SuppressWarnings("rawtypes")
		Iterator rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			
			//Iterating all the cells of the current row
			Iterator cells = row.cellIterator();

			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();

				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					getKey(cell.getStringCellValue());
					
//					System.out.print(cell.getStringCellValue() + " ");
				} 
				else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					
				System.out.print(cell.getNumericCellValue() + " ");
				} 
				else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					
				System.out.print(cell.getBooleanCellValue() + " ");

				} 
//				else { // //Here if require, we can also add below methods to
//							// read the cell content
//							// XSSFCell.CELL_TYPE_BLANK
//							// XSSFCell.CELL_TYPE_FORMULA
//							// XSSFCell.CELL_TYPE_ERROR
//				}
			}
			System.out.println();
//			try {
//				XlsxFileToRead.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		}
		
		return fileName;
	}
	
}


