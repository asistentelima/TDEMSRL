package com.xlsx;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GeneraXlsx {

	public static void main(String[] args) throws IOException  {
		
		generaXlsx();

	}

	public static void generaXlsx() throws IOException {
		
		String nombreArchivo = "/Desarrollo/excel/File.xlsx";//nombre del archivo de Excel

		String nombreHoja1 = "Hoja1";//nombre de la hoja1

		XSSFWorkbook libroTrabajo = new XSSFWorkbook();
		XSSFSheet hoja1 = libroTrabajo.createSheet(nombreHoja1) ;


		//iterando numero de filas (r)
		for (int r=0;r < 5; r++ ) {
			XSSFRow row = hoja1.createRow(r);
			
			//iterando numero de columnas (c)
			for (int c=0;c < 5; c++ ){
				XSSFCell cell = row.createCell(c);
				cell.setCellValue("Cell "+r+" "+c);
			}
		}

		FileOutputStream fileOut = new FileOutputStream(nombreArchivo);

		//escribir este libro en un OutputStream.
		libroTrabajo.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
}