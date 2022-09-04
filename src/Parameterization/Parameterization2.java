package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization2
{
public static void main(String[] args) throws Throwable 
{
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Downloads\\may7.xlsx");
	 double data = WorkbookFactory.create(file).getSheet("may7").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(data);
	 
}
}
