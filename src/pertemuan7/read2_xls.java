/*
 * Ini adalah tugas pertemuan ke-7 mata kuliah Algoritma & Pemrograman 2
 */
package pertemuan7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class read2_xls {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream lokasi_file = new FileInputStream (new File("D:\\tes_XLS.xls"));
        HSSFWorkbook tabelku;
        tabelku = new HSSFWorkbook(lokasi_file);
        HSSFSheet tabelku_sheet = tabelku.getSheetAt(0);
        FormulaEvaluator rumusEv = tabelku.getCreationHelper().createFormulaEvaluator();
        for (Row row: tabelku_sheet) {
            for (Cell cell: row) {
                switch (rumusEv.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");
                        break;
                }
            }
            System.out.println("");
            
        }
    }
            
}
