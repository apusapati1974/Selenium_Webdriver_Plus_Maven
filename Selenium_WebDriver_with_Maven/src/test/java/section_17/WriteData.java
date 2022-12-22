package section_17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fs = new FileOutputStream("E:\\TestData.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("Result");
		XSSFRow r1 = s1.createRow(0);
		XSSFCell c1 = r1.createCell(0);
		c1.setCellValue("Anudeep");
		wk.write(fs);
		wk.close();

	}

}
