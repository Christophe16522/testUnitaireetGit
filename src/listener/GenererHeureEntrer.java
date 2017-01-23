/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Fonction.Fonction;
import Heure.FonctionDate;
import Interface.PointageMultipleEntre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ITU
 */
public class GenererHeureEntrer implements ActionListener {

    PointageMultipleEntre t;
    Fonction f = new Fonction();
    String heure = null;

    public GenererHeureEntrer(PointageMultipleEntre t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < t.data.length; i++) {
            heure = f.getEntrer(t.table.getValueAt(i, 0).toString());

            //for (int j = 2; j < 15; j++) {
                //System.out.println(t.model.getValueAt(3,0).toString());
            //}

        }
        t.model.fireTableStructureChanged();
    }

}
