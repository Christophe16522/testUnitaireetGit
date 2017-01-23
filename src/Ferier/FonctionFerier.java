/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferier;

import Base.ConnexionPostgres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FonctionFerier {
    static Connection conn;
    static PreparedStatement pst;
    static Statement stmt;
    public static void insertFerier(String dateDebut,String heureDebut,String dateFin,String heureFin,String designation)
    {
        try
        {
            conn = ConnexionPostgres.getConn();
            String req;
            req = "INSERT INTO public.ferier(datedebutferier, heuredebutferier, datefinferier, heurefinferier,designation)VALUES ('"+dateDebut+"','"+heureDebut+"','"+dateFin+"','"+heureFin+"','"+designation+"');";       
            stmt = conn.createStatement();
            stmt.executeUpdate(req);
            stmt.close();
            conn.commit();
            conn.close();
            
        }
       catch(Exception e)
        {
            System.out.println(e);
            JOptionPane  jop2 = new JOptionPane(); 
            jop2.showMessageDialog(null, "Ajout Reussie", "Insertions", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
