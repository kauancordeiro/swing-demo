package dev.cordeiro.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseDemo {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
    }


}

class Mouse extends JFrame{

    public Mouse(){

        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e){
                int x = e.getX();
                int y = e.getY();

                System.out.println(x + "," + y);
            }

        });




        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
