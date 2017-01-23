/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Base.ConnexionPostgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author ITU
 */
public class Retard 
{
    static Connection conn;
    static PreparedStatement pst;
    static Statement stmt;
    //public static boolean getRetard;
    //double ty fonction ty talo fa novana int
    public static double getRetard(String debut,String ariver)
    {
        Time td = Time.valueOf(debut);
        Time ta = Time.valueOf(ariver);
        double retard;
        retard = ((ta.getTime()-td.getTime()))/3600000.0f;
        //retard = (int) (((ta.getTime()-td.getTime()))/(60 * 1000) % 60);
        //System.out.println(retard);
        //JOptionPane  jop2 = new JOptionPane(); 
        //jop2.showMessageDialog(null, "Retard de "+retard+" Heure", "Attention", JOptionPane.WARNING_MESSAGE); 
        return retard;
    }
    
    public static void insertRetard(String idEmp,String retard)
    {
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
            LocalDate date = LocalDate.now();
            req = "INSERT INTO public.retard(idemployer, dateretard, tempsretard)VALUES ('"+idEmp+"','"+date+"','"+retard+"');";       
            stmt = conn.createStatement();
            stmt.executeUpdate(req);
            stmt.close();
            conn.commit();
            conn.close();
        }
       catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
