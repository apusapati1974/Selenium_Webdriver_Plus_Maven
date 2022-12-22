package section_17;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFormatedData {

	public static void main(String[] args) throws IOException {
		
		/*
		  Pre-requisite : 
		    Read data from file with different data type values.
		    Cell Can have String data.
		    Cell Can have numeric data
		    Cell Can have boolean data.
		 */
		
		FileInputStream fs = new FileInputStream("E:\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet s1 = wb.getSheet("Sheet2");
		int r = s1.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++) {
			Row r1 = s1.getRow(i);
			Cell c1 = r1.getCell(0);
			/*
			if(c1.getCellFormula() == 1) {
				System.out.println(c1.getStringCellValue());
			}
			elseif(c1.getCellType()==0){
				System.out.println(c1.getNumericCellValue());
			}
			else if(c1.getCellType()==4) {
				System.out.println(c1.getBooleanCellValue());
			}
			*/
			
	    }
	}

}
