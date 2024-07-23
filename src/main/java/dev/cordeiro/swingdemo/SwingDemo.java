/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dev.cordeiro.swingdemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kauan
 */
public class SwingDemo {

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
     
        
        
       
    }
}
class HelloWorld extends JFrame{
    
    public HelloWorld(){
        
      
        JLabel lbl = new JLabel("Hello World");
        JLabel lbl1 = new JLabel("Second Text");
        add(lbl);
        add(lbl1);


        
        
        
    }
  
}
