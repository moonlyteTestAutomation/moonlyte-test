package qa.com.test.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	
	public ArrayList<String> dataSetUp(String testcaseName, String testCaseMode) throws IOException {
		ArrayList<String> saveDataList = new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\Swathi\\Documents\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			System.out.print(testCaseMode);
			if (workbook.getSheetName(i).equalsIgnoreCase(testCaseMode)) {

				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();

				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {

						column = k;

					}

					k++;
				}
				while (rows.hasNext()) {
					Row r = rows.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							
							Cell c=cv.next();
							if(c.getCellTypeEnum()==CellType.STRING)
							{
											

							saveDataList.add(c.getStringCellValue());

						}
							else
							{
								
								saveDataList.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
							}
							
						}

					}

				}

			}

		}
		return saveDataList;
	}

}
