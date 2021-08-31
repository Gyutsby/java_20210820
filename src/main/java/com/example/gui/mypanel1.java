package com.example.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class mypanel1 extends JPanel {

    public mypanel1() {
        super();

        this.setLayout(null);
        JLabel bel = new JLabel();
        bel.setBounds(10, 20, 100, 30);

        JTextField fie = new JTextField();
        fie.setBounds(10, 20, 100, 30);

        this.add(bel);
        this.add(fie);

    }

}
