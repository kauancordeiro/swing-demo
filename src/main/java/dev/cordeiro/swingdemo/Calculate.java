package dev.cordeiro.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate
{
    public static void main(String[] args) {
        AddSub addSub = new AddSub();
    }


}

class AddSub extends JFrame{

    JTextField t1, t2;
    JButton b1,b2;
    JLabel lbl;


    public AddSub() {

        t1 = new JTextField(15);
        t2 = new JTextField(15);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");

        lbl = new JLabel("Final result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(lbl);


        b1.addActionListener( e -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int result = num1 + num2;

            lbl.setText(result + "");
        });
        b2.addActionListener( e -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int result = num1 - num2;

            lbl.setText(result + "");
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
