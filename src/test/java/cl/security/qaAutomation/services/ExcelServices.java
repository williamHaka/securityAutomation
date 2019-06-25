package cl.security.qaAutomation.services;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import cl.security.qaAutomation.utils.Constants;

public class ExcelServices {
	static String excelFilePath;
	
	private static List<String> CreateCabecera(){
        List<String> cabecera =  new ArrayList<String>();//Arrays.asList("ORDER ID","User", "Type of order", "Product", "Type of delivery","subtype of delivery","payment method","Card  number","Nª OC", "Total de la Compra", "Dispositivo", "Browser");
        cabecera.add("Nmro TC");
        cabecera.add("Application id");
        return cabecera;
    }
	
	public static void createNewFileExcel() throws Exception {
	    Workbook libro = new HSSFWorkbook();
	    Calendar calendario = new GregorianCalendar();
	    Integer hora =calendario.get(Calendar.HOUR_OF_DAY);
	    Integer minutos = calendario.get(Calendar.MINUTE);
	    excelFilePath = System.getenv("user.dir")+"FlujoDPS"+"_"+hora+"-"+minutos+".xls";
	    FileOutputStream archivo = new FileOutputStream(excelFilePath);
	    libro.write(archivo);
	    libro.close();
	    archivo.close();
	  }
}
