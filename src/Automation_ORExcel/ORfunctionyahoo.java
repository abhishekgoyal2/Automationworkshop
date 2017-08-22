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
		
//		readXLSXFile("D:/automationXpath/Yahoo_xpath.xlsx");
		try {
			getsheetname("D:/automationXpath/Yahoo_xpath.xlsx");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
//getKey("username");
//getlocator("id");
//getlocatorvalue("mmm//");
	}
	
	static InputStream XlsxFileToRead = null;
	static XSSFWorkbook workbook = null;
	static String key;
	static String locator;
	static String locatorvalue;
	static String sheetname;
	static XSSFSheet sheetfile ;
	static XSSFSheet sheetcount ;
	
	static String sheet = null; 
	static int count=0;

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
	
	public static String getsheetkey(String Sheetname,String key) throws IOException
	
	{
		
		XlsxFileToRead = new FileInputStream(sheetname);
		
		//Getting the workbook instance for xlsx file
		workbook = new XSSFWorkbook(XlsxFileToRead);
// for each sheet in the workbook
		
for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
	System.out.println("Sheet number: " + i);

    System.out.println("Sheet name: " + workbook.getSheetName(i));
    count++;
    sheetfile = workbook.getSheet(workbook.getSheetName(i));
    XSSFRow row;
	XSSFCell cell;
	
		System.out.println(Sheetname);
		return (Sheetname);
		
	}
return key;
	
	}
	
		
	public static String getsheetname(String sheetname) throws IOException
	{
		XlsxFileToRead = new FileInputStream(sheetname);
	
				//Getting the workbook instance for xlsx file
				workbook = new XSSFWorkbook(XlsxFileToRead);
		// for each sheet in the workbook
				
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
        	System.out.println("Sheet number: " + i);

            System.out.println("Sheet name: " + workbook.getSheetName(i));
            count++;
            sheetfile = workbook.getSheet(workbook.getSheetName(i));
            XSSFRow row;
    		XSSFCell cell;
    		
    		//Iterating all the rows in the sheet
    		@SuppressWarnings("rawtypes")
    		
    		Iterator rows = sheetfile.rowIterator();
    		if(rows!=null)
    		{

    		while (rows.hasNext()) {
    			row = (XSSFRow) rows.next();
    			{
    			
    			//Iterating all the cells of the current row
    			@SuppressWarnings("rawtypes")
				Iterator cells = row.cellIterator();

    			while (cells.hasNext()) {
    				cell = (XSSFCell) cells.next();

    				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
    					getKey(cell.getStringCellValue());
    					
//    					System.out.print(cell.getStringCellValue() + " ");
    				} 
    				else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
    					
    				System.out.print(cell.getNumericCellValue() + " ");
    				} 
    				else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
    					
    				System.out.print(cell.getBooleanCellValue() + " ");

    				} 
//    				else { // //Here if require, we can also add below methods to
//    							// read the cell content
//    							// XSSFCell.CELL_TYPE_BLANK
//    							// XSSFCell.CELL_TYPE_FORMULA
//    							// XSSFCell.CELL_TYPE_ERROR
//    				}
    			}
    			System.out.println();
//    			try {
//    				XlsxFileToRead.close();
//    			} catch (IOException e) {
//    				e.printStackTrace();
//    			}
    		
    		}
    		
//    				}
//    				}
    		
    	}
        
        
    		}
        }
        System.out.println("total number of sheets : "+ count);
		return sheetname;
	
	

//	System.out.println("Total number of sheets : " + count);

        
	}
}
	





