/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tulio Morales
 */
public class LeerArchivo {
    public String leerTxt (String dir)
    { String temp= "";
        try{
            BufferedReader bf = new BufferedReader (new FileReader (dir));
           
            String bfRead;
            while ((bfRead = bf.readLine())!= null){
                temp= temp + bfRead+"\n";
         
            }
        }catch (Exception e){
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE,null,e);
            System.err.print("No se encontro archivo");
        }
     return temp;
    }
}
