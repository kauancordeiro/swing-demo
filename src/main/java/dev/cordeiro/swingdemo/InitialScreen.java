package dev.cordeiro.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialScreen {
    public static void main(String[] args) {
        Init init = new Init();
    }
}

class Init extends JFrame implements ActionListener{

    int i;
    JProgressBar jProgressBar;
    JButton btnInit;
    Timer timer;

    public Init() {
         btnInit = new JButton("Init form");
         jProgressBar = new JProgressBar(0, 20);
         timer = new Timer(250, this);
         int i = 0;



        btnInit.addActionListener(e -> {
            timer.start();
        });


        add(btnInit);
        add(jProgressBar);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(i == 20){
            new RadioButtonDemo();
            dispose();
        }
        i++;
        jProgressBar.setValue(i);

    }
}
