/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Base.ConnexionPostgres;
import static Gestion.Retard.conn;
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
public class HeureSup {
    static Connection conn;
    static PreparedStatement pst;
    static Statement stmt;
    public double getSup(String fin,String sorti)
    {
        Time td = Time.valueOf(fin);
        Time ta = Time.valueOf(sorti);
        double sup;
        sup = ((ta.getTime()-td.getTime()))/3600000.0f;
        //System.out.println(sup);
        JOptionPane  jop2 = new JOptionPane(); 
        jop2.showMessageDialog(null, "Heure Sup de "+sup+" Heure", "Attention", JOptionPane.INFORMATION_MESSAGE); 
        return sup;
    }
    public static void insertSup(String idEmp,String sup)
    {
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
            LocalDate date = LocalDate.now();
            req = "INSERT INTO public.heuresup(idemployer, dateheuresup, nombreheuresup)VALUES ('"+idEmp+"','"+date+"','"+sup+"');";       
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
