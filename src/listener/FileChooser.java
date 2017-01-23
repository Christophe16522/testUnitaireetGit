/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Interface.PointageMultipleEntre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author ITU
 */
public class FileChooser implements ActionListener{

    PointageMultipleEntre t;

    public FileChooser(PointageMultipleEntre t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       JFileChooser fileChooser = new JFileChooser();
        //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(t);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            System.out.println("Selected file: " + selectedFile.getName());
        }
    }
    
}
