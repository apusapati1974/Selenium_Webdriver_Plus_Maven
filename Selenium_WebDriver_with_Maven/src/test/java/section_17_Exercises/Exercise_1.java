package section_17_Exercises;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exercise_1 {
	public static void main(String[] args) throws IOException {
		/* 
		 * Excel Task - 1
		 *   Read data from excel-1 and write the data to another excel-2 sheet
		 * */
		
		// Read data from Excel
		FileInputStream fis = new FileInputStream("E:\\UE\\Read.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		int r = sheet1.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++) {
			XSSFRow r1 = sheet1.getRow(i);
			int c = r1.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++) {
				XSSFCell c11 = r1.getCell(j);
				System.out.print(c11.getStringCellValue()+" ");
			}
			System.out.println();
		}
	}
}
