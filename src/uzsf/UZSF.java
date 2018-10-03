/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzsf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author amir
 */
public class UZSF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in=new FileInputStream("Ameer.zip");
        BufferedInputStream bin=new BufferedInputStream(in);
        ZipInputStream zin=new ZipInputStream(bin);
        //---------------------
        ZipEntry ze=zin.getNextEntry();
        FileOutputStream out=new FileOutputStream("file.txt");
        BufferedOutputStream bout=new BufferedOutputStream(out);
        while (true){
            int b = zin.read();
            if (b == -1) break;
            bout.write(b);
        }
        
        bout.close();
        zin.close();
    }
    
}
