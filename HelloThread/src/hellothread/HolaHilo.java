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
public class HolaHilo extends Thread{
    @Override
public void run() {
    this.setName("Saludo2 ");
   
    for (int x=0; x<100; x++){
        System.out.println(this.getThreadGroup()+": Hello from a thread!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HolaHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
}
