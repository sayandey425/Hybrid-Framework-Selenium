package com.frame.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	
	public class ExcelUtility {
		
				public ArrayList<String> getData(String testcaseName) throws IOException {

					
					ArrayList<String> a = new ArrayList<String>();
					
					FileInputStream fis = new FileInputStream(".\\TestData\\Test Plan And Test Stategy Document for Bigsmall.in.xlsx");
					
					System.out.println("file found");
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
					
					int sheets = workbook.getNumberOfSheets();
					
					for(int i=0; i<sheets; i++) {
						
						if(workbook.getSheetName(i).equalsIgnoreCase("Test Data For Loggin")) {
							
						XSSFSheet sheet = workbook.getSheetAt(1);
						
						Iterator<Row> rows = sheet.iterator();
						
						Row firstrow =rows.next();
						
						Iterator<Cell> ce = firstrow.cellIterator();  
						
						int column=0;
						while(ce.hasNext()) {
							System.out.println("Getting cell");
							Cell c1 = ce.next();
							System.out.println(c1.getStringCellValue());
							
							if(c1.getStringCellValue().equalsIgnoreCase("SL")) {
								System.out.println("Yes SL Got");
							  break;
							}
						
							  column++;	
						}
						
						System.out.println("tets cases column pesent at this index :"+column);
						
						int c=0;
						
						while(rows.hasNext()){
							
							Row r = rows.next();
							
							Cell v =r.getCell(column);
							
							if(v!=null && v.getStringCellValue().equalsIgnoreCase(testcaseName)) {
								
								Iterator<Cell> cv = r.cellIterator();
								
								while(cv.hasNext() ) {
									Cell h = cv.next();
									
									System.out.println("column index :" + c);
									c++;
									
									  a.add(h.getStringCellValue());
								}
								
								break;
							}
						}
						}}
						
					
					
					return a;
				}	
				
				}
	


