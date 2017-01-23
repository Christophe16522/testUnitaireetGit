/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import Controle.ControleDate;
import Controle.ControleEmployer;
import Fonction.CalculeSalaire;
import Fonction.Fonction;
import Gestion.HeureSup;
import Gestion.Retard;
import InfosEmployer.Gain;
import Insertion.Pointage;
import Interface.PointageMultipleEntre;
import java.text.ParseException;

/**
 *
 * @author ITU
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        //new Menu().setVisible(true);
        new PointageMultipleEntre().setVisible(true);
        //new TableRetard().setVisible(true);
        //new Graphe().setVisible(true);
        Fonction f = new Fonction();
        
        //System.out.println(f.countFerier());
        //System.out.println(f.empExistByidName(1, "Randria"));
        //f.selectFerier();
        ControleDate cd = new ControleDate();
        ControleEmployer ce = new ControleEmployer();
        //f.firstPoint(1);
       // ce.empExist("1");
        //cd.transformDate("2016/12*14");
       CalculeSalaire cs = new CalculeSalaire();
       Gain g = new Gain();
       Retard r = new Retard();
       HeureSup hs = new HeureSup();
       Pointage p = new Pointage();
       //p.presence("1", "18:00:00", "E", "2016/11/17");
       //f.canPoint("1", "13:00:00");
       //r.insertRetard("2","09.78");
       //f.getEntrer("1");
       //f.getSortie("1");
       //r.getRetard(f.getEntrer("1"), "09:02:00");
       //g.salaireEmployer("1");
       //System.out.println(cs.salaireHoraire(140000));
       //System.out.println(cs.retenueCnaps(140000));
      //hs.getSup("17:00:00", "13:00:00");
      //hs.insertSup("2","1.02");
     // JOptionPane  jop2 = new JOptionPane(); 
      //jop2.showMessageDialog(null, "Retard de 2.00 Heure", "Attention", JOptionPane.WARNING_MESSAGE); 
    }
    
}
