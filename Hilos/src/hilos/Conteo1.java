/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuliux
 */
public class Conteo1 extends Thread {
    private long tiempo=0;
    public void setTiempo(long tiempo){
        this.tiempo=tiempo;
    }
    @Override
    public void run(){
        for (int x=0; x<100; x++)
        {
            System.out.println(this.getName()+":"+ x);
            try {
            Thread.sleep(this.tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
