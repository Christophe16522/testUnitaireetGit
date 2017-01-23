/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelPointage;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Lai.C
 */
public class FonctionModel {
      public static void exporter(JTable table, File file) {
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
}
