/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Septian_MR
 */
public class txtfile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // Baca TXT File
        String lokasi_file = "D://input.txt"; //buka file
        String line = null; //referensi satu line pada satu waktu, bersiap jika isi file ada
        
        FileReader baca = 
                new FileReader(lokasi_file); //membaca isi file
        
        BufferedReader ambil =
                new BufferedReader(baca); //pakai tambahan ini
        
        int jumlahbaris = 0;
        
        
        while ((line=ambil.readLine()) != null) {
            System.out.println(line);
            System.out.println(jumlahbaris);
        }
        
        ambil.close();
        
    }
}
