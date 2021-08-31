package com.example.gui;

import java.util.List;
import java.util.Vector;

import javax.print.DocFlavor.STRING;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.example.mongodb.itemdb;
import com.example.vo.item;

public class mytable extends JTable {
    private itemdb db = null;

    private List<item> list = null;

    // 새로운 생성자 생성
    public mytable() {

        this.db = new itemdb();
        this.list = db.findallitems();

        // 스스로 데이터를 추가하는 방법
        this.setModel(setData());
    }

    // 데이터 삭제
    public void deleteitem() {
        int[] rows = this.getSelectedRows();
        if (rows.length <= 0) {
            JOptionPane.showMessageDialog(this, "항목을 선택하세요", "항목선택", JOptionPane.ERROR_MESSAGE);
        }
        for (int row : rows) {
            String code = this.getModel().getValueAt(row, 0).toString();
            db.deleteitem(Integer.parseInt(code));

            // 새로운 데이터를 가져와서 다시 생성.
            this.list = db.findallitems();
            this.setModel(setData());
        }
    }

    public void updateitem() {
        for (int i = 0; i < this.getRowCount(); i++) {
            String code = this.getModel().getValueAt(i, 0).toString();
            String name = this.getModel().getValueAt(i, 1).toString();
            String text = this.getModel().getValueAt(i, 2).toString();
            String price = this.getModel().getValueAt(i, 3).toString();
            String quantity = this.getModel().getValueAt(i, 4).toString();

            item item = new item(Integer.parseInt(code), name, text, Integer.parseInt(price), Long.parseLong(quantity));

            db.updateitem(item);

        }
    }

    public DefaultTableModel setData() {

        String header[] = { "번호", "물품명", "내용", "가격", "수량" };
        String content1[][] = new String[list.size()][5];

        for (int i = 0; i < list.size(); i++) {
            item tmp = list.get(i); // 리스트에서 1개 가져오기

            content1[i][0] = String.valueOf(tmp.getCode());
            content1[i][1] = tmp.getName();
            content1[i][2] = tmp.getText();
            content1[i][3] = String.valueOf(tmp.getPrice());
            content1[i][4] = String.valueOf(tmp.getQuantity());
        }

        DefaultTableModel tm = new DefaultTableModel(content1, header);
        return tm;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return true; // false 편집불가 true 편집가능
    }

}
