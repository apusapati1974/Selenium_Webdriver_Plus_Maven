package section_17_Exercises;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exercise_2 {

	public static void main(String[] args) throws IOException {
		
		/* 
		 * Excel Task - 1 [write Data]
		 *   Read data from excel-1 and write the data to another excel-2 sheet
		 * */
		
		// Blank Workbook
		XSSFWorkbook wk = new XSSFWorkbook();
		
		// Create a blank sheet
		XSSFSheet sheet = wk.createSheet("Data");
		
		//This data need to be written(Object[])
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"TestData1"});
		data.put("2", new Object[] {"TestData1", "TestData2"});
		data.put("3", new Object[] {"TestData1", "TestData2", "TestData3"});
		
		// Iterate over data and write to sheet.
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for(String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for(Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
			
		}
		try {
			// Write the workbook in file system
			FileOutputStream fos = new FileOutputStream("E:\\UE\\Write.xlsx");
			wk.write(fos);
			fos.close();
			System.out.println("Write.xlsx written Successfully...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
