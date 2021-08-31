package com.example.gui;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class myframe extends JFrame {

    public myframe(String title) throws HeadlessException {
        super(title);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("물품등록", new mypanel0());
        tabbedPane.add("물품수정", new mypanel1());
        tabbedPane.add("물품목록", new mypanel2());

        tabbedPane.setSelectedIndex(2);
        this.add(tabbedPane);

        this.setSize(500, 400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // mypanel0 nel0 = new mypanel0();
        // this.add(nel0);

        // mypanel1 nel1 = new mypanel1();
        // this.add(nel1);
        // this.setSize(400, 300);
        // this.setVisible(true);

        // mypanel2 nel2 = new mypanel2();
        // this.add(nel2);
        // this.setSize(300, 200);
        // this.setVisible(true);

        // 닫기 버튼시 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
