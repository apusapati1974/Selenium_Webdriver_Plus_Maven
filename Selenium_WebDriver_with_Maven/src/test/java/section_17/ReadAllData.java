package section_17;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("E:\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet s1 = wb.getSheet("Sheet1");
		int r = s1.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++) {
			XSSFRow r1 = s1.getRow(i);
			int c = r1.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++) {
				XSSFCell c11 = r1.getCell(j);
				System.out.print(c11.getStringCellValue()+" ");
			}
			System.out.println();
		}
	}
}
