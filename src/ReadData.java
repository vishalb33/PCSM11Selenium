import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static void main(String[] args) throws Exception  {
		String path = "D:/Login.xlsx";
		FileInputStream fis = new FileInputStream(path); //
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getPhysicalNumberOfRows();
		int colCount = sh.getRow(0) .getLastCellNum();
		
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++)  {
				Cell c1 = sh.getRow(i) .getCell(j);
				System.out.println(c1);
			}
		}
	}
	public static String readCell (String path, String sheetName, int row, int col) throws Exception   {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Cell c1 = sh.getRow(row) .getCell(col);
		return c1.toString();
	}

}
