package Parameterization;



import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
//create object of fileinputstream class
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Downloads\\may7.xlsx");
	//open excel sheet using create method
	 boolean data = WorkbookFactory.create(file).getSheet("may7").getRow(1).getCell(1).getBooleanCellValue();
	//print data in excel sheet
	System.out.println(data);
}
}