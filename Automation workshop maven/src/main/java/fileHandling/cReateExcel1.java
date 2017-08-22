package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cReateExcel1 
{
	private static final String FILE_NAME = "D:/MySheet1.xlsx";
	public static void main(String[] args) throws IOException 
	{
	    

		/*XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");
        System.out.println("WorkSHeet object has been created
*/	
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Java 1");
		System.out.println("WorkSHeet object has been created");
		
		Object[][] bookData1 = 
			{
                {"First Java", "Kathy Serria",79,"123",},
                {"Effective Java", "Joshua Bloch", 22,"123"},
                {"Clean Code", "Robert martin",22, "123"},
                {"Thinking in Java", "Bruce Eckel"," " ,"123"},
        };
		
		int rowCount = 0;
        
        for (Object[] aBook : bookData1) 
        {
            Row row = sheet.createRow(rowCount++);
             
            int columnCount = 0;
            
            for (Object field : aBook) 
            {
                //Cell cell = row.createCell(++columnCount);
                
                Cell cell = row.createCell(columnCount++);
                
                if (field instanceof String)
                {
                    cell.setCellValue((String) field);
                } 
                else if (field instanceof Integer) 
                {
                    cell.setCellValue((Integer) field);
                }
                
            }
        }
        
        System.out.println("Data has been added");
        
        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
        
        workbook.write(outputStream);

        System.out.println("Data has been added and file has creatred");

        }
	
}
