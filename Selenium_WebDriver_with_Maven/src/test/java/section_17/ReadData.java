package section_17;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("E:\\TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet s = wb.getSheet("Sheet1");
		XSSFRow r = s.getRow(0);
		XSSFCell c = r.getCell(1);
		System.out.println(c.getStringCellValue());
	}

}
