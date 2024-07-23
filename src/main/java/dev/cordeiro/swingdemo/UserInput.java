package dev.cordeiro.swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UserInput {
    public static void main(String[] args) {
        RadioButtonDemo radioButtonDemo = new RadioButtonDemo();
    }

}

class RadioButtonDemo extends JFrame{

    JTextField txtField;
    JButton btn;
    JRadioButton r1,r2;
    JLabel lbl;
    JLabel lblName;
    JCheckBox c1, c2;


    public RadioButtonDemo()
    {
        txtField = new JTextField(15);
        btn = new JButton("Insert");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("Fighting");
        c2 = new JCheckBox("Studying");

        lbl = new JLabel("Hello ");
        lblName = new JLabel();

        ButtonGroup buttonGroup = new ButtonGroup(); // adiciona os radiobuttons a um grupo para que só um possa ser selecionado
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        add(txtField);
        add(btn);
        add(r1);
        add(r2);
        add(lbl);
        add(c1);
        add(c2);
        add(lblName);

        c1.addItemListener(e ->{
            System.out.println("FIGHT");
        });
        c2.addItemListener(e ->{
            System.out.println("STUDY");
        });

        btn.addActionListener(a -> {
            String greeting = txtField.getText();
            if(r1.isSelected()) {
                greeting = "Mr. " + greeting;
            }else{
                greeting = "Ms. " + greeting;
            }

            if(c1.isSelected()){
                greeting += " Fighter";
            }
            if(c2.isSelected()){
                greeting += " Studant";
            }


            lblName.setText(greeting);
        });


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }
}
