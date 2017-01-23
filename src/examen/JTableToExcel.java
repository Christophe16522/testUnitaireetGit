/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Lai.C
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;

public class JTableToExcel extends JFrame {

    JTable myTable;
    public JTextField nom = new JTextField(30);
    String titre[] = {"Pays", "Capitales"};
    Object[][] data = {{"Japon", "Tokyo"}, {"Espagne", "Madrid"}, {"France", "Paris"}};
    DefaultTableModel tabModel;

    public JTableToExcel() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel main = new JPanel();
        myTable = new JTable(new DefaultTableModel(data, titre));
        JButton btnExport = new JButton("Exporter");
        p1.add(myTable);
        p2.add(btnExport);
        p3.add(nom);
        
        main.add(p3, BorderLayout.NORTH);
        main.add(p1, BorderLayout.NORTH);
        main.add(p2, BorderLayout.SOUTH);
        add(main);

        btnExport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // Créer un fichier excel dans le dossier local avec le contenu de la JTable 
                exporter(myTable, new File(nom.getText()+".xls"));
            }
        });
        setTitle("Exporter JTable vers Excel");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    public void exporter(JTable table, File file) {
        try {

            TableModel model = table.getModel();
            FileWriter out = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {
                out.write(model.getColumnName(i) + "\t");
            }
            out.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    out.write(model.getValueAt(i, j).toString() + "\t");
                }
                out.write("\n");
            }

            out.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] arg) {
        JTableToExcel tab = new JTableToExcel();
        tab.setVisible(true);
        tab.setSize(350, 150);

    }

}
