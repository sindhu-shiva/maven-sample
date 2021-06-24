package excelcheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook wb = new XSSFWorkbook(inputStream);      

    //Read excel sheet by sheet name    
	Sheet s = wb.getSheet(sheetName);

    //Get the current count of rows in excel file

    int rowCount = s.getLastRowNum()-s.getFirstRowNum();

    //Get the first row from the sheet

    Row row = s.getRow(0);

    //Create a new row and append it at last of sheet

    Row newRow = s.createRow(rowCount+1);

    //Create a loop over the cell of newly created Row

    for(int j = 0; j < row.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);

        cell.setCellValue(dataToWrite[j]);
    }

    //Close input stream

    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    wb.write(outputStream);

    //close output stream

    outputStream.close();
    
	
    }


	public static void main(String[] args) throws IOException {

		 //Create an array with the data in the same order in which you expect to be filled in excel file

        String[] valueToWrite = {"Mr. E","Noida"};

        //Create an object of current class

        ExcelWrite objExcelFile = new ExcelWrite();
        

        //Write the file using file name, sheet name and the data to be filled

        objExcelFile.writeExcel(System.getProperty("user.dir")+"\\src\\test\\java\\excelcheck","ExportExcel.xlsx","ExcelGuru99Demo",valueToWrite);

         
    }


	}


