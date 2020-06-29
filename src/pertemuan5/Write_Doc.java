/*
 * Ini adalah tugas pertemuan ke-5 mata kuliah Algoritma & Pemrograman 2
 */
package pertemuan5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/**
 * Nama         : Septian Moh.Ridwan
 * NIM          : 1855201034
 * Prodi/Kelas  : Ilmu Komputer semester 4
 * @author Septian_MR :P
 */
public class Write_Doc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BasicConfigurator.configure();
        String kalimat = "Nama saya tidak tahu."
                + "Alamat saya lupa. "
                + "Saya tidak punya orang lain. \n "
                + "Sudah. "
                + "Capek. ";
        
        String lokasi_file = "D://tes_DOC.doc";
        XWPFDocument file_doc = new XWPFDocument();
        FileOutputStream tampil;
        tampil = new FileOutputStream(new File(lokasi_file));
        XWPFParagraph teks_prgrf = file_doc.createParagraph();
        XWPFRun jalankan = teks_prgrf.createRun();
        jalankan.setText(kalimat);
        file_doc.write(tampil);
        tampil.close();
        
        System.out.println("Sudah");
        
}
}