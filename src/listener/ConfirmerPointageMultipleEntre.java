/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import Fonction.Fonction;
import Gestion.Retard;
import Insertion.Pointage;
import Interface.AddEmp;
import Interface.PointageMultipleEntre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ITU
 */
public class ConfirmerPointageMultipleEntre implements ActionListener {

    PointageMultipleEntre t;
    Pointage p = new Pointage();
    Fonction f = new Fonction();
    Retard r = new Retard();
    double retard;
    String[] ret;

    public ConfirmerPointageMultipleEntre(PointageMultipleEntre t) {
        this.t = t;
    }

    public void actionPerformed(ActionEvent arg0) {
        String str = "";
        String typePoint = "";
        int l = 0;
        retard = 0;
        if (t.type.getSelectedItem().toString().equals("Entrée")) {
            typePoint = "E";
        } else if (t.type.getSelectedItem().toString().equals("Sortie")) {
            typePoint = "S";
        }
        for (int i = 0; i < t.data.length; i++) {
            if ((Boolean) t.table.getValueAt(i, 10)) {
                try {
                    if (Fonction.empExistByidName((int) t.table.getValueAt(i, 0), t.table.getValueAt(i, 1).toString())) {
                        for (int j = 2; j < 9; j++) {
                            if (!t.table.getValueAt(i, j).equals("")) {
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                try {
                                    //p.presence(t.table.getValueAt(i, 0).toString(), t.table.getValueAt(i, j).toString(),typePoint, t.columnNames[j].toString());
                                    //System.out.println("insert : " + t.table.getValueAt(i, 0).toString() + t.table.getValueAt(i, j) + FonctionDate.isValidDate(t.columnNames[j].toString()) + typePoint);
                                    //double retTmp = r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i, j).toString());
                                    //System.out.println("Retard : "+ retTmp);
                                    //System.out.println("fidirana : " + f.getEntrer(t.table.getValueAt(i, 0).toString()));
                                   // System.out.println("Retard : "+ r.getRetard("19:00:00", t.table.getValueAt(i, j).toString()));
                                    //ret[i] = String.valueOf(retard += r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i, j).toString()));
                                   
                                         //retard += r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i,j).toString());
                                        retard = 0;
                                         for(j=2;j<9;j++){
                                            //System.out.println("retard chaque jour "+ r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i,j).toString()));
                                              retard += r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i,j).toString());
                                         }
//                                        System.out.println("Retard = ["+i+"]"+retard);
//                                        System.out.println("\n");
                                        t.table.setValueAt(retard, i, 9);
//                                    if (r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i, j).toString()) != 0) {
//                                        t.table.setValueAt(r.getRetard(f.getEntrer(t.table.getValueAt(i, 0).toString()), t.table.getValueAt(i, j).toString()), i, 9);
//                                    }

                                    // System.out.println("retard : " + );
                                    //System.out.println("value at : "+t.table.getValueAt(i, 9));
//                                    if (t.table.getValueAt(i, 9) != null) {
//                                        // misy an le exception fa mande mila dinihina kely                                           
//                                        t.table.setValueAt(t.table.getValueAt(i, 9).toString(), i, 8);
//                                    }

                                } catch (Exception e) {
                                    //System.out.println("exec date pour " + t.columnNames[j].toString());
                                    JOptionPane jop2 = new JOptionPane();
                                    jop2.showMessageDialog(null, "Exception Date pour " + t.columnNames[j].toString(), "Infos", JOptionPane.ERROR_MESSAGE);

                                }
                               
                            }
                            //System.out.print(retard+"\n");
                            //System.out.print("taille table = "+l);

                        }
                    }
//                    System.out.print(retard);
                    t.model.fireTableStructureChanged();
                } catch (Exception e) {
                    //System.out.println(e.getMessage() + " Voulez vous creer l'Utilisateur? " + t.table.getValueAt(i, 1).toString());
                    JOptionPane jop = new JOptionPane();
                    int option = jop.showConfirmDialog(null, "Voulez vous Enregistre ?" + t.table.getValueAt(i, 1).toString(), "Enregistrez Employe", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (option == JOptionPane.OK_OPTION) {
                        //System.out.println("New Emp("+t.table.getValueAt(i, 1).toString()+")");
                        new AddEmp(t.table.getValueAt(i, 1).toString()).setVisible(true);
                    }
                }

                //System.out.println("id Ligne Credit = "+t.table.getValueAt(i, 0)+" Montant Engager = "+t.table.getValueAt(i, 3));
                //str += t.table.getValueAt(i, 0) + ":" + t.table.getValueAt(i, 4) + ":"+ t.table.getValueAt(i, 1)+ ";";
            }
        }
        String lc = str;
        double somme = 0;
        for (String ligne : lc.split(";")) {
            //System.out.println("id ligne CRedit "+ligne);
            String[] detlic = ligne.split(":");

            //System.out.println("id lc "+detlic[0]);
            //System.out.println("montant "+detlic[1]);
            // System.out.println("INSERT INTO ENGAGERCREDIT VALUES(S_ENGAGERCREDIT.NEXTVAL,4,"+detlic[0]+","+detlic[1]+",0,0);");
            //somme += Double.valueOf(detlic[1]);
            //System.out.println("Numero de Compte"+detlic[2]);
        }
        //System.out.println("somme  " + somme);
        // new Engagement().setVisible(true);

        //t.eng.setText(str);
        //t.eng.setMontant(String.valueOf(somme));
        //t.setVisible(false);
        //t.dispose();
    }
}
