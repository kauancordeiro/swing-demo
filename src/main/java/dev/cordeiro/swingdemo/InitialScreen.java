package dev.cordeiro.swingdemo;

import javax.swing.*;
import java.awt.*;

public class InitialScreen {
    public static void main(String[] args) {
        Init init = new Init();
    }
}

class Init extends JFrame{
    public Init(){
        JButton btnInit = new JButton("Init form");

        btnInit.addActionListener(e -> {
            new RadioButtonDemo();
            dispose();
        });


        add(btnInit);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
