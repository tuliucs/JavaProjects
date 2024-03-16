/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellothread;

/**
 *
 * @author Tuliux
 */
public class HelloThread extends Thread {


public static void main(String args[]) {
HolaHilo a = new HolaHilo();
HolaHilo c = new HolaHilo();
SaludoDos b= new SaludoDos();
a.start();
b.start();
c.start();
}
}

