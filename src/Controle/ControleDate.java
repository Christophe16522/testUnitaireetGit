/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author ITU
 */
public class ControleDate {
    public String[] getDateSplit(String date) 
    {

        String[] separateur = date.split("[\\-\\/\\.\\*\\#]");

        return separateur;
    }

    public String transformDate(String daty) {
        String rep = "";
        String sep = "-";
        String date[] = this.getDateSplit(daty);
        rep = date[0];
        for (int i = 1; i < 3; i++) {
            rep = rep + sep + date[i];
        }
        System.out.println(rep);
        return rep;
    }
    
}
