/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Fonction.Fonction;
import Interface.PointageMultipleEntre;
import Mapping.InfosEmp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;

/**
 *
 * @author ITU
 */
public class RefreshEntrer implements ActionListener {

    Fonction f = new Fonction();
    public InfosEmp[] emp = f.selectInfosEmp();
    PointageMultipleEntre t;
    public JTable table;
    public Object[][] data;
    ResultSet rs = null;
    Statement statement;

//    public RefreshEntrer(PointageMultipleEntre t) {
//        this.t = t;
//    }
    public RefreshEntrer(PointageMultipleEntre t) {
        this.t = t;

    }

    public RefreshEntrer(JTable table) {
        this.table = table;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            //        data = new Object[emp.length][10];
//
//        int i = 0;
//        for (InfosEmp ep : emp) {
//            data[i][0] = ep.getIdemployer();
//            data[i][1] = ep.getNomemployer().trim();
//            data[i][2] = ep.getHeuredebut();
//            data[i][3] = ep.getHeuredebut();
//            data[i][4] = ep.getHeuredebut();
//            data[i][5] = ep.getHeuredebut();
//            data[i][6] = ep.getHeuredebut();
//            data[i][7] = ep.getHeuredebut();
//            data[i][8] = ep.getHeuredebut();
//            data[i][9] = false;
//            i++;
//
//        }
////        for (int i = 2; i < 9; i++) {
////            t.columnNames[i] = "test : "+i;
////        }
//
//        t.model.setValueAt("test",1,1);
//        //t.model.setColumnIdentifiers(t.columnNames);
//        t.model.fireTableStructureChanged();
           // rs = statement.executeQuery("select * from employer");
         //   table.setModel(DbUtils.resultSetToTableModel(rs));
      
    }

}
