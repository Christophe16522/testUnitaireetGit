/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertion;

import Fonction.Fonction;
import java.text.ParseException;

/**
 *
 * @author ITU
 */
public class Pointage 
{
    public static void presence(String idEmp,String heure,String type,String date) throws ParseException
    {
        Fonction f = new Fonction();
        //Fonction fonct = new Fonction();
        int p = f.firstPoint(idEmp);
        //String id = idEmp.toString();
        //Efa npointe?
        if(p>=1)
        {
           System.out.print("efa npointe"); 
           f.insertPresence(idEmp,type,heure,date);
        }
        else
        {
            System.out.print("mbola tsy npointe\n");
            if(f.canPoint(idEmp,heure)==true)
            {
                System.out.print("Afaka mpointe");
                f.insertPresence(idEmp,type,heure,date);
            }
            else
            {
                System.out.print("Tsy Afaka mpointe tsony rapisto ndray");
            }
        }
        //System.out.print(f.firstPoint(idEmp));
    }
}
