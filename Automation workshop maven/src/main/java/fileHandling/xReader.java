package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class xReader 
{
	static String key;
	static String locatorvalue;
	static String locatortype;
	static Map<String,Map> mastersheet = new HashMap<String, Map>();
	static String  sheetName;


	public static void main(String[] args) throws IOException 
	{
		xReader.reader("DC", "pp");
	}
	
	
			public static By reader(String sheet, String keyname) throws IOException
			{
					File myFile = new File("Recources//OR1.xlsx");
					FileInputStream fis = new FileInputStream(myFile);
					XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
					int numberOfSheets = myWorkBook.getNumberOfSheets();
					for (int i = 0; i < numberOfSheets; i++) 
					{
						Map<String, xObjectRepMa> map = new HashMap<String, xObjectRepMa>();
						Sheet sheet1 = myWorkBook.getSheetAt(i); 
						sheetName=myWorkBook.getSheetName(i);
						Iterator<Row> rowIterator = sheet1.iterator();
						
						while(rowIterator.hasNext())
						{
							key ="";
							locatortype="";
							locatorvalue="";
							
							Row row = rowIterator.next();
							Iterator<Cell> cellIterator=row.cellIterator();
							
							
							while(cellIterator.hasNext())
							{
								Cell cell =cellIterator.next();
									switch(cell.getCellType())
									{
										case Cell.CELL_TYPE_STRING:
											if(key.equalsIgnoreCase(""))
											{
												key=cell.getStringCellValue().trim();
											}
											else if(locatortype.equalsIgnoreCase(""))
											{
												locatortype=cell.getStringCellValue().trim();
											}
											else if(locatorvalue.equalsIgnoreCase(""))
											{
												locatorvalue=cell.getStringCellValue().trim();
											}
											else
											{
					    						System.out.println(cell.getStringCellValue());
					    					}
											break;
											case Cell.CELL_TYPE_NUMERIC:
				    						String nvalue=String.valueOf(cell.getNumericCellValue());
				    						locatorvalue=nvalue.replaceAll("(?<=^\\d+)\\.0*$", "");
				    						map.put(key,new xObjectRepMa(locatortype, locatorvalue));
				    					}
				    				} 
							map.put(key,new xObjectRepMa(locatortype, locatorvalue));
						}	
						
						mastersheet.put(sheetName, map );
						
								}
							
					fis.close();
					
			
			
			String stepType;
			String stepValue;
			
			Map<String, xObjectRepMa> p = mastersheet.get(sheet);
			xObjectRepMa p1 = p.get(keyname);
			stepType=p1.getLocator();
			stepValue=p1.getLocatorvalue();
			
			
			By locator = null;
			switch(stepType)
			{
			case "id":
				locator = By.id(stepValue);
				break;
			case "name":
				locator = By.name(stepValue);
				break;
			case "cssSelector":
				locator = By.cssSelector(stepValue);
				break;
			case "linkText":
				locator = By.linkText(stepValue);
				break;
			case "partialLinkText":
				locator = By.partialLinkText(stepValue);
				break;
			case "tagName":
				locator = By.tagName(stepValue);
				break;
			case "xpath":
				locator = By.xpath(stepValue);
				break;
			}
			
			System.out.println(locator);
			return locator;
			}
}
			
			
			//return keyname;
			

				

