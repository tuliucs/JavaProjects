/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuliux
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    // TODO code application logic here
        BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
        String nombreArchivo=null;
        try {
            System.out.println("Ingrese el nombre del archivo: ");
            nombreArchivo= leerTeclado.readLine();
        } catch (IOException e) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE,null,e);
        }
        
        
        //Creando un archivo nuevo
        CrearArchivos archivo_nuevo=new CrearArchivos();
        int creado;
        creado=archivo_nuevo.creaArchivo(nombreArchivo);
        switch (creado) {
            case 1:
                System.out.println("Se a creado el archivo nuevo");
                break;
            case 2:
                System.out.println("Se ha editado un archivo existente");
                break;
            default:
                System.out.println("No se ha podido crear el archivo");
                break;
        }
        
        //Leyendo un archivo 
       LeerArchivo archivo_a_leer= new LeerArchivo();
       String f1= archivo_a_leer.leerTxt("C:\\ProcesosJava\\"+ nombreArchivo);
       System.out.println(f1);
       
    }
    
}
