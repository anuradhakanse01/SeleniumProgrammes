package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data/" + fileName + ".xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		short lastColNum = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[lastRowNum][lastColNum];
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastColNum; j++) {
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = cellValue;
				System.out.print(data[i - 1][j] + " ");
			}
			System.out.println();
		}
		wb.close();
		return data;
	}

}
