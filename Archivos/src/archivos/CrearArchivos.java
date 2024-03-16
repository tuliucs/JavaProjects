/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuliux
 */
public class CrearArchivos {

    
   public int creaArchivo(String nombreArchivo){
        //0 Error, 1 Creado, 2 Editado
        File el_archivo = new File("C:\\ProcesosJava\\"+nombreArchivo);        
        FileWriter escribe;
        PrintWriter linea;
        if (!el_archivo.exists()){
                try {
                el_archivo.createNewFile();
                //Logger.getLogger(Archivos.class.getName()).log(Level.INFO,"Archivo creado "+nombreArchivo);
                escribe = new FileWriter(el_archivo,true);
                linea = new PrintWriter(escribe);
                linea.print("Nombre,"); //Nombre,|
                linea.print("Apellido,");// Nombre,Apellido,|
                linea.println("Curso"); // Nombre,Apellido,Curso
                                        // |
                linea.close();
                escribe.close();
                return 1;
            } catch (IOException e){
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE,null,e);
                return 0;
            }
        }else{
            try {
                escribe = new FileWriter(el_archivo,true);
                linea = new PrintWriter(escribe);
                linea.print("Yesica,");
                linea.print("Guarquex,");
                linea.println("Matemáticas");
                linea.close();
                escribe.close();
                return 2;
            } catch (IOException e){
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE,null,e);
                return 0;
            }               

   } 
   }
}
