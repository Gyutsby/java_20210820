package com.example.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import com.example.mongodb.itemdb;
import com.example.vo.item;

// 지금 현재 적용되어있는 방식은 3번 째 방식 바로 리스너를 만들어서 this이용해 바로 넣었다.
// 또 다른 방법은 변수를 만드는 것
// 또 다른 방법은 this들어 가있는 위치에 그냥 바로 @Override를 넣는 것이다.
public class mypanel0 extends JPanel implements ActionListener {
    private JTextField field0 = null;
    private JTextField field1 = null;
    private JTextField field2 = null;
    private JTextField field3 = null;
    private JTextField field4 = null;
    private JButton button = null;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int code = Integer.parseInt(field0.getText());
            String name = field1.getText();
            String text = field2.getText();
            int price = Integer.parseInt(field3.getText());
            int quantity = Integer.parseInt(field4.getText());

            item item = new item(code, name, text, price, quantity);
            itemdb db = new itemdb();
            int ret = db.insertitem(item);
            if (ret == 1) {
                JOptionPane.showMessageDialog((this), "물품등록성공", "성공", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog((this), "물품등록실패", "성공", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public mypanel0() {
        super();

        this.setLayout(null);
        JLabel bel = new JLabel("물품번호 : ");
        bel.setBounds(10, 20, 100, 30);
        field0 = new JTextField();
        field0.setBounds(80, 20, 100, 30);

        JLabel bel1 = new JLabel("물품명 : ");
        bel1.setBounds(10, 60, 100, 30);
        field1 = new JTextField();
        field1.setBounds(80, 60, 100, 30);

        JLabel bel2 = new JLabel("물품내용 : ");
        bel2.setBounds(10, 100, 100, 30);
        field2 = new JTextField();
        field2.setBounds(80, 100, 100, 30);

        JLabel bel3 = new JLabel("물품가격 : ");
        bel3.setBounds(10, 140, 100, 30);
        field3 = new JTextField();
        field3.setBounds(80, 140, 100, 30);

        JLabel bel4 = new JLabel("물품수량 : ");
        bel4.setBounds(10, 200, 100, 30);
        field4 = new JTextField();
        field4.setBounds(80, 200, 100, 30);

        button = new JButton("물품등록");
        button.setBounds(10, 260, 100, 30);

        button.addActionListener(this);

        this.add(bel);
        this.add(field0);

        this.add(bel1);
        this.add(field1);

        this.add(bel2);
        this.add(field2);

        this.add(bel3);
        this.add(field3);

        this.add(bel4);
        this.add(field4);

        this.add(button);
    }
}
