
package dto;

import com.java.Convierte;
import com.java.EstilosExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Alberto
 */
@WebServlet(name = "ServletInforme", urlPatterns = {"/Informe"})
public class ServletInforme extends HttpServlet {

    EstilosExcel estilo = new EstilosExcel() ;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        // ---
        response.setContentType("application/vnd.ms-excel");
       String ruta= request.getParameter("ruta");
        //File file = new File(ruta);
        //request.getSession().setAttribute("msg", ruta);
        //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        //dispatcher.forward(request, response);
        
        Integer numeroinicial=Convierte.aInteger(request.getParameter("numeroinicial"));
        Integer numerofinal=Convierte.aInteger(request.getParameter("numerofinal"));
        String proyecto = request.getParameter("proyecto");
        
        HSSFWorkbook wb = new HSSFWorkbook();//creamos libro de excel
        HSSFSheet sheet= wb.createSheet(proyecto);//creamos hoja de excel
        HSSFRow row = sheet.createRow(1);//crear fila 1
        HSSFCell t1 = row.createCell(1);//crear la columna A1
        HSSFCell t2 = row.createCell(2);
        HSSFCell t3 = row.createCell(3);
        HSSFCell t4 = row.createCell(4);
        HSSFCell t5 = row.createCell(5);
        HSSFCell t6 = row.createCell(6);
        HSSFCell t7 = row.createCell(7);
        HSSFRow rowb = sheet.createRow(3);//crear fila 1
        HSSFCell st1 = rowb.createCell(1);//crear la columna A1
        HSSFCell st2 = rowb.createCell(2);
        HSSFCell st3 = rowb.createCell(3);
        HSSFCell st4 = rowb.createCell(4);
        HSSFCell st5 = rowb.createCell(5);
        HSSFCell st6 = rowb.createCell(6);
        HSSFCell st7 = rowb.createCell(7);
        HSSFRow row1 = sheet.createRow(4);//crear fila 1
        HSSFCell a1 = row1.createCell(1);//crear la columna A1
        HSSFCell a2 = row1.createCell(2);
        HSSFCell a3 = row1.createCell(3);
        HSSFCell a4 = row1.createCell(4);
        HSSFCell a5 = row1.createCell(5);
        HSSFCell a6 = row1.createCell(6);
        HSSFCell a7 = row1.createCell(7);
        HSSFCellStyle estilocelda=wb.createCellStyle();
        HSSFCellStyle colorear=wb.createCellStyle();
        HSSFCellStyle colorear1=wb.createCellStyle();
        t1.setCellValue("Consolidado  I Semestre 2019");
        st1.setCellValue("TDEM:Organismo de Inspección  acreditado por INACAL.     Brinda el servicio de Inspección de medidores de Energia Electrica");

        estilo.ColorearCelda1(t1, colorear1);
        estilo.ColorearCelda(st1, colorear);
        estilo.TextoNegrita(wb, colorear);
        estilo.TextoNegrita(wb, colorear1);
        
        estilo.CentrarTexto(t1, colorear1);
        estilo.CentrarTexto(st1, colorear);
        estilo.UnirCeldas(sheet, 1, 1, 1, 7);
        estilo.UnirCeldas(sheet, 3, 3, 1, 7);
       
        //HSSFCell b1 = row1.createCell(1);//crear la columna B1
        a1.setCellValue(new HSSFRichTextString("Item"));
        a2.setCellValue(new HSSFRichTextString("N° de informe"));
        a3.setCellValue(new HSSFRichTextString("Fecha"));
        a4.setCellValue(new HSSFRichTextString("Producto/Proceso/servicio a Inspeccionar"));
        a5.setCellValue(new HSSFRichTextString("Actividad de Inspección"));
        a6.setCellValue(new HSSFRichTextString("Cliente"));
        a7.setCellValue(new HSSFRichTextString("Observación"));
        estilo.BordearCelda(t1, colorear1);
        estilo.BordearCelda(t2, colorear1);
        estilo.BordearCelda(t3, colorear1);
        estilo.BordearCelda(t4, colorear1);
        estilo.BordearCelda(t5, colorear1);
        estilo.BordearCelda(t6, colorear1);
        estilo.BordearCelda(t7, colorear1);
        estilo.BordearCelda(st1, colorear);
        estilo.BordearCelda(st2, colorear);
        estilo.BordearCelda(st3, colorear);
        estilo.BordearCelda(st4, colorear);
        estilo.BordearCelda(st5, colorear);
        estilo.BordearCelda(st6, colorear);
        estilo.BordearCelda(st7, colorear);
        estilo.BordearCelda(a1, colorear);
        estilo.BordearCelda(a2, colorear);
        estilo.BordearCelda(a3, colorear);
        estilo.BordearCelda(a4, colorear);
        estilo.BordearCelda(a5, colorear);
        estilo.BordearCelda(a6, colorear);
        estilo.BordearCelda(a7, colorear);
        
        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);
        sheet.autoSizeColumn(3);
        sheet.autoSizeColumn(4);
        sheet.autoSizeColumn(5);
        
        sheet.autoSizeColumn(7);
        
        //a1.setCellStyle(cellStyle);
        //b1.setCellValue(new HSSFRichTextString("Nota"));
        Iterator<Integer> rein = LlenarInformesFaltantes(numeroinicial, numerofinal, ruta).iterator();
        Integer i=1;
        while(rein.hasNext()){
            Integer faltantes = rein.next();
            HSSFRow row2 = sheet.createRow(4+i);//crear fila 1
            sheet.autoSizeColumn(6);
            HSSFCell dato1=row2.createCell(1);
            HSSFCell dato2=row2.createCell(2);
            HSSFCell dato3=row2.createCell(3);
            HSSFCell dato4=row2.createCell(4);
            HSSFCell dato5=row2.createCell(5);
            HSSFCell dato6=row2.createCell(6);
            HSSFCell dato7=row2.createCell(7);
            dato1.setCellValue(i);
            dato2.setCellValue(faltantes);
            dato6.setCellValue(proyecto);
            dato7.setCellValue("Anulado");
            estilo.BordearCelda(dato1, estilocelda);
            estilo.BordearCelda(dato2, estilocelda);
            estilo.BordearCelda(dato3, estilocelda);
            estilo.BordearCelda(dato4, estilocelda);
            estilo.BordearCelda(dato5, estilocelda);
            estilo.BordearCelda(dato6, estilocelda);
            estilo.BordearCelda(dato7, estilocelda);
            i++;
        }
        OutputStream out = response.getOutputStream();
        wb.write(out);
        out.close();
    }
    
    public ArrayList LlenarInformesFaltantes(Integer numini, Integer numfin, String ruta){
        ArrayList<Integer> informesfaltantes = new ArrayList<Integer>();
        
        
       String rutaArchivoExcel = "C:\\Ficheros-Excel\\"+ruta;
        
        try {
            boolean estado=false;
            
            FileInputStream inputStream = new FileInputStream(new File(rutaArchivoExcel));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            for (int i = numini; i <=numfin; i++) {
                Iterator iterator = firstSheet.iterator();
                DataFormatter formatter = new DataFormatter();
                while (iterator.hasNext()) {
                    Row nextRow = (Row) iterator.next();
                    Iterator cellIterator = nextRow.cellIterator();
                    while(cellIterator.hasNext()) {
                        Cell cell = (Cell) cellIterator.next();
                        String contenidoCelda = formatter.formatCellValue(cell);
                        Integer elemento = Convierte.aInteger(contenidoCelda);
                        if (i==elemento) {
                            estado=true;
                            break;
                        }else{
                            estado=false;
                        }
                    }
                    if (estado) {
                        break;
                    }
                }
                if (estado==false) {
                    informesfaltantes.add(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return informesfaltantes;
    }

    private String getFileName(final Part part) {
    for (String content : part.getHeader("content-disposition").split(";")) {
        if (content.trim().startsWith("filename")) {
            return content.substring(
                    content.indexOf('=') + 1).trim().replace("\"", "");
        }
    }
    return null;
}
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
