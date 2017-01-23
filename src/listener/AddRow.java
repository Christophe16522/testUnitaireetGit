/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Interface.PointageMultipleEntre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ITU
 */
public class AddRow implements ActionListener{

    PointageMultipleEntre t;

    public AddRow(PointageMultipleEntre t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.model.addRow(new Object[]{"Matricule", "Nom Complet", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche", "Pointer"});
    }
    
}
