package dev.cordeiro.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGui {

    public static void main(String[] args) {
        Addition ad = new Addition();
    }
}

class Addition extends JFrame {

    JTextField t1, t2;
    JButton b1;
    JLabel lblResult;

    public Addition(){

         t1 = new JTextField(20);
         t2 = new JTextField(20);

         lblResult = new JLabel("Result");
         b1 = new JButton("Ok");


        add(t1);
        add(t2);
        add(lblResult);
        add(b1);


        b1.addActionListener( actionListener -> {  // action listener usando expressão lambda
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = num1 + num2;
            lblResult.setText(result + "");
        }); // é uma interface ao implementar eu preciso sobreescrever o método actionPerformed

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(250,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }


}
