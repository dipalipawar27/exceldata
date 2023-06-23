package exceldata;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {

	public static void main(String[] args) throws Exception   {
		getdataexcel();
	}
	
	public static void getdataexcel() throws Exception {
		
		
		String excel = "C:/Users/Nikhil/eclipse-workspace/readexcel/data/testdata.xlsx";
		XSSFWorkbook Workbook = new XSSFWorkbook(excel);
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		double value= Sheet.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(value);
		
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

