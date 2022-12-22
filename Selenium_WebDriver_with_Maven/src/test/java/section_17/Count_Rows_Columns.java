package section_17;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Count_Rows_Columns {
	public static void main(String[] args) throws IOException {
		
		// Need to make connection with Excel File
		FileInputStream fs = new FileInputStream("E:\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet s1 = wb.getSheet("Sheet1");
		/*
		System.out.println("Number of rows ---> "+s1.getPhysicalNumberOfRows());
		System.out.println("Index of Last Row is ---> "+s1.getLastRowNum());
		*/
		XSSFRow r1 = s1.getRow(4);
		System.out.println("Number of Cells in Row[4] is --- "+r1.getPhysicalNumberOfCells());
	}
}
