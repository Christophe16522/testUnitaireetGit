/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author ITU
 */
public class Maintenant {
    public String getHeure()
    {
        DateFormat df = new SimpleDateFormat("HH:mm");
        java.util.Date heure = new java.util.Date();
        return df.format(heure);        
    }
    public String getDate()
    {
        DateFormat df = new SimpleDateFormat("YYYY/MM/dd"); 
        java.util.Date date = new java.util.Date();
        return df.format(date);
    }
}
