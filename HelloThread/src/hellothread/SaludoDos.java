/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuliux
 */
public class SaludoDos extends Thread {
    @Override
    public void run(){
        for (int y=0; y<100; y++)
        {
            System.out.println("saludo2");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(SaludoDos.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
