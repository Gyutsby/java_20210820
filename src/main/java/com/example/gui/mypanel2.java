package com.example.gui;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.example.mongodb.itemdb;
import com.example.vo.item;

public class mypanel2 extends JPanel implements ActionListener {

    // 변수만들기 초기값은 0 or null
    private JButton button1 = null;
    private JButton button2 = null;
    private JLabel a1 = null;
    private mytable table = null;

    public mypanel2() {
        super();

        this.setLayout(new BorderLayout());

        a1 = new JLabel("위쪽");
        this.add(a1, BorderLayout.NORTH);

        this.table = new mytable();
        JScrollPane jscp1 = new JScrollPane(table);
        this.add(jscp1, BorderLayout.CENTER);

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        button1 = new JButton("수정");
        button2 = new JButton("삭제");

        button1.addActionListener(this);
        button2.addActionListener(this);

        p1.add(button1);
        p1.add(button2);
        this.add(p1, BorderLayout.SOUTH);

        JLabel a4 = new JLabel("왼쪽");
        this.add(a4, BorderLayout.WEST);

        JLabel a5 = new JLabel("오른쪽");
        this.add(a5, BorderLayout.EAST);

    }

    // 여기가 버튼클릭 같은 이벤트 발생시 자동으로 호출되는 메소드
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            table.updateitem();
        }

        else if (e.getSource() == button2) {
            int ret = JOptionPane.showConfirmDialog(null, "삭제하시겠습니까", "삭제", JOptionPane.OK_CANCEL_OPTION);
            if (ret == 0) {
                table.deleteitem();
            }
        }
    }
}