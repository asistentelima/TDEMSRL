
package com.java;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

public class EstilosExcel {
    
    public void CentrarTexto (HSSFCell celda,HSSFCellStyle estilocelda){
        //celda.setCellValue("This is a test of merging");
        estilocelda.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        celda.setCellStyle(estilocelda);
    }
    
    public void UnirCeldas (HSSFSheet sheet,Integer primerafila, Integer ultimafila, Integer primeracolumna, Integer ultimacolumna){
        sheet.addMergedRegion(new CellRangeAddress(primerafila,ultimafila,primeracolumna,ultimacolumna));
    }
    public void BordearCelda(HSSFCell celda,HSSFCellStyle estilocelda){
        estilocelda.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        estilocelda.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        estilocelda.setBorderRight(HSSFCellStyle.BORDER_THIN);
        estilocelda.setBorderTop(HSSFCellStyle.BORDER_THIN);
        estilocelda.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        estilocelda.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        estilocelda.setRightBorderColor(IndexedColors.BLACK.getIndex());
        estilocelda.setTopBorderColor(IndexedColors.BLACK.getIndex());
        celda.setCellStyle(estilocelda);
    }
    public void ColorearCelda(HSSFCell celda,HSSFCellStyle estilocelda){
        estilocelda.setFillForegroundColor (IndexedColors.YELLOW.getIndex());
        estilocelda.setFillPattern (estilocelda.SOLID_FOREGROUND);
        celda.setCellStyle(estilocelda);
    }
    public void ColorearCelda1(HSSFCell celda,HSSFCellStyle estilocelda){
        estilocelda.setFillForegroundColor (IndexedColors.LIGHT_BLUE.getIndex());
        estilocelda.setFillPattern (estilocelda.SOLID_FOREGROUND);
        celda.setCellStyle(estilocelda);
    }
    
    public void TextoNegrita(HSSFWorkbook wb,HSSFCellStyle estilocelda){
        Font font = wb.createFont();
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        estilocelda.setFont(font);
    }
    
    
}
